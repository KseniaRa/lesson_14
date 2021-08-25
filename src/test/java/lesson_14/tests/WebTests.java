package lesson_14.tests;


import lesson_14.config.WebTestConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebTests {
    @Test
    public void testWebLocal() {
        System.setProperty("remote", "local");
        WebTestConfig config = ConfigFactory.create(WebTestConfig.class, System.getProperties());
        assertThat(config.getBrowser()).isEqualTo("chrome");
        assertThat(config.getBrowser()).isEqualTo("91.0");
        assertThat(config.isRemote()).isEqualTo(false);
    }
    // команда для запуска теста ./gradlew clean test -Dremote=local

    @Test
    public void testWebRemote() {
        System.setProperty("remote", "remote");
        WebTestConfig config = ConfigFactory.create(WebTestConfig.class, System.getProperties());
        assertThat(config.getBrowser()).isEqualTo("firefox");
        assertThat(config.getBrowser()).isEqualTo("87.0");
        assertThat(config.isRemote()).isEqualTo(true);
    }

    // команда для запуска теста ./gradlew clean test -Dremote=remote
}
