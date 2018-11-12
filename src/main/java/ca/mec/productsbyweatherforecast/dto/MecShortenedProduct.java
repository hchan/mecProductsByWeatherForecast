package ca.mec.productsbyweatherforecast.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MecShortenedProduct {
	private String name;
	@JsonProperty("web_url")
	private String webUrl;
}
