#config-server


### roomservices
 * Get - http://localhost:9000/roomservices/default
 
 ```
 {
     "name": "roomservices",
     "profiles": [
         "default"
     ],
     "label": null,
     "version": null,
     "state": null,
     "propertySources": [
         {
             "name": "https://github.com/davidpetro88/spring-cloud-config/roomservices.properties",
             "source": {
                 "server.port": "8101",
                 "management.security.enabled": "false"
             }
         }
     ]
 }
 ```
 
### reservationservices
  * Get - http://localhost:9000/reservationservices/default
  
  ```
  {
      "name": "reservationservices",
      "profiles": [
          "default"
      ],
      "label": null,
      "version": null,
      "state": null,
      "propertySources": [
          {
              "name": "https://github.com/davidpetro88/spring-cloud-config/reservationservices.properties",
              "source": {
                  "server.port": "8103",
                  "management.security.enabled": "false"
              }
          }
      ]
  }
  ```
  
  
### reservationbusinessservices
  * Get - http://localhost:9000/reservationbusinessservices/default
  
  ```
  {
      "name": "reservationbusinessservices",
      "profiles": [
          "default"
      ],
      "label": null,
      "version": null,
      "state": null,
      "propertySources": [
          {
              "name": "https://github.com/davidpetro88/spring-cloud-config/reservationbusinessservices.properties",
              "source": {
                  "server.port": "8500",
                  "management.security.enabled": "false"
              }
          }
      ]
  }
  ```
  
### reservationapp
   * Get - http://localhost:9000/reservationapp/default
   
   ```
   {
       "name": "reservationapp",
       "profiles": [
           "default"
       ],
       "label": null,
       "version": null,
       "state": null,
       "propertySources": [
           {
               "name": "https://github.com/davidpetro88/spring-cloud-config/reservationapp.properties",
               "source": {
                   "server.port": "8600",
                   "management.security.enabled": "false"
               }
           }
       ]
   }
  
   ``` 
  
### http://localhost:9000/guestservices/default

```
{
    "name": "guestservices",
    "profiles": [
        "default"
    ],
    "label": null,
    "version": null,
    "state": null,
    "propertySources": [
        {
            "name": "https://github.com/davidpetro88/spring-cloud-config/guestservices.properties",
            "source": {
                "server.port": "8102",
                "management.security.enabled": "false"
            }
        }
    ]
}
```  
  