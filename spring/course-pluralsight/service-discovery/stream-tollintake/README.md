# stream-tollintake

### Start RabbitMQ

- docker run -d --hostname local-rabbit --name spring-cloud-coordinating-rmq -p 15672:15672 -p 5672:5672 rabbitmq:3.6.9-management


### Generate jar

- mvn package


### Run Projects

- eureka-server
- eureka-fastpass-console


### Run console

```

java -jar stream-tollintake/target/stream-tollintake-0.0.1-SNAPSHOT.jar --spring.cloud.steam.instanceindex=0
java -jar stream-tollintake/target/stream-tollintake-0.0.1-SNAPSHOT.jar --spring.cloud.steam.instanceindex=1
java -jar stream-tollintake/target/stream-tollintake-0.0.1-SNAPSHOT.jar --spring.cloud.steam.instanceindex=2

```

### Test
- POST http://localhost:8082/toll
- BODY
```
{
	"stationId": "10",
	"customerId": "100",
	"timestamp": "2017-07-12T12:04:00"
}
```





