package ca.mec.productsbyweatherforecast;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ca.mec.productsbyweatherforecast.feign.MecClient;
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
@ConfigurationProperties
@EnableConfigurationProperties
@RequiredArgsConstructor
public class ApplicationConfiguration {
	private String mecBaseUrl;
	private String openWeatherMapBaseUrl;
    private final ObjectFactory<HttpMessageConverters> messageConverters;

	@Bean
	public MecClient mecClient() {
		return Feign.builder().client(new OkHttpClient())
				.encoder(new SpringEncoder(messageConverters))
				.decoder(new SpringDecoder(messageConverters))
				.target(MecClient.class, mecBaseUrl);
	}

}
