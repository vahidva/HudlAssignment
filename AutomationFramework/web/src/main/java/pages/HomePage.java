package pages;

import org.openqa.selenium.By;

/**
 * Created by Vahid on 15/4/18.
 */
public class HomePage {
    public final static String getURL() {return "http://www.hudl.com/home";}

    public final static By mainMenuTeam = By.cssSelector("div[data-qa-id='webnav-primarynav-team']");
    public final static By miTeamTeamProfile = By.cssSelector("a[data-qa-id='webnav-primarynav-team']");
    public final static By miTeamManageTeam = By.cssSelector("a[data-qa-id='webnav-primarynav-managemembers']");
    public final static By miTeamSchedule = By.cssSelector("a[data-qa-id='webnav-primarynav-schedule']");

    public final static By mainMenuVideo = By.cssSelector("a[data-qa-id='webnav-primarynav-video']");

    public final static By uploadBtn = By.cssSelector("a[data-qa-id='webnav-globalnav-upload']");
}
