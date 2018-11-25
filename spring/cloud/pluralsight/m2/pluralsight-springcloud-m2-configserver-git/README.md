#pluralsight-springcloud-m2-configserver-git

### GET - http://localhost:8888/s1rates/master
```
{
	"name": "s1rates",
	"profiles": ["master"],
	"label": "master",
	"version": "5ed5480975ded33308e3ee18d42652779c402c3d",
	"propertySources": [{
		"name": "https://github.com/davidpetro88/spring-cloud-config/pluralsight/station1/s1rates.properties",
		"source": {
			"rate": "1.91",
			"lanecount": "1"
		}
	}]
}
```

### GET - http://localhost:8888/s1rates/dev
```
{
	"name": "s1rates",
	"profiles": ["dev"],
	"label": "master",
	"version": "5ed5480975ded33308e3ee18d42652779c402c3d",
	"propertySources": [{
		"name": "https://github.com/davidpetro88/spring-cloud-config/pluralsight/station1/s1rates-dev.properties",
		"source": {
			"environment": "development",
			"rate": "1.91",
			"lanecount": "1"
		}
	}, {
		"name": "https://github.com/davidpetro88/spring-cloud-config/pluralsight/station1/s1rates.properties",
		"source": {
			"rate": "1.91",
			"lanecount": "1"
		}
	}]
}
```


### GET - http://localhost:8888/s1rates/qa
```
{
	"name": "s1rates",
	"profiles": ["qa"],
	"label": "master",
	"version": "5ed5480975ded33308e3ee18d42652779c402c3d",
	"propertySources": [{
		"name": "https://github.com/davidpetro88/spring-cloud-config/pluralsight/station1/s1rates-qa.properties",
		"source": {
			"environment": "testing",
			"rate": "1.99",
			"lanecount": "2"
		}
	}, {
		"name": "https://github.com/davidpetro88/spring-cloud-config/pluralsight/station1/s1rates.properties",
		"source": {
			"rate": "1.91",
			"lanecount": "1"
		}
	}]
}
```

### GET - http://localhost:8888/s1rates/default

```
{
	"name": "s1rates",
	"profiles": ["default"],
	"label": "master",
	"version": "5ed5480975ded33308e3ee18d42652779c402c3d",
	"propertySources": [{
		"name": "https://github.com/davidpetro88/spring-cloud-config/pluralsight/station1/s1rates.properties",
		"source": {
			"rate": "1.91",
			"lanecount": "1"
		}
	}]
}
```

### GET - http://localhost:8888/s1rates-default.properties

```
lanecount: 1
rate: 1.91
```


### GET - http://localhost:8888/s1rates-default.yml

```
lanecount: '1'
rate: '1.91'
```

### GET - http://localhost:8888/s1rates-default.json

```
{"lanecount":"1","rate":"1.91"}
```

### GET - http://localhost:8888/s1rates-dev.json

```
{"environment":"development","lanecount":"1","rate":"1.91"}
```

### GET - http://localhost:8888/s3rates/local

```
{
	"name": "s3rates",
	"profiles": ["local"],
	"label": "master",
	"version": "7873a2fd580138f968dcad1f509af4cdb54df5e8",
	"propertySources": [{
		"name": "https://github.com/davidpetro88/pluralsight-spring-cloudconfig-wa-tolls-local/application.properties",
		"source": {
			"tollstop": "22:00",
			"rate": "1.55",
			"connstring": "{cipher}57d69bd9184e4365ad339709ef126c8b065b8340165006c2b6c314be9119f61c0b04b0e81279e325c006c575ba4c8da5ed2382b2156b5a204723e0ef04a6f3930401ecaed260c14864e07b85e3e530f9",
			"tollstart": "05:00",
			"lanecount": "0"
		}
	}]
}
```



### dependency
- https://www.oracle.com/technetwork/java/javase/downloads/jce-all-download-5170447.html

