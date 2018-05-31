package academy.learnprogramming.jokeapp;

import academy.learnprogramming.jokeserver.JokeServer;
import academy.learnprogramming.jokeserver.kid.KidJokeServer;
import academy.learnprogramming.jokeserver.programmer.ProgrammerJokeServer;

import java.util.Scanner;


public class Main {

    public static void main(String [] args) {

        JokeServer programmer = new ProgrammerJokeServer();
        JokeServer kid = new KidJokeServer();
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {

            System.out.print("\n(K)id joke or (P)rogrammer joke? (Q to quit) : ");
            choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("K")) {
                System.out.println(kid.getJoke());
            } else if (choice.equals("P")) {
                System.out.println(programmer.getJoke());
            }

        } while (!choice.equals("Q"));

        System.out.println("Thanks! I hope you laughed!!");

    }
}