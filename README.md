# FizzBuzz API
A learning project to create a RESTful FizzBuzz API in Spring using Spring Boot

## Usage

Make a GET request to the service with `num` parameter: `<url>:8080/?num=<number to test>`

## Examples
```
$ curl localhost:8080/?num=15
FizzBuzz
```

```
$ curl localhost:8080/?num=30
FizzBuzz
```

```
$ curl localhost:8080/?num=19
19
```

## Development 

Run `gradle tasks` to show the full list of avalible actions



Testing: run the gradle task `test`

Packaging to a .jar: run the gradle task `bootJar`

Running without an artifact: run the gradle task `bootRun`
