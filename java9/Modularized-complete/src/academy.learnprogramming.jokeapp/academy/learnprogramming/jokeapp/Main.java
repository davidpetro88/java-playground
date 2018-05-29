package academy.learnprogramming.jokeapp;

import academy.learnprogramming.jokeserver.*;

public class Main {

	public static void main(String [] args) {

	 final int NUM_JOKES = 20;

     JokeServer s = new JokeServer();

     System.out.printf("Displaying %d random jokes from %s\n", NUM_JOKES , s.name());
     System.out.println("-------------------------------------------");
        for (int i=0; i<NUM_JOKES; i++)
            System.out.println(s.getJoke() + "\n") ;

    }
}