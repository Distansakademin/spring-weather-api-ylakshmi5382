# JENSEN WEATHER API

This api privides weather information in your city for today.
###  GITHUB URL
https://github.com/Distansakademin/spring-weather-api-ylakshmi5382

### ENDPOINT INFORMATION

Base path "http://localhost:8299/weatherapi"

```
GET: 
  Description: FETCH ALL CITIES IN A COUNTRY
  PATH:        'http://localhost:8299/weatherapi/{countryId}/cities'
  PARAMETERS: countryID--ID of country
  EXAMPLE: SWEDEN

GET:
  Description: GET WEATHER INFO OF A CITY
  PATH:        http://localhost:8299/weatherapi/weather/{cityId}
  PARAMETERS: cityId --ID of city
  EXAMPLE: MALMO
```

### CURL COMMAND TO GET COUNTRIES
```
FETCH WEATHER OF CITY:

curl -v --request GET  'http://localhost:8299/weatherapi/weather/hello'

FETCH LIST OF CITIES IN A COUNTRY: 

curl -v --request GET  http://localhost:8299/weatherapi/countryId/cities

```
### HOW TO BUILD DOCKER IMAGE AND DOCKER CONTAINER
```

docker login -u lakshmi5382

BUILD: 
docker build -t weathertoday .
TAG:
docker tag weathertoday lakshmi5382/weathertoday:0.0.2-SNAPSHOT
PULL:
docker pull lakshmi5382/weathertoday:0.0.2-SNAPSHOT
RUN:
docker run -p 8080:8080 -e "JAVA_OPTS=-Ddebug -Xmx128m" weathertoday
```
