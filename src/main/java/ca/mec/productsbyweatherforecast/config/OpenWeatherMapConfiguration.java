package ca.mec.productsbyweatherforecast.config;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ca.mec.productsbyweatherforecast.feign.OpenWeatherMapClient;
import feign.Feign;
import feign.okhttp.OkHttpClient;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties(prefix = "open-weather-map")
@EnableConfigurationProperties
@RequiredArgsConstructor
public class OpenWeatherMapConfiguration {
	private String baseUrl;
	private Integer cityId;
	private String appId;

	private final ObjectFactory<HttpMessageConverters> messageConverters;

	@Bean
	public OpenWeatherMapClient openWeatherMapClient() {
		return Feign.builder().client(new OkHttpClient()).encoder(new SpringEncoder(messageConverters))
				.decoder(new SpringDecoder(messageConverters)).target(OpenWeatherMapClient.class, baseUrl);
	}
}
