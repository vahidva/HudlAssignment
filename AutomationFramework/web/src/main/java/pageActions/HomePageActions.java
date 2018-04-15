package pageActions;

import pages.HomePage;

/**
 * Created by Vahid on 15/4/18.
 */
public class HomePageActions extends BaseActions{
    @Override
    protected boolean verifyPage() {
        return webDriverHandler.getPageUrl().toLowerCase().equals(HomePage.getURL().toLowerCase());
    }

    public void navigateToMenuItem(String menuItem) {
        switch (menuItem.toLowerCase()) {
            case "manage team":
                webDriverHandler.tap(HomePage.mainMenuTeam);
                webDriverHandler.tap(HomePage.miTeamManageTeam);
                break;
            case "schedule":
                webDriverHandler.tap(HomePage.mainMenuTeam);
                webDriverHandler.tap(HomePage.miTeamSchedule);
                break;
            case "video":
                webDriverHandler.tap(HomePage.mainMenuVideo);
                break;

            case "upload":
                webDriverHandler.tapByJS(HomePage.uploadBtn);
                new UploadPageActions().verifyPage(true);
                break;
            default:
                logger.error("navigation to menu item: " + menuItem + "not supported");
                System.exit(0);
        }
    }

}
