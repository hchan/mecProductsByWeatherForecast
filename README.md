# MEC Products By Weather Forecast

## To Run
```
mvn install spring-boot:run
curl http://localhost:8080/getProductsByWeatherForecast
```

## Tests
```
mvn test
```

## TODO
* error conditions, i.e. what happens if OpenMapWeather is down
* create spring profiles (right now the appId is in application.yaml, we might have a free appId and one that is a secret)

## Design
