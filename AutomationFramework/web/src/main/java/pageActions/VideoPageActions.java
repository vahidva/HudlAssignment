package pageActions;

import org.openqa.selenium.Keys;
import pages.VideoPage;

/**
 * Created by Vahid on 15/4/18.
 */
public class VideoPageActions extends BaseActions{
    @Override
    protected boolean verifyPage() {
        return false;
    }

    public void findVideoByTitle(String videoTitle) {
        webDriverHandler.waitForElement(VideoPage.getVideoTitle(videoTitle), 300);
    }

    public void shareVideo(String videoTitle, String teamName) {
        webDriverHandler.hoverOnElement(VideoPage.getVideoTitle(videoTitle));
        webDriverHandler.tapByJS(VideoPage.videoShare);

        webDriverHandler.tap(VideoPage.shareWithBox);
        webDriverHandler.sendKeys(VideoPage.shareWithInput, teamName);
        webDriverHandler.pressKey(VideoPage.shareWithInput, Keys.ENTER);
        webDriverHandler.tap(VideoPage.shareWithOthersLabel);

        webDriverHandler.tapByJS(VideoPage.sendAndSaveBtn);

        webDriverHandler.waitForElement(VideoPage.getSharedWithTeamByName(teamName),10);
        webDriverHandler.tap(VideoPage.doneBtn);
    }
}
