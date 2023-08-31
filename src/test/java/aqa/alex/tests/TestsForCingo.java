package aqa.alex.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestsForCingo extends TestConfig {


    private String url = "https://app.dev3.cingo.co/";
    private String userNameForLogin = "Tester11111";
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
        loginPage.typeUserName(userNameForLogin);
//        $("input[data-testid=\"username\"]").setValue(userNameForLogin);
        loginPage.typePassword(passwordForLogin);
//        $("input[data-testid=\"password\"]").setValue(passwordForLogin);
        loginPage.clickSubmitButton();
//        $("button[data-testid=\"login-button\"]").click();
        $(byText("We take data privacy seriously.")).shouldBe(Condition.visible);

        $("input[aria-label=\"Please enter verification code. Digit 1\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 2\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 3\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 4\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 5\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 6\"]").setValue(numberForCode);

        $("button[type=\"submit\"]").click();
//
//        $(byText("Be sure to add all current IDs that you possess.")).shouldBe(Condition.visible);
//        $("button[data-testid=\"saveAndExit\"]").click();
    }
    @Test
    void fromLoginToSignUpForm(){
        open(url);

        $(".mantine-1avyp1d a").click();
        $(byText("Welcome to Cingo")).shouldBe(Condition.visible);
        loginPage.clickToSignUpLink();
        $(byText("Hi there!")).shouldBe(Condition.visible);
        sleep(2000);
    }

    @Test
    void fromLoginToForgotPasswordForm(){
        open(url);

        $(".mantine-1avyp1d a").click();
        $(byText("Welcome to Cingo")).shouldBe(Condition.visible);
        loginPage.clickToForgotPasswordLink();
        $(byText("Reset your password")).shouldBe(Condition.visible);
        sleep(2000);
    }


}