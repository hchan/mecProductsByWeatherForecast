package ca.mec.productsbyweatherforecast.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

import ca.mec.productsbyweatherforecast.dto.generated.mec.MecProducts;
import feign.Param;
import feign.RequestLine;
@FeignClient
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public interface MecClient {
	// {@link MecProducts} was creatd by http://www.jsonschema2pojo.org/
	@RequestLine("GET /api/v1/products/search?keywords={keywords}")
	MecProducts search(@Param("keywords") String keywords);
	
}
