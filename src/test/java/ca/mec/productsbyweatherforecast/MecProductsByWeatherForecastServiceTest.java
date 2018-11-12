package ca.mec.productsbyweatherforecast;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.fasterxml.jackson.databind.ObjectMapper;

import ca.mec.productsbyweatherforecast.config.OpenWeatherMapConfiguration;
import ca.mec.productsbyweatherforecast.dto.MecShortenedProduct;
import ca.mec.productsbyweatherforecast.dto.generated.mec.MecProducts;
import ca.mec.productsbyweatherforecast.dto.generated.openweathermap.CurrentWeather;
import ca.mec.productsbyweatherforecast.feign.MecClient;
import ca.mec.productsbyweatherforecast.feign.OpenWeatherMapClient;
import ca.mec.productsbyweatherforecast.service.MecProductsByWeatherForecastService;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import java.io.InputStream;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MecProductsByWeatherForecastServiceTest {
	@Mock
	MecClient mecClient;
	@Mock
	OpenWeatherMapClient openWeatherMapClient;
	@Mock
	OpenWeatherMapConfiguration openWeatherMapConfiguration;
	
	private CurrentWeather currentWeather;
	private MecProducts mecProducts;
	@Before
	public void setUp() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
        InputStream is = MecProductsByWeatherForecastServiceTest.class.getClassLoader().getResourceAsStream("ca/mec/productsbyweatherforecast/currentWeather.json");
		currentWeather = objectMapper.readValue(is, CurrentWeather.class);
		is = MecProductsByWeatherForecastServiceTest.class.getClassLoader().getResourceAsStream("ca/mec/productsbyweatherforecast/mecProducts.json");
		mecProducts = objectMapper.readValue(is, MecProducts.class);
		when(openWeatherMapClient.getCurrentWeather(any(), any())).thenReturn(currentWeather);
		when(mecClient.search(any())).thenReturn(mecProducts);
	}
	
	@Test
	public void mainTest() {
		MecProductsByWeatherForecastService mecProductsByWeatherForecastService = 
				new MecProductsByWeatherForecastService(mecClient, openWeatherMapClient, openWeatherMapConfiguration);
		List<MecShortenedProduct> mecShortenedProducts = mecProductsByWeatherForecastService.getProductsByWeatherForecast();
		Assert.assertEquals(2, mecShortenedProducts.size());
		Assert.assertEquals("Fog Long Sleeve", mecShortenedProducts.get(0).getName());
	}

}
