package com.example.lambda.stream.challenge;

import java.util.function.Function;

public class Challenge2 {

  public static void main(String[] args) {
    String myString = "Let's split this up into an array";

    System.out.println(everySecondChar(myString));


    System.out.println("\n ======================================================================");
    System.out.println("1 - Write the following method as a lmbda expression.");
    Function<String, String> lambdaFunction = s -> {
      StringBuilder returnVal = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        if (i % 2 == 1) {
          returnVal.append(s.charAt(i));
        }
      }

      return returnVal.toString();
    };

    System.out.println(lambdaFunction.apply(myString));
  }

  public static String everySecondChar(String source){
    StringBuilder returnVal = new StringBuilder();
    for (int i = 0; i < source.length(); i++) {
      if (i % 2 == 1) {
        returnVal.append(source.charAt(i));
      }
    }
    return returnVal.toString();
  }
}
