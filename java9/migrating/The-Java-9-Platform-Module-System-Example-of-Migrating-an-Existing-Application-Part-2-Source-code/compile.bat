dir /S /B src\*.java > sources.txt

javac --module-path mods  ^
      --add-modules gson  ^
	-d out @sources.txt 

jar --create --file lib\person.jar ^
	-C out	.
