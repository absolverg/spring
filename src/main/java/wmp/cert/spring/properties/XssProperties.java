package wmp.cert.spring.properties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "cheatsheet")
@PropertySource(value = "classpath:xss_secu-tech.yml", factory = YamlPropertySourceFactory.class)
@Data
public class XssProperties {
	private List<String> xss;
}
