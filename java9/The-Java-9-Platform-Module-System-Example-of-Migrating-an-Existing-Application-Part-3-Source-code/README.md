
### Compile project
```
$ ./compile.sh
```

### build jar
```
$ ./buildjars.sh
```


### run
```
$ ./buildjars.sh
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

### describe module main jar
```
$ jar --describe-module --file mods/main.jar
  main jar:file:///Users/davidpetro/Documents/courses/java/java-playground/java9/The-Java-9-Platform-Module-System-Example-of-Migrating-an-Existing-Application-Part-3-Source-code/mods/main.jar/!module-info.class
  requires gson
  requires java.base mandated
  requires models
  contains academy.learnprogramming.main

```

### describe module gson jar
```
$ jar --describe-module --file mods/gson-2.8.1.jar
No module descriptor found. Derived automatic module.

gson@2.8.1 automatic
requires java.base mandated
contains com.google.gson
contains com.google.gson.annotations
contains com.google.gson.internal
contains com.google.gson.internal.bind
contains com.google.gson.internal.bind.util
contains com.google.gson.reflect
contains com.google.gson.stream

```