package pageActions;

import pages.ManageTeamPage;

/**
 * Created by Vahid on 15/4/18.
 */
public class ManageTeamPageActions extends BaseActions {
    @Override
    protected boolean verifyPage() {
        return webDriverHandler.waitForElement(ManageTeamPage.getPageId(),10) != null;
    }

    public void clickAddGroup(String groupName) {
        webDriverHandler.tap(ManageTeamPage.addGroupBtn);
    }

    public void findTeamByName(String teamName) {
        webDriverHandler.waitForElement(ManageTeamPage.getTeamByName((teamName)));
    }
}
