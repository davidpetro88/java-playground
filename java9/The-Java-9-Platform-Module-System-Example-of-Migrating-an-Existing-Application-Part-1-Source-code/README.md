
### Jdeps Summary gson-2.8.1.jar
```
$ jdeps -summary lib/gson-2.8.1.jar
gson-2.8.1.jar -> java.base
gson-2.8.1.jar -> java.sql

```


### Compile project
```
$ javac --class-path lib/gson-2.8.1.jar -d out $(find src -name '*.java')
```


### Create jar person
```
$ jar --create --file lib/person.jar -C out .

```


### View person jar
```
$ jar tf lib/person.jar
  META-INF/
  META-INF/MANIFEST.MF
  academy/
  academy/learnprogramming/
  academy/learnprogramming/models/
  academy/learnprogramming/models/Address.class
  academy/learnprogramming/models/Person.class
  academy/learnprogramming/main/
  academy/learnprogramming/main/Main.class

```

### Run project
```
java --class-path lib/gson-2.8.1.jar:lib/person.jar academy.learnprogramming.main.Main

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


### Jdeps Summary person.jar
```
$ jdeps -summary lib/person.jar
person.jar -> java.base
person.jar -> not found
```

### Jdeps person.jar
```
$ jdeps lib/person.jar
person.jar -> java.base
person.jar -> not found
   academy.learnprogramming.main                      -> academy.learnprogramming.models                    person.jar
   academy.learnprogramming.main                      -> com.google.gson                                    not found
   academy.learnprogramming.main                      -> java.io                                            java.base
   academy.learnprogramming.main                      -> java.lang                                          java.base
   academy.learnprogramming.main                      -> java.util                                          java.base
   academy.learnprogramming.models                    -> com.google.gson.annotations                        not found
   academy.learnprogramming.models                    -> java.lang                                          java.base
   academy.learnprogramming.models                    -> java.util                                          java.base
```

### Jdeps Summary person.jar with location jar
```
$ jdeps -summary --class-path lib/gson-2.8.1.jar lib/person.jar
  person.jar -> lib/gson-2.8.1.jar
  person.jar -> java.base
```
