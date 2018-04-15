package pages;

import org.openqa.selenium.By;

/**
 * Created by Vahid on 15/4/18.
 */
public class VideoPage {
    public final static By videoShare = By.xpath("//span[text()='Share']");
    public final static By shareWithBox = By.xpath("//div[text()='Search by name…']");
    public final static By shareWithInput = By.className("resizable-input");
    public final static By doneBtn = By.xpath("//span[text()='Done']");
    public final static By sendAndSaveBtn = By.xpath("//button[text()='Send and Save']");
    public final static By shareWithOthersLabel = By.xpath("//span[text()='Share with others']");

    public static By getVideoTitle(String videoTitleStr) {
        String videSelector = "//h4[text()='" + videoTitleStr + "']";
        return By.xpath(videSelector);
    }

    public static By getSharedWithTeamByName(String teamName){
        return By.xpath("//span[text()='" + teamName + "']");
    }
}
