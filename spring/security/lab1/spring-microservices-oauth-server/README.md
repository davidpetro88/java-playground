# spring-microservices-oauth-server

- POST http://localhost:9090/oauth/token

 ```
 curl -X POST \
   http://localhost:9090/oauth/token \
   -H 'authorization: Basic d2ViYXBwOndlYnNlY3JldA==' \
   -H 'content-type: multipart/form-data' \
   -F grant_type=password \
   -F password=password2 \
   -F username=admin \
   -F client_id=webapp
 ```
 
```
{
    "access_token": "e5cf5f7c-01d0-41c6-8cc4-6c7e385fb199",
    "token_type": "bearer",
    "refresh_token": "4650eb65-fe55-48d8-a4ef-536a4e7e6d1c",
    "expires_in": 34233,
    "scope": "trust read write"
}
```

- POST http://localhost:9090/oauth/check_toke 

```
curl -X POST \
  http://localhost:9090/oauth/check_token \
  -H 'content-type: multipart/form-data' \
  -F clientapp=webapp \
  -F token=e5cf5f7c-01d0-41c6-8cc4-6c7e385fb199
```

```
{
    "exp": 1531699946,
    "user_name": "admin",
    "authorities": [
        "ROLE_ADMIN"
    ],
    "client_id": "webapp",
    "scope": [
        "trust",
        "read",
        "write"
    ]
}
```