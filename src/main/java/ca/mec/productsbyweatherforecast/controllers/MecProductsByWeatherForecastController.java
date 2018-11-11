package ca.mec.productsbyweatherforecast.controllers;

import org.springframework.web.bind.annotation.RestController;

import ca.mec.productsbyweatherforecast.ApplicationProperties;
import ca.mec.productsbyweatherforecast.DummyBean;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RestController
public class MecProductsByWeatherForecastController {
	
	private final ApplicationProperties applicationProperties;
	
	@Autowired
	private DummyBean dummyBean;
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!" + applicationProperties.getMecBaseUrl() + dummyBean + "END";
    }
    
}
