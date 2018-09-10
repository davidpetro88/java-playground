# product-api-functional

### Find All
GET - localhost:8080/products

```
[
    {
        "id": "5b93c99523ded67ff68c538e",
        "name": "Big Decaf",
        "price": 2.49
    },
    {
        "id": "5b93c99523ded67ff68c538f",
        "name": "Green Tea",
        "price": 1.99
    },
    {
        "id": "5b93c99523ded67ff68c538d",
        "name": "Big Latte",
        "price": 2.99
    }
]

```

### Get All
GET - localhost:8080/products

```
[
    {
        "id": "5b93c99523ded67ff68c538e",
        "name": "Big Decaf",
        "price": 2.49
    },
    {
        "id": "5b93c99523ded67ff68c538f",
        "name": "Green Tea",
        "price": 1.99
    },
    {
        "id": "5b93c99523ded67ff68c538d",
        "name": "Big Latte",
        "price": 2.99
    }
]

```


### Find by id

GET localhost:8080/products/5b93c99523ded67ff68c538e

```
{
    "id": "5b93c99523ded67ff68c538e",
    "name": "Big Decaf",
    "price": 2.49
}

```

### Put

PUT localhost:8080/products/5b93c99523ded67ff68c538e

```
{
    "name": "Big Decaf",
    "price": 5.49
}
```
- RESPONSE
```
{
    "id": "5b93c99523ded67ff68c538e",
    "name": "Big Decaf",
    "price": 5.49
}
```

### Post
POST localhost:8080/products
```
{
    "name": "NEW Decaf",
    "price": 15.49
}
```
- RESPONSE
```
{
    "id": "5b93cb6c23ded67ff68c5390",
    "name": "NEW Decaf",
    "price": 15.49
}
```

### Events Stream Values
Get http://localhost:8080/products/events
```
data:{"eventId":0,"eventType":"Product Event"}

data:{"eventId":1,"eventType":"Product Event"}

data:{"eventId":2,"eventType":"Product Event"}

data:{"eventId":3,"eventType":"Product Event"}

data:{"eventId":4,"eventType":"Product Event"}

data:{"eventId":5,"eventType":"Product Event"}

data:{"eventId":6,"eventType":"Product Event"}

data:{"eventId":7,"eventType":"Product Event"}

data:{"eventId":8,"eventType":"Product Event"}

data:{"eventId":9,"eventType":"Product Event"}

data:{"eventId":10,"eventType":"Product Event"}

data:{"eventId":11,"eventType":"Product Event"}

data:{"eventId":12,"eventType":"Product Event"}

data:{"eventId":13,"eventType":"Product Event"}

data:{"eventId":14,"eventType":"Product Event"}

data:{"eventId":15,"eventType":"Product Event"}

data:{"eventId":16,"eventType":"Product Event"}

data:{"eventId":17,"eventType":"Product Event"}

data:{"eventId":18,"eventType":"Product Event"}

data:{"eventId":19,"eventType":"Product Event"}

data:{"eventId":20,"eventType":"Product Event"}

data:{"eventId":21,"eventType":"Product Event"}

data:{"eventId":22,"eventType":"Product Event"}

data:{"eventId":23,"eventType":"Product Event"}

data:{"eventId":24,"eventType":"Product Event"}

data:{"eventId":25,"eventType":"Product Event"}

data:{"eventId":26,"eventType":"Product Event"}

data:{"eventId":27,"eventType":"Product Event"}

data:{"eventId":28,"eventType":"Product Event"}

data:{"eventId":29,"eventType":"Product Event"}

data:{"eventId":30,"eventType":"Product Event"}

```
