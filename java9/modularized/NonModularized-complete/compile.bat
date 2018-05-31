dir /S /B src\*.java > sources.txt

javac --source-path src -d out @sources.txt
