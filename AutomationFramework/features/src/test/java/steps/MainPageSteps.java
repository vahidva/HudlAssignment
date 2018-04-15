package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import enums.Browsers;

/**
 * Created by Vahid on 14/4/18.
 */
public class MainPageSteps extends BaseStep {
    @After
    public void tearDown() {
        propertyHandler.setProperty("unique.id", String.valueOf(index +1) );
    }

    @Given("^I launch \"([^\"]*)\" website in \"([^\"]*)\"$")
    public void i_launch_website(String website, String browser) throws Throwable {
        String url = propertyHandler.getProperty(website.toLowerCase() + ".url");
        webDriverHandler.initializeBrowser(Browsers.valueOf(browser.toUpperCase()));
        logger.info("Launching url: " + url + " in browser: " + browser);
        webDriverHandler.launchWebSite(url);
        mainPageActions.verifyPage(true);

    }

    @Given("^I log in$")
    public void iLogIn() throws Throwable{
        String username  = propertyHandler.getProperty("username");
        String password = propertyHandler.getProperty("password");
        mainPageActions.clickOnLogin();
        loginPageActions.verifyPage(true);
        loginPageActions.login(username, password);
    }
}
