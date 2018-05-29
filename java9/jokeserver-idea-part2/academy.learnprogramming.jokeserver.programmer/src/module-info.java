module academy.learnprogramming.jokeserver.programmer {
    requires academy.learnprogramming.jokeserver;
    requires java.sql;

  //  exports academy.learnprogramming.jokeserver.programmer;

    provides academy.learnprogramming.jokeserver.JokeServer
            with academy.learnprogramming.jokeserver.programmer.ProgrammerJokeServer;

}