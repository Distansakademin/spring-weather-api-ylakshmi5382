# JENSEN WEATHER API

This api privides weather information in your city for today.

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

docker login: 

BUILD: 
docker build -t weathertoday .
RUN:
docker run -p 8080:8080 -e "JAVA_OPTS=-Ddebug -Xmx128m" myorg/myapp
```