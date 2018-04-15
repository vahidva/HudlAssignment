package pages;

import org.openqa.selenium.By;

/**
 * Created by Vahid on 15/4/18.
 */
public class UploadPage {

    public final static By uploadBtn = By.className("upload-file-input");
    public final static By uploadCompleteLabel = By.xpath("//span[text()='Upload Complete']");
    public final static By videoIsWatchableLabel = By.xpath("//span[text()='Your video is watchable now.']");
    public final static By videTitleInput = By.id("video-name__text-input");
    public final static By saveBtn = By.cssSelector("button[data-qa-id='video-details__save-and-continue-btn']");
    public final static By scheduledEventSelect = By.id("scheduled-event__select");


    public static By getEventByName(String eventName) {
        return By.xpath("//div[contains(text(),'"+eventName+"')]");
    }

    public static final By getPageId = By.xpath("//span[text()='Select Files']");
}
