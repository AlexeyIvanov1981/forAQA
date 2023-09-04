package aqa.alex.cingo.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestsForCingo extends TestConfig {


    private String url = "https://app.dev3.cingo.co/";
    private String userNameForLogin = "Tester2";
    private String passwordForLoginAndRegister = "Test123456!";
    private String numberForCode = "0";
    private String emailForRegister = randomNumber(100, 999) + "A@A" + randomNumber(100, 999) + ".test";

    private String userNameForRegister = "Tester" + randomNumber(1000, 9999);


    @Test
    void registrationCingo() {
//        // Open site
        registrationPage.openRegistrationPage(url);
//        open(url);
//        // Fill in all fields of the registration form
        registrationPage.typeFirstName("AlesTest");
//        $("input[data-testid=\"first_name\"]").setValue("Alex");
        registrationPage.typeLastName("AlexLastName");
//        $("input[data-testid=\"last_name\"]").setValue("Good");
        registrationPage.typeUserName(userNameForRegister);
//        $("input[data-testid=\"username\"]").setValue("Tester" + randomNumber(1000, 9999));
        registrationPage.typeEmail(emailForRegister);
//        $("input[data-testid=\"email\"]").setValue(randomNumber(100, 999) + "@" + randomNumber(100, 999) + ".io");
        registrationPage.typePassword(passwordForLoginAndRegister);
//        $("input[data-testid=\"password\"]").setValue(passwordForLoginAndRegister);
        registrationPage.typeConfirmPassword(passwordForLoginAndRegister);
//        $("input[data-testid=\"confirm_password\"]").setValue(passwordForLoginAndRegister);
        registrationPage.clickSubmitButton();

        sleep(3000);

        $("input[aria-label=\"Please enter verification code. Digit 1\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 2\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 3\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 4\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 5\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 6\"]").setValue(numberForCode);
        $("button[type=\"submit\"]").click();

        $("input[data-testid=\"phone-input\"]").setValue("203547" + randomNumber(1000, 9999));
        $("#__next > div.mantine-Container-root.mantine-1yo1d0s > div.mantine-xsyj9d > div.mantine-1svrki4 > " +
                "form > div.mantine-1avyp1d > div.mantine-kq9pwx > button > div").click();

//        sleep(2000);
        $("input[aria-label=\"Please enter verification code. Digit 1\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 2\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 3\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 4\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 5\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 6\"]").setValue(numberForCode);
        $("button[type=\"submit\"]").click();

        loginPage.typeUserName(userNameForRegister);
        loginPage.typePassword(passwordForLoginAndRegister);
        loginPage.clickSubmitButton();
        $(byText("We take data privacy seriously.")).shouldBe(Condition.visible);
//        sleep(2000);

        $("input[aria-label=\"Please enter verification code. Digit 1\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 2\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 3\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 4\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 5\"]").setValue(numberForCode);
        $("input[aria-label=\"Digit 6\"]").setValue(numberForCode);
        $("button[type=\"submit\"]").click();

        sleep(7000);
        $(byText("3-step set up")).shouldBe(Condition.visible);
    }

    @Test
    void logInCingo() {
        loginPage.openLoginPage(url);
        loginPage.typeUserName(userNameForLogin);
//        $("input[data-testid=\"username\"]").setValue(userNameForLogin);
        loginPage.typePassword(passwordForLoginAndRegister);
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

        sleep(6000);
//
        $(byText("3-step set up")).shouldBe(Condition.visible);
//        $("button[data-testid=\"saveAndExit\"]").click();
    }

    @Test
    void checkSignUpLink() {
        loginPage.openLoginPage(url);
        loginPage.clickToSignUpLink();
        $(byText("Hi there!")).shouldBe(Condition.visible);

        sleep(2000);
    }

    @Test
    void checkForgotPasswordLink() {
        loginPage.openLoginPage(url);
        loginPage.clickToForgotPasswordLink();
        $(byText("Reset your password")).shouldBe(Condition.visible);

        sleep(2000);
    }
}