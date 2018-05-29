module academy.learnprogramming.jokeserver.programmer {
    requires academy.learnprogramming.jokeserver;
    exports academy.learnprogramming.jokeserver.programmer;
    provides academy.learnprogramming.jokeserver.JokeServer
            with academy.learnprogramming.jokeserver.programmer.ProgrammerJokeServer;


}