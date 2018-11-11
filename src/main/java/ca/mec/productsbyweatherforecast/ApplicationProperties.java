package ca.mec.productsbyweatherforecast;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties
@EnableConfigurationProperties
public class ApplicationProperties {
	private String mecBaseUrl;
	private String openWeatherMapBaseUrl;

	@Bean
	public DummyBean dummyBean() {
		return new DummyBean();
	}
	
	
}
