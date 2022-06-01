package guru.qa.tests;

import guru.qa.config.WebDriverConfig;
import org.junit.jupiter.api.BeforeAll;
import org.aeonbits.owner.ConfigFactory;
import com.codeborne.selenide.Configuration;

public class TestBase {
    @BeforeAll
    static void setUp() {
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class,System.getProperties());

        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.remote = config.getRemoteUrl();
    }
}
