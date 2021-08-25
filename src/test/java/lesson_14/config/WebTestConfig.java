package lesson_14.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:remote.properties" //файл в папочке resources
})


public interface WebTestConfig extends Config {
   @Key("browser.name")
   @DefaultValue("CHROME")
   Browser getBrowser();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("is_remote")
    @DefaultValue("true")
    boolean isRemote();



}
