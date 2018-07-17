# currency-conversion-service

- Get http://localhost:8100/currency-converter/from/USD/to/BRL/quantity/2

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

- Get http://localhost:8100/currency-converter-feign/from/USD/to/BRL/quantity/2
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
