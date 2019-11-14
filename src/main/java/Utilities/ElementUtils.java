package Utilities;

import Helpers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ElementUtils {
    // Clickable
    public static boolean elementToBeClickable(By locator) {
        WebDriverWait w = new WebDriverWait(Driver.driver, 25);
        w.until(ExpectedConditions.elementToBeClickable(locator));
        return true;
    }
    public static void elementToBeClickable(WebElement element) {
        WebDriverWait w = new WebDriverWait(Driver.driver, 25);
        w.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void scrollTo(By by) {
        WebDriverWait wait = new WebDriverWait(Driver.driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        WebElement element = Driver.driver.findElement(by);
        Actions actions = new Actions(Driver.driver);
        actions.moveToElement(element);
        actions.perform();
    }
    public static void scrollTo(WebElement element) {
        Actions actions = new Actions(Driver.driver);
        actions.moveToElement(element);
    }
    public static void click(By locator) {
        elementToBeClickable((locator));
        scrollTo(locator);
        Driver.driver.findElement(locator).click();
        Driver.driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }
    public static void click(WebElement element) {
        elementToBeClickable(element);
        scrollTo(element);
        element.click();
        Driver.driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }
}
