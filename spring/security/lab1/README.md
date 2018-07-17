# lab1


### start hsqldb 
```
docker stop hsqldb || true && docker rm hsqldb || true && docker run -d -p 9001:9001 --name hsqldb blacklabelops/hsqldb
```