package pageActions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.WebDriverHandler;

/**
 * Created by Vahid on 14/4/18.
 */
public abstract class BaseActions {
    Logger logger = LoggerFactory.getLogger(BaseActions.class);
    WebDriverHandler webDriverHandler = WebDriverHandler.getInstance();

    // Page specific method to verify the current page.
    // Suggested options for implementation are either validating the page URL or locating a unique element
    protected abstract boolean verifyPage();

    public boolean verifyPage(boolean exitOnFailure) {
        boolean verified = verifyPage();
        if (!verified) {
            logger.error("Page not loaded!");
            if (exitOnFailure)
                System.exit(0);
        }
        return verified;
    }

}
