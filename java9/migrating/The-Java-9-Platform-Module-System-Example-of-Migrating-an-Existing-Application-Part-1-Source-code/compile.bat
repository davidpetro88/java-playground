dir /S /B src\*.java > sources.txt

javac --class-path lib\gson-2.8.1.jar 	^
	-d out @sources.txt 

jar --create --file lib\person.jar ^
	-C out	.