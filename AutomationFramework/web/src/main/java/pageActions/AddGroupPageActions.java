package pageActions;

import pages.AddGroupPage;

/**
 * Created by Vahid on 15/4/18.
 */
public class AddGroupPageActions extends BaseActions {
    @Override
    protected boolean verifyPage() {
        return webDriverHandler.getPageUrl().contains(AddGroupPage.getPageURL());
    }

    public void addNewGroup(String groupName) {
        webDriverHandler.sendKeys(AddGroupPage.groupName, groupName);
        webDriverHandler.tap(AddGroupPage.addGroupBtn);
    }
}
