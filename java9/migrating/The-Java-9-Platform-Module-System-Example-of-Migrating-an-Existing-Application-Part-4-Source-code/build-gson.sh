javac --source-path gson-src/gson/src/main/java/ -d out/gson $(find gson-src/gson/src/main/java -name '*.java')

jar --create --file mods/gson.jar -C out/gson .
