

package academy.learnprogramming.jokeserver;

import academy.learnprogramming.jokeserver.internal.Filter;

import java.util.List;

public class JokeServer {

    List<String> jokes = List.of(
           "Some people, when confronted with a problem, think, 'I know, I'll use threads' - and then two they hav erpoblesms.",
            "Why do programmers always mix up Halloween and Christmas?\nBecause Oct 31 equals Dec 25.",
            "There are only 10 kinds of people in this world: those who know binary and those who don't.",
            "Have you heard about the new Cray super computer?  It's so fast, it executes an infinite loop in 6 seconds.",
            "The generation of random numbers is too important to be left to chance.",
            "Debugging: Removing the needles from the haystack.",
            "Programming is 10% science, 20% ingenuity, and 70% getting the ingenuity to work with the science.",
            "How many programmers does it take to change a light bulb?\nNone – It's a hardware problem.",
            "One hundred little bugs in the code\n" +
                    "One hundred little bugs.\n" +
                    "Fix a bug, link the fix in,\n" +
                    "One hundred little bugs in the code.",
            "Knock, knock.\nRace condition.\n Who's there.",
            "In order to understand recursion you must first understand recursion.",
            "Why do Java programmers wear glasses?\nBecause they don't C#!",
            "A group of DBAs walk into a diner.\nOne waved over the waiter: 'Can we join these tables?'.",
            "I've got a really good UDP joke to tell you, but I don't know if you'll get it"

    );

    private static int getRandomInteger(int maximum, int minimum){ return ((int) (Math.random()*(maximum - minimum))) + minimum; }

    public String getJoke() {
        int index = getRandomInteger(jokes.size(),0) ;
        return Filter.clean(jokes.get(index));
    }

    public int availableJokes() {
        return jokes.size();
    }

    public String name() {
        return "Joke Server";
    }

}
