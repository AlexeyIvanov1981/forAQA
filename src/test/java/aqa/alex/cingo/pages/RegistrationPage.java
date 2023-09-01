package aqa.alex.cingo.pages;

import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {


    SelenideElement
            inputFirstName = $("input[data-testid=\"first_name\"]"),
            inputLastName = $("input[data-testid=\"last_name\"]"),
            inputUserName = $("input[data-testid=\"username\"]"),
            inputEmail = $("input[data-testid=\"email\"]"),
            inputPassword = $("input[data-testid=\"password\"]"),
            inputConfirmPassword = $("input[data-testid=\"confirm_password\"]"),
            submitButton = $("button[data-testid=\"registration-button\"]");


    public void openRegistrationPage(String url) {
        open(url);
    }

    public void typeFirstName(String firstName) {
        inputFirstName.setValue(firstName);
    }


    public void typeLastName(String lastName) {
        inputLastName.setValue(lastName);
    }

    public void typeUserName(String userName) {
        inputUserName.setValue(userName);
    }

    public void typeEmail(String email) {
        inputEmail.setValue(email);
    }

    public void typePassword(String password) {
        inputPassword.setValue(password);
    }

    public void typeConfirmPassword(String confirmPassword) {
        inputConfirmPassword.setValue(confirmPassword);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
}
