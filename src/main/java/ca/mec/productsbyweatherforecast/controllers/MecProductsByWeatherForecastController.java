package ca.mec.productsbyweatherforecast.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ca.mec.productsbyweatherforecast.ApplicationConfiguration;
import ca.mec.productsbyweatherforecast.dto.MecShortenedProduct;
import ca.mec.productsbyweatherforecast.dto.generated.mec.MecProducts;
import ca.mec.productsbyweatherforecast.feign.MecClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MecProductsByWeatherForecastController {
	
	private final MecClient mecClient;
	
    @GetMapping("/getProductsByWeatherForecast")
    public List<MecShortenedProduct> getProductsByWeatherForecast(@RequestParam String searchTerm) {
    	log.info("searchTerm : " + searchTerm);
    	MecProducts mecProducts = mecClient.search(searchTerm);
    	List<MecShortenedProduct> retval = mecProducts.getProducts().stream().map(product -> new MecShortenedProduct(product.getName(), product.getWebUrl())).collect(Collectors.toList());
    	return retval;
    }
    
}
