package pageActions;

import org.openqa.selenium.Keys;
import pages.SchedulePage;

/**
 * Created by Vahid on 15/4/18.
 */
public class SchedulePageActions extends BaseActions{
    @Override
    protected boolean verifyPage() {
        return webDriverHandler.waitForElement(SchedulePage.getPageId(),10) != null;
    }

    public void addEvent(String eventName) {
        webDriverHandler.tap(SchedulePage.practiceBtn);
        webDriverHandler.sendKeys(SchedulePage.descriptionInput, eventName);
        webDriverHandler.tap(SchedulePage.dateEntry);
        webDriverHandler.pressKey(SchedulePage.dateEntry, Keys.ENTER);
        webDriverHandler.tap(SchedulePage.createEventBtn);
    }

    public void findEvent(String eventName) {
        webDriverHandler.waitForElement(SchedulePage.getEventByName(eventName));
    }
}
