# MEC Products By Weather Forecast
* Uses the "current weather data" API to retrieve the current weather: https://openweathermap.org/current and parses the JSON response ( weather.main ) to get value like "Snow".  This will be the "search term" this service will use to search for products on mec.ca
* Uses the above search term as a parameter to the MEC products search API like: 'http://www.mec.ca/api/v1/products/search?keywords=Snow'
* parse the above response to return a trimmed down web service containing only the name and web_url

## Prerequsites
* JDK1.8+
* maven 3.3+
* any git client
* curl / or a browser

## To Run
```
git clone https://github.com/hchan/mecProductsByWeatherForecast.git
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
* monitoring / testing ( would love to use postman to write the API documenation/examples and tests )
* change the @GetMapping to include a /api/vXX/ and possibly use HATEOS notation (will require more knowledge of where this is going to go wrt business rules)
* add more Java comments - yes, I'm guilty as charged.

