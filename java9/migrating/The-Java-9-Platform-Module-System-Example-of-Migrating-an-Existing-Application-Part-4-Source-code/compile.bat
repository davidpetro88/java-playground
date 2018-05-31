dir /S /B src\*.java > sources.txt

javac --module-path mods  ^
    --module-source-path src ^
    -d out @sources.txt

jar --create --file mods\models.jar ^
	-C out\models .

jar --create --file mods\main.jar ^
	-C out\main .



