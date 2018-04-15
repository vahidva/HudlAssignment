package pages;

import org.openqa.selenium.By;

/**
 * Created by Vahid on 14/4/18.
 */
public class LoginPage{

    public final static By email = By.id("email");
    public final static By password = By.id("password");
    public final static By logIn = By.id("logIn");

    public static By getPageID() {
        return logIn;
    }
}
