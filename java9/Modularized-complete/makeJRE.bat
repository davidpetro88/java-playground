
rmdir /S /Q  out\jre

"%JAVA_HOME%\bin\jlink.exe" ^
	--module-path "%JAVA_HOME%\jmods";out ^
	--add-modules academy.learnprogramming.jokeapp ^
	--launcher JOKER=academy.learnprogramming.jokeapp/academy.learnprogramming.jokeapp.Main ^
	--output out\jre