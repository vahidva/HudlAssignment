package steps;

import cucumber.api.java.en.When;
import pageActions.AddGroupPageActions;
import pageActions.ManageTeamPageActions;

/**
 * Created by Vahid on 15/4/18.
 */
public class ManageTeamPageSteps extends BaseStep{
    private ManageTeamPageActions manageTeamPageActions = new ManageTeamPageActions();
    private AddGroupPageActions addGroupPageActions = new AddGroupPageActions();


    @When("^I create a new team named \"([^\"]*)\"$")
    public void iCreateNewTeam(String teamName) throws Throwable{
        teamName = teamName + index;
        manageTeamPageActions.clickAddGroup(teamName);
        addGroupPageActions.verifyPage(true);
        addGroupPageActions.addNewGroup(teamName);
    }

    @When("^I should see the team named \"([^\"]*)\"$")
    public void findTeamByName(String teamName) {
        teamName = teamName + index;
        manageTeamPageActions.findTeamByName(teamName);
    }
}
