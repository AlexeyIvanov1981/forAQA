package webDriver.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    private WebDriverConfig config;

    public WebDriverProvider() {
        config = new WebDriverConfig();
    }

    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        driver.get(config.baseURL());
        return driver;
    }

    private WebDriver createWebDriver() {
        if (config.getBrowser().equals(Browser.FIREFOX)) {
            return new FirefoxDriver();
        } else {
            return new ChromeDriver();
        }
    }
}
