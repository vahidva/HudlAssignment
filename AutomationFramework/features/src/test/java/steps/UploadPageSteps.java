package steps;

import cucumber.api.java.en.When;
import pageActions.UploadPageActions;

/**
 * Created by Vahid on 15/4/18.
 */
public class UploadPageSteps extends BaseStep{
    private UploadPageActions uploadPageActions = new UploadPageActions();

    @When("^I upload the sample vide with title \"([^\"]*)\" for event \"([^\"]*)\"$")
    public void iUploadTheSampleVideo(String videoTitle, String eventName) throws Throwable{
        videoTitle = videoTitle + index;
        eventName = eventName + index;
        String filePath = propertyHandler.getProperty("video.path");
        uploadPageActions.uploadFileForEvent(filePath, videoTitle, eventName);
    }
}
