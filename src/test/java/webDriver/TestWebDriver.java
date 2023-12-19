package webDriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import webDriver.config.WebDriverProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWebDriver {

    //    WebDriver firefoxDriver = new FirefoxDriver();

    WebDriver driver = new WebDriverProvider().get();


    @Test
    public void testGitHubTitleChrome() {
        driver.get("https://github.com");
        assertEquals("https://github.com/", driver.getCurrentUrl());
        driver.close();
    }

//    @Test
//    public void testGitHubTitleFirefox() {
//        firefoxDriver.get("https://github.com");
//        assertEquals("https://github.com/", firefoxDriver.getCurrentUrl());
//        firefoxDriver.close();
//    }
}
