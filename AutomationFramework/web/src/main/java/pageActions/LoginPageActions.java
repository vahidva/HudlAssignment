package pageActions;

import pages.LoginPage;

/**
 * Created by Vahid on 14/4/18.
 */
public class LoginPageActions extends BaseActions{
    @Override
    protected boolean verifyPage() {
        // sample implementation of verifying a page by a unique element
        return webDriverHandler.waitForElement(LoginPage.getPageID(),10) != null;
    }

    public void login(String username, String password) {

        webDriverHandler.sendKeys(LoginPage.email, username);
        webDriverHandler.sendKeys(LoginPage.password, password);
        webDriverHandler.tap(LoginPage.logIn);
    }
}
