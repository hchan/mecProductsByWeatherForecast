package ca.mec.productsbyweatherforecast.feign;
import ca.mec.productsbyweatherforecast.dto.generated.openweathermap.CurrentWeather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.http.MediaType;
import feign.Param;
import feign.RequestLine;
@FeignClient
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public interface OpenWeatherMapClient {
	// {@link CurrentWeather} was created by http://www.jsonschema2pojo.org/
	@RequestLine("GET /data/2.5/weather?id={cityId}&appid={appId}")
	CurrentWeather getCurrentWeather(@Param("cityId") int openWeatherMapClientCityId, @Param("appId") String openWeatherMapClientAppId);
}
