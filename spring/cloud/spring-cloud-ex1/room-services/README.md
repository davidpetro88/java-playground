#room-services

Run first the config-server

### List Rooms
 * Get http://localhost:8101/rooms
 
 ```
 [
     {
         "id": 1,
         "name": "Piccadilly",
         "roomNumber": "P1",
         "bedInfo": "1Q"
     },
     {
         "id": 2,
         "name": "Piccadilly",
         "roomNumber": "P2",
         "bedInfo": "1Q"
     },
     {
         "id": 3,
         "name": "Piccadilly",
         "roomNumber": "P3",
         "bedInfo": "1Q"
     },
     {
         "id": 4,
         "name": "Piccadilly",
         "roomNumber": "P4",
         "bedInfo": "2D"
     },
     {
         "id": 5,
         "name": "Piccadilly",
         "roomNumber": "P5",
         "bedInfo": "2D"
     },
     {
         "id": 6,
         "name": "Piccadilly",
         "roomNumber": "P6",
         "bedInfo": "2D"
     },
     {
         "id": 7,
         "name": "Cambridge",
         "roomNumber": "C1",
         "bedInfo": "1K"
     },
     {
         "id": 8,
         "name": "Cambridge",
         "roomNumber": "C2",
         "bedInfo": "1K"
     },
     {
         "id": 9,
         "name": "Cambridge",
         "roomNumber": "C3",
         "bedInfo": "1K"
     },
     {
         "id": 10,
         "name": "Westminster",
         "roomNumber": "W1",
         "bedInfo": "1K"
     },
     {
         "id": 11,
         "name": "Westminster",
         "roomNumber": "W2",
         "bedInfo": "1K"
     },
     {
         "id": 12,
         "name": "Westminster",
         "roomNumber": "W3",
         "bedInfo": "1K"
     },
     {
         "id": 13,
         "name": "Westminster",
         "roomNumber": "W4",
         "bedInfo": "1K"
     },
     {
         "id": 14,
         "name": "Westminster",
         "roomNumber": "W5",
         "bedInfo": "2D"
     },
     {
         "id": 15,
         "name": "Westminster",
         "roomNumber": "W6",
         "bedInfo": "2D"
     },
     {
         "id": 16,
         "name": "Westminster",
         "roomNumber": "W7",
         "bedInfo": "2D"
     },
     {
         "id": 17,
         "name": "Oxford",
         "roomNumber": "O1",
         "bedInfo": "1K"
     },
     {
         "id": 18,
         "name": "Oxford",
         "roomNumber": "O2",
         "bedInfo": "1K"
     },
     {
         "id": 19,
         "name": "Oxford",
         "roomNumber": "O3",
         "bedInfo": "1Q"
     },
     {
         "id": 20,
         "name": "Oxford",
         "roomNumber": "O4",
         "bedInfo": "1Q"
     },
     {
         "id": 21,
         "name": "Oxford",
         "roomNumber": "O5",
         "bedInfo": "1Q"
     },
     {
         "id": 22,
         "name": "Victoria",
         "roomNumber": "V1",
         "bedInfo": "1K"
     },
     {
         "id": 23,
         "name": "Victoria",
         "roomNumber": "V2",
         "bedInfo": "2D"
     },
     {
         "id": 24,
         "name": "Victoria",
         "roomNumber": "V3",
         "bedInfo": "2D"
     },
     {
         "id": 25,
         "name": "Manchester",
         "roomNumber": "M1",
         "bedInfo": "1K"
     },
     {
         "id": 26,
         "name": "Manchester",
         "roomNumber": "M2",
         "bedInfo": "1K"
     },
     {
         "id": 27,
         "name": "Manchester",
         "roomNumber": "M3",
         "bedInfo": "1K"
     },
     {
         "id": 28,
         "name": "Manchester",
         "roomNumber": "M4",
         "bedInfo": "1K"
     }
 ]
 
 ```

### Find by Id
 * Get http://localhost:8101/rooms/1

 ```
 {
     "id": 1,
     "name": "Piccadilly",
     "roomNumber": "P1",
     "bedInfo": "1Q"
 }
 ```
 
### Swagger
* Get http://localhost:8101/swagger-ui.html