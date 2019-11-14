package Pages;

import Helpers.Driver;
import Utilities.Element;
import Utilities.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;

import java.util.List;

public class HomePage {
    private By titleOne = new ByChained(By.className("home-hero"), By.tagName("h1"));
    private By phone = new ByChained(By.id("option_3"), By.tagName("span"));
    private By email = new ByChained(By.id("option_3"), By.tagName("a"));
    private By membership = new ByChained(By.tagName("app-menu-item"), By.cssSelector("div.menu-item > a"));
    private By membershipOptions = new ByChained(By.cssSelector("ul[class='menu-item-container ng-star-inserted']"), By.tagName("li"));

    public void printMembershipOptions() {
        ElementUtils.click(membership);
        List<WebElement> options = Driver.driver.findElements(membershipOptions);

        for (WebElement element : options) {
            System.out.println("Option: " + element.getText());
        }
    }

    public void printOutTitleOne() {
        System.out.println("Found title one: " + Element.getText(titleOne));
    }

    public void printOutContactInfo() {
        System.out.println("Phone: " + Element.getText(phone));
        System.out.println("Email: " + Element.getText(email));
    }
}
