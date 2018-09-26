# zuul-apiproxy

- Get http://localhost:8086/api/tollproxy/tollrate/2

```
{
	"stationId": 2,
	"currentRate": 1.05,
	"timestamp": "2018-09-26T00:33:29.459Z"
}

```

- Get http://localhost:8086/api/tollproxy/tollrate/2?source=mobile

```
{
	"stationId": 2,
	"currentRate": 1.05,
	"timestamp": "2018-09-26T00:33:29.459Z"
}

```

- Console 

```
calling a filter
2018-09-26T00:36:00.836Z
Call took 64 milliseconds.

```