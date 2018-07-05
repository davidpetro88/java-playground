# config-server

* Get http://localhost:8001/setence/default

```
{
    "name": "setence",
    "profiles": [
        "default"
    ],
    "label": null,
    "version": "e02f2c02366b6f96e0e7b98fc16f0277a502ad08",
    "state": null,
    "propertySources": [
        {
            "name": "https://github.com/davidpetro88/spring-cloud-config/ConfigData/application.yml (document #0)",
            "source": {
                "eureka.client.serviceUrl.defaultZone": "http://localhost:8010/eureka/"
            }
        }
    ]
}
```

* Get http://localhost:8001/word/default

```
{
    "name": "word",
    "profiles": [
        "default"
    ],
    "label": null,
    "version": "e02f2c02366b6f96e0e7b98fc16f0277a502ad08",
    "state": null,
    "propertySources": [
        {
            "name": "https://github.com/davidpetro88/spring-cloud-config/ConfigData/application.yml (document #0)",
            "source": {
                "eureka.client.serviceUrl.defaultZone": "http://localhost:8010/eureka/"
            }
        }
    ]
}
```
