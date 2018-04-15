package steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageActions.HomePageActions;
import pageActions.LoginPageActions;
import pageActions.MainPageActions;
import util.PropertyHandler;
import util.WebDriverHandler;

/**
 * Created by Vahid on 14/4/18.
 */
public class BaseStep {
    protected WebDriverHandler webDriverHandler = WebDriverHandler.getInstance();
    protected PropertyHandler propertyHandler = PropertyHandler.getInstance();
    protected Logger logger = LoggerFactory.getLogger(BaseStep.class);

    protected MainPageActions mainPageActions = new MainPageActions();
    protected LoginPageActions loginPageActions = new LoginPageActions();
    protected HomePageActions homePageActions = new HomePageActions();

    protected static int index;

    public BaseStep() {
        propertyHandler.loadProperties("features/src/test/resources/properties/props.properties");
        index = Integer.valueOf(propertyHandler.getProperty("unique.id"));
    }

}
