# MEC Products By Weather Forecast
* Uses the "current weather data" API to retrieve the current weather: https://openweathermap.org/current and parses the JSON response ( weather.main ) to get value like "Snow".  This will be the "search term" this service will use to search for products on mec.ca
* MEC API: Uses the product search API on mec to return a list of products based on the search term.  Example usage: 'http://www.mec.ca/api/v1/products/search?keywords=Snow'

## Prerequsites
* JDK1.8+
* maven 3.3+
* any git client
* curl / or a browser

## To Run
```
mvn install spring-boot:run
curl http://localhost:8080/getProductsByWeatherForecast
```

## Design
* Spring Boot for the RestController
* FeignClient for the REST Client
* http://www.jsonschema2pojo.org/ to generate the DTO (Data Tranfer Object) from OpenWeatherMap and MEC

## Tests (JUnit)
```
mvn test
```

## TODO
* error conditions, i.e. what happens if OpenMapWeather is down or the free license API stops working (too many requests)
* create spring profiles (right now the appId is in application.yaml, we might have a free appId and one that is a secret)
* deployment / CI .  I would love to use gitlab.com and deploy this on Google Kubernetes Engine
* monitoring / testing ( would love to use postman )
* change the @GetMapping to include a /api/vXX/ and possibly use HATEOS notation (will require more knowledge of where this is going to go wrt business rules)
* add more Java comments - yes, I'm guilty as charged.

