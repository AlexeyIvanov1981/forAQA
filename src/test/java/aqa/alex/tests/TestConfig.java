package aqa.alex.tests;

import aqa.alex.pages.LoginPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestConfig {
    LoginPage loginPage = new LoginPage();

    @BeforeAll
    static void browserSettings() {
        Configuration.browser = "FIREFOX";
        Configuration.startMaximized = true;
    }

    public int randomNumber(int minValue, int maxValue) {
        return minValue + (int) (Math.random() * (maxValue - minValue + 1));
    }
}
