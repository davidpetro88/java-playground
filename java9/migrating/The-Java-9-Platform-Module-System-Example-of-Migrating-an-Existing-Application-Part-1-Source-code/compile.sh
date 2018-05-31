javac --class-path lib/gson-2.8.1.jar 	\
	-d out $(find src -name '*.java')

jar --create --file lib/person.jar \
	-C out	.

