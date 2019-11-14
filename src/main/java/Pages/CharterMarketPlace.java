package Pages;

import Utilities.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByChained;

public class CharterMarketPlace {
    private By titleOneLabel = new ByChained(By.id("image-component"), By.tagName("h1"));
    private By titleTwoLabel = new ByChained(By.id("new_text-component"), By.tagName("h3"));

    public void printOutTitleOne() {
        System.out.println("Title One: " + Element.getText(titleOneLabel));
    }

    public void printOutTwo() {
        System.out.println("Title Two: " + Element.getText(titleTwoLabel));
    }
}
