# MEC Products By Weather Forecast
* Open Weather Map API: Use the "current weather data" API to retrieve the current weather: https://openweathermap.org/current.  The response will contain a weather.main value. This will be the "search term" your service will use to search for products on mec.ca
* MEC API: Use the product search API on mec to return a list of products based on the search term.  Example usage: 'http://www.mec.ca/api/v1/products/search?keywords=Snow'
## To Run
```
mvn install spring-boot:run
curl http://localhost:8080/getProductsByWeatherForecast
```

## Tests (JUnit)
```
mvn test
```

## TODO
* error conditions, i.e. what happens if OpenMapWeather is down
* create spring profiles (right now the appId is in application.yaml, we might have a free appId and one that is a secret)

## Design
* Spring Boot for the RestController
* FeignClient for the REST Client
* http://www.jsonschema2pojo.org/ to generate the DTO (Data Tranfer Object) from OpenWeatherMap and MEC
