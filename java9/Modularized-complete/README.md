### Compile
```
./compile.sh
```

### Run
```
./run.sh
```


### MakeJar
```
./makejars.sh
```

### MakeJRE (Create Custom JRE)
```
./makeJRE.sh
```

#### Size Image
```
$ du -sh jre
 36M    jre

```

#### List Modules
```
$ jre/bin/java --list-modules
academy.learnprogramming.jokeapp
academy.learnprogramming.jokeserver
java.base@9.0.4
java.logging@9.0.4

```

### MakeJRE-Small
```
./makeJRE-small.sh
```

#### Size Image
```
du -sh jre
 22M    jre
```