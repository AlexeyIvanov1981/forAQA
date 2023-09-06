package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {
    @BeforeAll
    static void chooseBrowser() {
        Configuration.browser = "FIREFOX";
        Configuration.browserSize = "1920x1200";
    }

    @Test
    void shouldFindSelenideRepoGithub() {

        open("https://github.com/");

        $(".search-input").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid=results-list]").first().$(".Box-sc-g0xbh4-0").click();
        $(byText("Pull requests")).shouldBe(Condition.visible);
    }
}