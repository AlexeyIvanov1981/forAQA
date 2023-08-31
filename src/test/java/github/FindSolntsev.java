package github;

import aqa.alex.tests.TestConfig;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
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
