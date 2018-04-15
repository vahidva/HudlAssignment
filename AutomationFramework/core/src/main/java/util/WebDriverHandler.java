package util;

import enums.Browsers;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

/**
 * Created by Vahid on 14/4/18.
 */
public class WebDriverHandler {
    private WebDriverHandler() {
    }

    private static final Logger logger = LoggerFactory.getLogger(WebDriverHandler.class);
    private static WebDriverHandler webDriverHandler;
    private static Browsers browser;
    private static WebDriver driver;
    private static WebDriverWait waitDriver;


    static {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                tearDown();
            }
        });
    }

    public static void initializeBrowser(Browsers selectedBrowser) {
        browser = selectedBrowser;
    }

    public static WebDriverHandler getInstance() {
        if (webDriverHandler == null) {
            webDriverHandler = new WebDriverHandler();
        }
        return webDriverHandler;
    }

    private WebDriver getDriver() {
        if (driver == null)
            driver = initializeDriver();
        waitDriver = new WebDriverWait(driver, 10000);
        return driver;
    }

    private WebDriver initializeDriver() throws WebDriverException {
        if (browser == null) {
            logger.error("Browser not specified!");
            System.exit(0);
        }

        switch (browser) {
            case CHROME:
                return new ChromeDriver(getChromeOptions());
            default:
                logger.error("Browser not specified!");
                System.exit(0);
        }
        return null;
    }

    private static ChromeOptions getChromeOptions() {
        // TODO : should beretrieved from CorePropertyHandler
        System.setProperty("webdriver.chrome.driver", "core/src/main/resources/drivers/chromedriver");
        return new ChromeOptions();
    }

    public void launchWebSite(String urlStr) throws MalformedURLException {
        URL url = new URL(urlStr);
        getDriver().navigate().to(url);
        getDriver().manage().window().maximize();
    }

    public void tap(By by) {
        locateElement(by).click();
    }

    public void tapByAction(By by){
        new Actions(getDriver()).moveToElement(locateElement(by)).click().perform();
    }

    public void hoverOnElement(By by){
        new Actions(getDriver()).moveToElement(locateElement(by)).build().perform();
    }

    public void tapByJS(By by) {
        WebElement element = getDriver().findElement(by);
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].click();", element);
    }

    public void pressKey(By by, Keys keys) {
        locateElement(by).sendKeys(keys);
    }

    public void sendKeys(By by, String data) {
        locateElement(by).sendKeys(data);
    }

    // private wait method used internally for locating elements
    private WebElement locateElement(By by) {
        return waitDriver.until(ExpectedConditions.elementToBeClickable(by));
    }

    // public wait-for-element method to be used with a customized wait
    public WebElement waitForElement(By by, int timeOutInSeconds) {
        return waitDriver.withTimeout(Duration.ofSeconds(timeOutInSeconds))
            .until(ExpectedConditions.elementToBeClickable(by));
    }
    // public wait-for-element method to be used with a customized wait
    public WebElement waitForElement(By by) {
        return waitDriver.until(ExpectedConditions.elementToBeClickable(by));
    }

    public String getPageUrl() {
        return getDriver().getCurrentUrl();
    }

    private static void tearDown() {
        driver.quit();
    }

    public void uploadFileWithPath(By by, String path) {
        File file = new File(path);
        if (!file.exists()) {
            logger.error("File does not exist with path: \n" + path);
            System.exit(0);
        }
        getDriver().findElement(by).sendKeys(file.getAbsolutePath());
    }

    public void selectFromListByText(By by, String listItem) {
        new Select(locateElement(by)).selectByVisibleText(listItem);
    }
}