# netflix-zuul-api-gateway-server


- Get http://localhost:8765/currency-exchange-service/currency-exchange/from/USD/to/BRL

```
{
    "id": 10002,
    "from": "USD",
    "to": "BRL",
    "conversionMultiple": 4,
    "port": 8000
}

```

- Get http://localhost:8765/currency-conversion-service/currency-converter/from/USD/to/BRL/quantity/2

```
{
    "id": 10002,
    "from": "USD",
    "to": "BRL",
    "conversionMultiple": 4,
    "quantity": 2,
    "totalCalculatedAmount": 8,
    "port": 8000
}
```


- Get http://localhost:8765/currency-conversion-service/currency-converter-feign/from/USD/to/BRL/quantity/2

```
{
    "id": 10002,
    "from": "USD",
    "to": "BRL",
    "conversionMultiple": 4,
    "quantity": 2,
    "totalCalculatedAmount": 8,
    "port": 8000
}
```

