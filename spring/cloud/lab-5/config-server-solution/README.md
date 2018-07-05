# config-server-solution


 - Get http://localhost:8001/lucky-word-client/default
 
 ```
 {
     "name": "lucky-word-client",
     "profiles": [
         "default"
     ],
     "label": null,
     "version": "e02f2c02366b6f96e0e7b98fc16f0277a502ad08",
     "state": null,
     "propertySources": [
         {
             "name": "https://github.com/davidpetro88/spring-cloud-config/ConfigData/lucky-word-client.yml",
             "source": {
                 "wordConfig.preamble": "The lucky word is",
                 "wordConfig.luckyWord": "Irish"
             }
         },
         {
             "name": "https://github.com/davidpetro88/spring-cloud-config/ConfigData/application.yml (document #0)",
             "source": {
                 "eureka.client.serviceUrl.defaultZone": "http://localhost:8010/eureka/"
             }
         }
     ]
 }
 
 ```
 
 ### Post to refresh modifications.
 - POST http://localhost:8001/actuator/bus-refresh