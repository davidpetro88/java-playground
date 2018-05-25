# api-serivce

This example use Gradle, SpringBoot 2, Mongodb and Java 10.

### Starter mongodb
docker run --name my-mongo-api -p 27017:27017 -d mongo


### Insert

- POST - http://localhost:9023/client

```
{
	"name": "David",
	"lastName": "Petro",
	"birthday":"1988-12-20",
	"country": "Brazil"
}
```


- Response

```
{
    "id": "5b07678949e19ee1cf4f7089",
    "name": "David",
    "lastName": "Petro",
    "birthday": "1988-12-20",
    "country": "Brazil"
}
```


### FindAll

- GET - http://localhost:9023/client

```
[
    {
        "id": "5b07678949e19ee1cf4f7089",
        "name": "David",
        "lastName": "Petro",
        "birthday": "1988-12-20",
        "country": "Brazil"
    }
]
```

### FindById

- GET - http://localhost:9023/client/5b07678949e19ee1cf4f7089

```
{
    "id": "5b07678949e19ee1cf4f7089",
    "name": "David",
    "lastName": "Petro",
    "birthday": "1988-12-20",
    "country": "Brazil"
}
```
