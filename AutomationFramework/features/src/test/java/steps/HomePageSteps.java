package steps;

import cucumber.api.java.en.When;

/**
 * Created by Vahid on 15/4/18.
 */
public class HomePageSteps extends BaseStep {
    @When("^I navigate to \"([^\"]*)\" menu item$")
    public void iNavigateToMenuItem(String menuItem) {
        homePageActions.navigateToMenuItem(menuItem);
    }

    @When("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String page) {

        iNavigateToMenuItem(page);
    }


}

