package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @BeforeAll
    static void browserSettings() {
        Configuration.browser = "FIREFOX";
        Configuration.startMaximized = true;
    }
    @Test
    public void githubTest (){
        open("http://github.com");

        $(".search-input").click();
        $("#query-builder-test").setValue("eroshenkoam/allure-example").pressEnter();
        $(By.linkText("eroshenkoam/allure-example")).click();
        sleep(3000);
        $x("//*[@id=\"issues-tab\"]").click();
//        $(By.partialLinkText("Issues")).click();
        sleep(3000);
        $(withText("#68")).should(Condition.visible);

    }

}
