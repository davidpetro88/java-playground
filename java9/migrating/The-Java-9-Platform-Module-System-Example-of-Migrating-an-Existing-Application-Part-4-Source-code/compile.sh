javac --module-path mods 	\
	--module-source-path src  \
	-d out $(find src -name '*.java')	\
	 

jar --create --file mods/models.jar \
	-C out/models .

jar --create --file mods/main.jar \
	-C out/main .

