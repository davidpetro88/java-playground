
### Compile project
```
$ javac --module-path mods --add-modules gson -d out $(find src -name '*.java')

```

### Create jar person
```
$ jar --create --file lib/person.jar -C out .

```

### Run project
```
$ java --module-path mods --class-path lib/person.jar \
 --add-modules gson academy.learnprogramming.main.Main

 [
   {
     "id": "S0123",
     "name": "Frank",
     "age": 18,
     "addresses": [
       {
         "street": "123 Main Street",
         "city": "Miami",
         "state": "FL"
       },
       {
         "street": "45 Maple Drive",
         "city": "Ft. Lauderdale",
         "state": "FL"
       }
     ]
   },
   {
     "id": "S0456",
     "name": "James",
     "age": 28,
     "addresses": [
       {
         "street": "45 Madison Avenue",
         "city": "New York",
         "state": "NY"
       }
     ]
   }
 ]

```

### jdeps summary gson-2.8.1.jar
```
$ jdeps -summary mods/gson-2.8.1.jar
gson-2.8.1.jar -> java.base
gson-2.8.1.jar -> java.sql
```

### jdeps summary person.jar
```
$ jdeps --add-modules gson -summary --module-path mods lib/person.jar
   gson -> java.base
   gson -> java.sql
   person.jar -> gson
   person.jar -> java.base

```