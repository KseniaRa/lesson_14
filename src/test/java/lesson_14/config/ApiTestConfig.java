package lesson_14.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/api.properties", // абсолютный  путь до файла, предварительно создать файл
        // и заполнить его данными из api.properties
        "classpath:api.properties" //файл в папочке resources
})

public interface ApiTestConfig extends Config {
    @Key("baseUrl")
    String baseUrl();

    @Key("token")
    String token();


}
