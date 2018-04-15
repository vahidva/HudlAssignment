package pages;

import org.openqa.selenium.By;

/**
 * Created by Vahid on 15/4/18.
 */
public class SchedulePage {
    public static final By practiceBtn = By.id("practice");
    public static final By descriptionInput = By.id("description");
    public static final By dateEntry = By.id("entryDate");
    public static final By createEventBtn = By.id("submitButton");

    public static By getEventByName(String eventName) {
//        return By.xpath("//div[text()='" + eventName +"']");
        return By.xpath("//div[contains(text(),'"+eventName+"')]");
    }
    public static By getPageId(){return createEventBtn;}
}
