package steps;

import cucumber.api.java.en.Then;
import pageActions.VideoPageActions;

/**
 * Created by Vahid on 15/4/18.
 */
public class VideoSteps extends BaseStep {
    VideoPageActions videoPageActions = new VideoPageActions();

    @Then("^I should see the video with title \"([^\"]*)\"$")
    public void iFindVideoWithTitle(String videoTitle) throws Throwable{
        videoTitle = videoTitle + index;
        videoPageActions.findVideoByTitle(videoTitle);
    }

    @Then("^I share the vide with title \"([^\"]*)\" with team \"([^\"]*)\"$")
    public void iShareVideoWithTitle(String videoTitle, String teamName) throws Throwable{
        videoTitle = videoTitle + index;
        teamName = teamName + index;

        videoPageActions.shareVideo(videoTitle, teamName);
    }
}
