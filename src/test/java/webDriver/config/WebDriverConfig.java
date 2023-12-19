package webDriver.config;

public class WebDriverConfig {

    public Browser getBrowser() {
        return Browser.FIREFOX;
    }

    public String baseURL(){
        return "https://www.youtube.com/";
    }
}
