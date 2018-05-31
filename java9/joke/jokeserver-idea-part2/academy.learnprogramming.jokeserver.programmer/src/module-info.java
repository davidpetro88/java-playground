module academy.learnprogramming.jokeserver.programmer {
    requires academy.learnprogramming.jokeserver;
    requires java.sql;

    provides academy.learnprogramming.jokeserver.JokeServer
            with academy.learnprogramming.jokeserver.programmer.ProgrammerJokeServer;

}