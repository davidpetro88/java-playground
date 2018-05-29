module academy.learnprogramming.jokeserver.kid {
    requires academy.learnprogramming.jokeserver;

    exports academy.learnprogramming.jokeserver.kid;

    provides academy.learnprogramming.jokeserver.JokeServer
            with academy.learnprogramming.jokeserver.kid.KidJokeServer;

}