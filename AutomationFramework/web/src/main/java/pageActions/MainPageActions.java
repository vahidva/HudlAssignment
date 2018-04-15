package pageActions;

import pages.MainPage;

/**
 * Created by Vahid on 14/4/18.
 */
public class MainPageActions extends BaseActions{
    @Override
    protected boolean verifyPage() {
        // Sample implementation of verifying a page by URL
        return webDriverHandler.getPageUrl().toLowerCase().contains(MainPage.getPageUrl());
    }

    public void clickOnLogin() {
        webDriverHandler.tap(MainPage.login);
    }
}
