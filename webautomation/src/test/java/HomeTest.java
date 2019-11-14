import Components.Navigation;
import Helpers.Driver;
import Pages.CharterMarketPlace;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest {

    @BeforeTest
    public void setUp() {
        Driver.driver = Driver.getDriver(true,true);
    }

    @Test
    public void HomeTest() {
        Navigation.goToMarketingPage();

        HomePage homePage = new HomePage();
        homePage.printMembershipOptions();
        homePage.printOutTitleOne();
        homePage.printOutContactInfo();

        Navigation.goToCharterMarketPlace();

        CharterMarketPlace charterMarketPlace = new CharterMarketPlace();
        charterMarketPlace.printOutTitleOne();
        charterMarketPlace.printOutTwo();

    }

    @AfterTest
    public void tearDown() {
        if (Driver.driver != null) {
            Driver.driver.quit();
        }

    }
}
