dir /S /B gson-src\gson\src\main\java\*.java > gson-sources.txt

javac --source-path gson-src\gson\src\main\java -d out\gson @gson-sources.txt

jar --create --file mods\gson.jar -C out\gson .