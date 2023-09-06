package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SelenideStepTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";

    @BeforeAll
    static void browserSettings() {
        Configuration.browser = "FIREFOX";
        Configuration.browserSize = "1920x1200";
    }

    @Test
    public void githubTest() {

        step("WWW", () -> {
            open("http://github.com");
        });

        step("WWW" + REPOSITORY, () -> {
            $(".search-input").click();
            $x("//*[@id=\"query-builder-test\"]").setValue(REPOSITORY).pressEnter();
        });

        step("WWW " + REPOSITORY, () -> {
            $(By.linkText(REPOSITORY)).click();
        });

        step("WWW", () -> {
            $x("//*[@id=\"issues-tab\"]").click();
            //        $(By.partialLinkText("Issues")).click();
        });

        step("WWW", () -> {
            $(withText("#68")).should(Condition.visible);
        });
        sleep(3000);
    }
}
