
rmdir /S /Q  out\jre

"%JAVA_HOME%\bin\jlink.exe" ^
	--module-path "%JAVA_HOME%\jmods";out\production ^
	--add-modules academy.learnprogramming.jokeapp.ui ^
	--add-modules academy.learnprogramming.jokeserver.kid ^
    --add-modules academy.learnprogramming.jokeserver.programmer ^
	--launcher JOKER=academy.learnprogramming.jokeapp.ui/academy.learnprogramming.jokeapp.ui.Main ^
	--output out\jre
