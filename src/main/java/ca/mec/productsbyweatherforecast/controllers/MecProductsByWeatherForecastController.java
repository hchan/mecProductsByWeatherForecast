package ca.mec.productsbyweatherforecast.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ca.mec.productsbyweatherforecast.dto.MecShortenedProduct;
import ca.mec.productsbyweatherforecast.service.MecProductsByWeatherForecastService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MecProductsByWeatherForecastController {
	
	private final MecProductsByWeatherForecastService mecProductsByWeatherForecastService;
	
    @GetMapping("/getProductsByWeatherForecast")
    public List<MecShortenedProduct> getProductsByWeatherForecast() {
    	return mecProductsByWeatherForecastService.getProductsByWeatherForecast();
    }
    
}
