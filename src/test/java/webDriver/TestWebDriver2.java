package webDriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWebDriver2 {

    //    WebDriver firefoxDriver = new FirefoxDriver();

    WebDriver chromeDriver = new ChromeDriver();


    @Test
    public void testGitHubTitleChrome() {
        chromeDriver.get("https://github.com");
        assertEquals("https://github.com/", chromeDriver.getCurrentUrl());
        chromeDriver.close();
    }

//    @Test
//    public void testGitHubTitleFirefox() {
//        firefoxDriver.get("https://github.com");
//        assertEquals("https://github.com/", firefoxDriver.getCurrentUrl());
//        firefoxDriver.close();
//    }
}
