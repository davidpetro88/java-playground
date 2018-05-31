
dir /S /B src\*.java > sources.txt

javac --module-source-path src -d out @sources.txt