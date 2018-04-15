package pages;

import org.openqa.selenium.By;

/**
 * Created by Vahid on 15/4/18.
 */
public class ManageTeamPage {
    public static final By addGroupBtn = By.xpath("//span[text()='Add Group']");
    public static By getPageId() {return By.cssSelector("button[data-qa-id='add-team-members-button']");}
    public static By getTeamByName(String teamName) {
        return By.xpath("//span[text()='" + teamName +"']");
    }
}
