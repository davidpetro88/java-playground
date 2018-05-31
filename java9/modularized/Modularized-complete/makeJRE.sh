rm -rf jre
$JAVA_HOME/bin/jlink	\
	--module-path $JAVA_HOME/jmods:out \
	--add-modules academy.learnprogramming.jokeapp \
	--launcher JOKER=academy.learnprogramming.jokeapp/academy.learnprogramming.jokeapp.Main 	\
	--output jre

