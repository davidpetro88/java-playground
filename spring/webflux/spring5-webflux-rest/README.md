# Spring Framework 5 - RESTFul Interfaces with WebFlux

### Starter mongodb

docker run --name my-mongo-api -p 27017:27017 -d mongo

### Category

* Get - localhost:8080/api/v1/categories
```
[
    {
        "id": "5b2d883817b4ac22df4a0327",
        "description": "Fruits"
    },
    {
        "id": "5b2d883817b4ac22df4a0328",
        "description": "Nuts"
    },
    {
        "id": "5b2d883817b4ac22df4a0329",
        "description": "Breads"
    },
    {
        "id": "5b2d883817b4ac22df4a032a",
        "description": "Meats"
    },
    {
        "id": "5b2d883817b4ac22df4a032b",
        "description": "Eggs"
    }
]
```

* Get - localhost:8080/api/v1/categories/5b2d883817b4ac22df4a0327

```
{
    "id": "5b2d883817b4ac22df4a0327",
    "description": "Fruits"
}
```

* Post - localhost:8080/api/v1/categories

```
{
    "description": "TestInsert"
}
```

* Put - localhost:8080/api/v1/categories/5b2d892217b4ac22df4a0331
```
{
    "description": "TestInsertPut"
}
```
```
{
    "id": "5b2d892217b4ac22df4a0331",
    "description": "TestInsertPut"
}
```


* Patch - localhost:8080/api/v1/categories/5b2d892217b4ac22df4a0331
```
{
    "description": "TestInsertPatch"
}
```
```
{
    "id": "5b2d892217b4ac22df4a0331",
    "description": "TestInsertPatch"
}
```


### Vendor
* Get - localhost:8080/api/v1/vendors
```
[
    {
        "id": "5b2d883817b4ac22df4a032c",
        "firstName": "Joe",
        "lastName": "Buck"
    },
    {
        "id": "5b2d883817b4ac22df4a032d",
        "firstName": "Micheal",
        "lastName": "Weston"
    },
    {
        "id": "5b2d883817b4ac22df4a032e",
        "firstName": "Jessie",
        "lastName": "Waters"
    },
    {
        "id": "5b2d883817b4ac22df4a032f",
        "firstName": "Bill",
        "lastName": "Nershi"
    },
    {
        "id": "5b2d883817b4ac22df4a0330",
        "firstName": "Jimmy",
        "lastName": "Buffett"
    }
]
```
* Get - localhost:8080/api/v1/vendors/5b2d883817b4ac22df4a0330
```
{
    "id": "5b2d883817b4ac22df4a0330",
    "firstName": "Jimmy",
    "lastName": "Buffett"
}
```

* Post - localhost:8080/api/v1/vendors
```
{
    "firstName": "TestPost",
    "lastName": "Post-"
}
```

* Put - localhost:8080/api/v1/vendors/5b2d8a6a17b4ac22df4a0332
```
{
    "firstName": "TestPut",
    "lastName": "Put-"
}
```
```
{
    "id": "5b2d8a6a17b4ac22df4a0332",
    "firstName": "TestPut",
    "lastName": "Put-"
}
```

* Patch - localhost:8080/api/v1/vendors/5b2d8a6a17b4ac22df4a0332
```
{
    "firstName": "TestPatch"
}
```

```
{
    "id": "5b2d8a6a17b4ac22df4a0332",
    "firstName": "TestPatch",
    "lastName": "Put-"
}
```