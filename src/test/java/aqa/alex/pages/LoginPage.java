package aqa.alex.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private SelenideElement
            inputUserName = $("input[data-testid=\"username\"]"),
            inputPassword = $("input[data-testid=\"password\"]"),
            linkForgotPassword = $(".mantine-1avyp1d a"),
            linkSignUpNow = $x("//*[@id=\"__next\"]/div[1]/div[2]/div[1]/form/div[2]/div[1]/a"),
            submitButton = $("button[data-testid=\"login-button\"]");

    public void openLoginPage(String url) {
        open(url);
        $(".mantine-1avyp1d a").click();
        $(byText("Welcome to Cingo")).shouldBe(Condition.visible);
    }

    public void typeUserName(String userName) {
        inputUserName.setValue(userName);
    }

    public void typePassword(String password) {
        inputPassword.setValue(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void clickToSignUpLink() {
        linkSignUpNow.click();
    }

    public void clickToForgotPasswordLink() {
        linkForgotPassword.click();
    }
}
