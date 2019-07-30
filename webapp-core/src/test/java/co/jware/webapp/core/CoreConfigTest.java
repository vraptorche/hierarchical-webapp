package co.jware.webapp.core;

import org.junit.Test;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

public class CoreConfigTest {

    private ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withUserConfiguration(CoreConfig.class);

    @Test
    public void context() {
        contextRunner.withPropertyValues("spring.profiles.active=local")
                .run(ctx -> {
                    String foo = ctx.getEnvironment().getProperty("foo");

                    assertThat(foo).isEqualTo("bar");
                });
    }
}
