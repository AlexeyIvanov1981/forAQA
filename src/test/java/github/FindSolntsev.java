package github;

import aqa.alex.cingo.tests.TestConfig;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FindSolntsev extends TestConfig {


    @Test
    void find() {
        open("https://github.com/selenide/selenide");

        $(".Layout-sidebar").$(byText("Contributors")).closest("div")
                .$("ul li").hover();

        $(".Layout-sidebar .BorderGrid-cell ul li").hover();

//        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

        $(".Popover-message .d-flex .Link--secondary").shouldHave(text("Andrei Solntsev"));

        sleep(5000);
    }
}
