# lab-5

- Spring Cloud Bus

### Start Docker RabbitMq

```
docker run -d --hostname localhost --name rabbitmq -p 5672:5672 -p 15672:15672 -e RABBITMQ_DEFAULT_USER=admin -e RABBITMQ_DEFAULT_PASS=123456 rabbitmq:3-management
```