```
cp ~/Downloads/UnlimitedJCEPolicyJDK8/local_policy.jar /Users/davidpetro/.sdkman/candidates/java/8.0.171-oracle/jre/lib/security
/local_policy.jar
 
 cp ~/Downloads/UnlimitedJCEPolicyJDK8/US_export_policy.jar /Users/davidpetro/.sdkman/candidates/java/8.0.171-oracle/jre/lib/security
/US_export_policy.jar
```

### POST - localhost:8888/encrypt
```
curl -X POST \
  http://localhost:8888/encrypt \
  -H 'authorization: Basic cGx1cmFsc2lnaHQ6cGx1cmFsc2lnaHQ=' \
  -H 'cache-control: no-cache' \
  -H 'postman-token: 065a20ca-30f0-2a56-76da-63e8e10a6552' \
  -d 'connectionstring=server123;user=root;password=pass@word1'
```
- Response
```
f31a90bfeaec94e271dfcf097a2a611d13f00ee6d97115c0a5f1d436d10b301415efa68233a399ac6ac3e21744f2a4fcc12bc1dcf5de5dd3dfc24f2b44d096c6a079d8c1ab93fabf1d62f985ce3f634c
```

### POST - localhost:8888/decrypt

```
curl -X POST \
  http://localhost:8888/decrypt \
  -H 'authorization: Basic cGx1cmFsc2lnaHQ6cGx1cmFsc2lnaHQ=' \
  -H 'cache-control: no-cache' \
  -H 'postman-token: 6bcce0a7-d530-e9d3-c21b-2ed8273a45ee' \
  -d f31a90bfeaec94e271dfcf097a2a611d13f00ee6d97115c0a5f1d436d10b301415efa68233a399ac6ac3e21744f2a4fcc12bc1dcf5de5dd3dfc24f2b44d096c6a079d8c1ab93fabf1d62f985ce3f634c

```
- Response
```
connectionstring=server123;user=root;password=pass@word1
```


### Get http://localhost:8888/s1rates/default
- if disable
````
#        encrypt:
#          enabled: false

````
- will descrypt = "connstring": "connectionstring=server123;user=root;password=pass@word1"
```
{
    "name": "s1rates",
    "profiles": [
        "default"
    ],
    "label": "master",
    "version": "26964bf292ac19924d5d2823d82b77098b57ecc8",
    "propertySources": [
        {
            "name": "https://github.com/davidpetro88/pluralsight-spring-cloudconfig-wa-tolls-local/station1/s1rates.properties",
            "source": {
                "rate": "1.91",
                "lanecount": "1"
            }
        },
        {
            "name": "https://github.com/davidpetro88/pluralsight-spring-cloudconfig-wa-tolls-local/application.properties",
            "source": {
                "tollstop": "22:00",
                "rate": "1.55",
                "tollstart": "05:00",
                "lanecount": "0",
                "connstring": "connectionstring=server123;user=root;password=pass@word1"
            }
        }
    ]
}
```

- if not disable

```
{
    "name": "s1rates",
    "profiles": [
        "default"
    ],
    "label": "master",
    "version": "26964bf292ac19924d5d2823d82b77098b57ecc8",
    "propertySources": [
        {
            "name": "https://github.com/davidpetro88/pluralsight-spring-cloudconfig-wa-tolls-local/station1/s1rates.properties",
            "source": {
                "rate": "1.91",
                "lanecount": "1"
            }
        },
        {
            "name": "https://github.com/davidpetro88/pluralsight-spring-cloudconfig-wa-tolls-local/application.properties",
            "source": {
                "tollstop": "22:00",
                "rate": "1.55",
                "connstring": "{cipher}f31a90bfeaec94e271dfcf097a2a611d13f00ee6d97115c0a5f1d436d10b301415efa68233a399ac6ac3e21744f2a4fcc12bc1dcf5de5dd3dfc24f2b44d096c6a079d8c1ab93fabf1d62f985ce3f634c",
                "tollstart": "05:00",
                "lanecount": "0"
            }
        }
    ]
}
```