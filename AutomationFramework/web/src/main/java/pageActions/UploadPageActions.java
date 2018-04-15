package pageActions;

import pages.UploadPage;

/**
 * Created by Vahid on 15/4/18.
 */
public class UploadPageActions extends BaseActions {
    @Override
    protected boolean verifyPage() {
        return webDriverHandler.waitForElement(UploadPage.getPageId,10) != null;
    }

    public void uploadFileForEvent(String filePath, String videoTitle, String eventName) {
        webDriverHandler.uploadFileWithPath(UploadPage.uploadBtn, filePath);

        webDriverHandler.sendKeys(UploadPage.videTitleInput, videoTitle);
        webDriverHandler.tap(UploadPage.scheduledEventSelect);
        webDriverHandler.tap(UploadPage.getEventByName(eventName));
        webDriverHandler.waitForElement(UploadPage.uploadCompleteLabel, 120);
        webDriverHandler.waitForElement(UploadPage.videoIsWatchableLabel, 60);
        webDriverHandler.tapByJS(UploadPage.saveBtn);
    }

}
