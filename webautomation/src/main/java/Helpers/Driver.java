package Helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
    public static WebDriver driver;
    public static WebDriver getDriver(boolean isHeadless, boolean isChrome) {
        WebDriverManager.chromedriver().setup();

        if (isChrome) {
            return new ChromeDriver(getChromeOptions(isHeadless));
        }else{
            return new FirefoxDriver(getFirefoxOptions(isHeadless));
        }
    }

    private static ChromeOptions getChromeOptions(boolean isHeadless) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--enable-automation");
        options.addArguments("--window-size=1400x800");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-extensions");

        if (isHeadless) {
            options.addArguments("--headless");
        }
        return options;
    }

    private static FirefoxOptions getFirefoxOptions(Boolean isHeadless) {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("-safe-mode");
        if (isHeadless) {
            firefoxOptions.addArguments("-headless");
        }
        return firefoxOptions;
    }
}
