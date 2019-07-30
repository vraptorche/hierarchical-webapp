package co.jware.webapp.core;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("co.jware.webapp.core")
@PropertySource(value = "classpath:context_core.yml")
public class CoreConfig {
}
