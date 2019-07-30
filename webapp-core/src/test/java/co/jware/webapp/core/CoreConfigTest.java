package co.jware.webapp.core;

import org.junit.Test;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

public class CoreConfigTest {

    private ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withUserConfiguration(CoreConfig.class);

    @Test
    public void context() {
        contextRunner.run(ctx -> {
            String[] names = ctx.getBeanDefinitionNames();
            assertThat(names).isNotEmpty();
        });
    }
}
