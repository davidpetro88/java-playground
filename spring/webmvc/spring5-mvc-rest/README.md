# Spring Framework 5 MVC Rest Application

### Customers

* Get - localhost:8080/api/v1/customers
```
{
    "customers": [
        {
            "firstname": "Michale",
            "lastname": "Weston",
            "customer_url": "/api/v1/customers/1"
        },
        {
            "firstname": "Sam",
            "lastname": "Axe",
            "customer_url": "/api/v1/customers/2"
        }
    ]
}
```

* Get - localhost:8080/api/v1/customers
    * Content-Type = application/xml
    * Accept = application/xml
```
<CustomerListDTO>
    <customers>
        <customers>
            <firstname>Michale</firstname>
            <lastname>Weston</lastname>
            <customer_url>/api/v1/customers/1</customer_url>
        </customers>
        <customers>
            <firstname>Sam</firstname>
            <lastname>Axe</lastname>
            <customer_url>/api/v1/customers/2</customer_url>
        </customers>
    </customers>
</CustomerListDTO>
```

### Category
* Get - localhost:8080/api/v1/categories
```
{
    "categories": [
        {
            "id": 1,
            "name": "Fruits"
        },
        {
            "id": 2,
            "name": "Dried"
        },
        {
            "id": 3,
            "name": "Fresh"
        },
        {
            "id": 4,
            "name": "Exotic"
        },
        {
            "id": 5,
            "name": "Nuts"
        }
    ]
}
```

* Get - localhost:8080/api/v1/categories
    * Content-Type = application/xml
    * Accept = application/xml
```
<CatorgoryListDTO>
    <categories>
        <categories>
            <id>1</id>
            <name>Fruits</name>
        </categories>
        <categories>
            <id>2</id>
            <name>Dried</name>
        </categories>
        <categories>
            <id>3</id>
            <name>Fresh</name>
        </categories>
        <categories>
            <id>4</id>
            <name>Exotic</name>
        </categories>
        <categories>
            <id>5</id>
            <name>Nuts</name>
        </categories>
    </categories>
</CatorgoryListDTO>
```
    