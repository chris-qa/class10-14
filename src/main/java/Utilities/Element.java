package Utilities;

import Helpers.Driver;
import org.openqa.selenium.By;

public class Element {
    public static String getText(By by) {
        ElementUtils.elementToBeClickable(by);
        ElementUtils.scrollTo(by);
        return Driver.driver.findElement(by).getText();
    }
}
