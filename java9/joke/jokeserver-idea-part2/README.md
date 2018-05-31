### MakeJRE (Create Custom JRE)
```
./makeJRE.sh
```

#### Size Image
```
$ du -sh out/jre
  102M	out/jre
```

#### List Modules
```
$ out/jre/bin/java --list-modules
  academy.learnprogramming.jokeapp.ui
  academy.learnprogramming.jokeserver
  academy.learnprogramming.jokeserver.kid
  academy.learnprogramming.jokeserver.programmer
  java.base@9.0.4
  java.datatransfer@9.0.4
  java.desktop@9.0.4
  java.logging@9.0.4
  java.prefs@9.0.4
  java.scripting@9.0.4
  java.sql@9.0.4
  java.xml@9.0.4
  javafx.base@9.0.4
  javafx.controls@9.0.4
  javafx.fxml@9.0.4
  javafx.graphics@9.0.4
  jdk.jsobject@9.0.4
```

### MakeJRE-Small
```
./makeJRE-small.sh
```

#### Size Image
```
du -sh out/jre
 48M	out/jre
```

#### Run custom JRE
```
$ out/jre/bin/JOKER
```

![](image.png)