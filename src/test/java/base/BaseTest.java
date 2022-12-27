package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest {
    public void setUp() {
        Configuration.driverManagerEnabled = false;
        System.setProperty("webdriver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.pageLoadStrategy = "eager";
//        Configuration.pageLoadStrategy = "none";
    }

    @BeforeTest
    public void init() {
        setUp();
    }

    @AfterTest
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
