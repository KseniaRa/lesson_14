package lesson_14.tests;

import lesson_14.config.ApiTestConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ApiTests {
    @Test
    public void apiTest{
        ApiTestConfig config = ConfigFactory.create(ApiTestConfig.class, System.getProperties());
        assertThat(config.baseUrl()).isEqualTo("https://github.com");
        assertThat(config.token()).isEqualTo("000000000");

    }
}
