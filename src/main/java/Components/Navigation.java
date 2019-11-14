package Components;

import Helpers.Constants;
import Helpers.Driver;

import java.util.concurrent.TimeUnit;

public class Navigation {

    public static void goToMarketingPage() {
        Driver.driver.get(Constants.MARKETING_BASE_PATH);
        Driver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
    public static void goToCharterMarketPlace(){
        Driver.driver.get(Constants.MARKETING_BASE_PATH + Constants.CHARTER_MARKET_PLACE);
        Driver.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
}
