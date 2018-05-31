javac --module-path mods	\
	--add-modules gson	\
	-d out $(find src -name '*.java')

jar --create --file lib/person.jar \
	-C out	.

