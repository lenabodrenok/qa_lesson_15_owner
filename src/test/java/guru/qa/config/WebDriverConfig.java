package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources(
        "classpath:config/${config-test}.properties")

public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("remoteUrl")                                 // зачитываем данные из командной строки
    @DefaultValue("http://localhost:4444/wd/hub")     // обрабатывает дефолтное значение
    String getRemoteUrl();                            // конвертируем в возращаемый тип

}
