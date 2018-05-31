dir /S /B src\*.java > sources.txt

javac --module-path mods ^
	--module-source-path src ^
	-d out @sources.txt
