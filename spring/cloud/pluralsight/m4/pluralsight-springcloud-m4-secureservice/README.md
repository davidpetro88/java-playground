# pluralsight-springcloud-m4-secureservice

### Run Projects
* 1 - pluralsight-springcloud-m4-secureauthserver

### Get access_token 

```

curl -X POST \
>   http://localhost:9000/services/oauth/token \
>   -H 'authorization: Basic cGx1cmFsc2lnaHQ6cGx1cmFsc2lnaHRzZWNyZXQ=' \
>   -H 'cache-control: no-cache' \
>   -H 'content-type: application/x-www-form-urlencoded' \
>   -H 'postman-token: ed030db7-2637-e719-c318-94f0ca1308bb' \
>   -d 'grant_type=password&client_id=pluralsight&username=bgoldberg&password=pass2'
{"access_token":"5af2460c-f7a7-4c31-960e-497e0d511936","token_type":"bearer","refresh_token":"b2998105-c254-4dc0-8bb8-3b8484ebee9c","expires_in":43199,"scope":"toll_read toll_report"} 

```

### Get Tolldata

```

curl -X GET \
>   http://localhost:9001/services/tolldata \
>   -H 'authorization: Bearer 5af2460c-f7a7-4c31-960e-497e0d511936' \
>   -H 'cache-control: no-cache' \
>   -H 'postman-token: 1a14d81c-40b3-4592-5655-aa360282dde9'
[{"Id":"200","stationId":"station150","licensePlate":"B65GT1W","timestamp":"2016-09-30T06:31:22"},{"Id":"201","stationId":"station119","licensePlate":"AHY673B","timestamp":"2016-09-30T06:32:50"},{"Id":"202","stationId":"station150","licensePlate":"ZN2GP0","timestamp":"2016-09-30T06:37:01"}]

```





