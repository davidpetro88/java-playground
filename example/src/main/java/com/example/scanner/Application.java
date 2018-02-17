package com.example.scanner;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        System.out.println("This program will ask 3 questions:");
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i <=3; i++ ){
            System.out.println(questions(i));
            String enteredText = scanner.nextLine();
            System.out.println(enteredText);
        }
    }

    private static String questions(int questionId){
        String question;
        switch (questionId) {
            case 0:  question = "what is your favorite color? ";
                break;
            case 1:  question = "what is your favorite food? ";
                break;
            case 2:  question = "What is your favorite TV show? ";
                break;
            default: question = "Finish thanks for answer the questions.. =)";
                break;
        }
        return question;
    }
}
