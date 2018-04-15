package pages;

import org.openqa.selenium.By;

/**
 * Created by Vahid on 15/4/18.
 */
public class AddGroupPage {
    public static final By groupName = By.cssSelector("input[placeholder='Group Name']");
    public static final By addGroupBtn = By.xpath("//span[text()='Add Group']");
    public static String getPageURL() {return "manage/groups/new";}
}
