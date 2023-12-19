package aqa.alex.cingo.tests;

import aqa.alex.cingo.pages.RegistrationPage;
import aqa.alex.cingo.pages.LoginPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestConfig {
    RegistrationPage registrationPage = new RegistrationPage();
    LoginPage loginPage = new LoginPage();

//    @BeforeAll
//    static void browserSettings() {
//        Configuration.browser = "FIREFOX";
//        Configuration.browserSize = "1920x1200";
//    }

    public int randomNumber(int minValue, int maxValue) {
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }
}
