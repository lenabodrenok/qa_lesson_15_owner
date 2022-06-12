package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/secret.properties",
        "classpath:api.properties"
})

    public interface ApiConfig extends Config {

        @Key("baseUrl")
        String baseUrl();

        @Key("token")
        String token();
}
