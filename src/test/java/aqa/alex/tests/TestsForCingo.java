package aqa.alex.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestsForCingo extends TestConfig {


    private String url = "https://app.dev.cingo.co/";
    private String userNameForLogin = "Tester11";
    private String passwordForLogin = "Test123456!";
    private String numberForCode = "0";


    @Test
    void registrationCingo() {
        // Open site
        open(url);
        // Fill in all fields of the registration form
        $("input[data-testid=\"first_name\"]").setValue("Alex");
        $("input[data-testid=\"last_name\"]").setValue("Good");
        $("input[data-testid=\"username\"]").setValue("Tester" + randomNumber(1000, 9999));
        $("input[data-testid=\"email\"]").setValue(randomNumber(100, 999) +
                "@" + randomNumber(100, 999) + ".io");
        $("input[data-testid=\"password\"]").setValue(passwordForLogin);
        $("input[data-testid=\"confirm_password\"]").setValue(passwordForLogin);
        $("button[data-testid=\"registration-button\"]").click();

    }

    @Test
    void logInCingo() {
        open(url);

        $(".mantine-1avyp1d a").click();
        $(byText("Welcome to Cingo")).shouldBe(Condition.visible);
        $("input[data-testid=\"username\"]").setValue(userNameForLogin);
        $("input[data-testid=\"password\"]").setValue(passwordForLogin);
        $("button[data-testid=\"login-button\"]").click();
        $(byText("We take data privacy seriously.")).shouldBe(Condition.visible);

        $("input[data-testid=\"pin-input-0\"]").setValue(numberForCode);
        $("input[data-testid=\"pin-input-1\"]").setValue(numberForCode);
        $("input[data-testid=\"pin-input-2\"]").setValue(numberForCode);
        $("input[data-testid=\"pin-input-3\"]").setValue(numberForCode);
        $("input[data-testid=\"pin-input-4\"]").setValue(numberForCode);
        $("input[data-testid=\"pin-input-5\"]").setValue(numberForCode);

        $("button[type=\"submit\"]").click();

        $(byText("Be sure to add all current IDs that you possess.")).shouldBe(Condition.visible);
        $("button[data-testid=\"saveAndExit\"]").click();
    }


}