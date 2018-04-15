package steps;

import cucumber.api.java.en.When;
import pageActions.SchedulePageActions;

/**
 * Created by Vahid on 15/4/18.
 */
public class TeamScheduleSteps extends BaseStep{
    private SchedulePageActions schedulePageActions = new SchedulePageActions();

    @When("^I create a new event named \"([^\"]*)\"$")
    public void iCreateEvent(String eventName) {
        eventName = eventName + index;
        schedulePageActions.verifyPage(true);
        schedulePageActions.addEvent(eventName);
    }

    @When("^I should see the event named \"([^\"]*)\"$")
    public void ifindEvent(String eventName) {
        eventName = eventName + index;
        schedulePageActions.findEvent(eventName);
    }

}
