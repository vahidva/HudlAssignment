package pages;

import org.openqa.selenium.By;

/**
 * Created by Vahid on 14/4/18.
 */
public class MainPage {
    public final static By login = By.cssSelector("a[href='/login']");

    public static String getPageUrl() {return "https://www.hudl.com/";}
}
