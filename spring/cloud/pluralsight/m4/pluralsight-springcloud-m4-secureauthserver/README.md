# pluralsight-springcloud-m4-secureauthserver

````

curl -X POST \
  http://localhost:9000/services/oauth/token \
  -H 'authorization: Basic cGx1cmFsc2lnaHQ6cGx1cmFsc2lnaHRzZWNyZXQ=' \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/x-www-form-urlencoded' \
  -H 'postman-token: ed030db7-2637-e719-c318-94f0ca1308bb' \
  -d 'grant_type=password&client_id=pluralsight&username=bgoldberg&password=pass2'
````
