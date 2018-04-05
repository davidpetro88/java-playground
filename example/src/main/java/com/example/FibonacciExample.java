package com.example;

public class FibonacciExample {

  public static void main(String[] args) {
    System.out.println(fibonacci(5));

  }

  public static long fibonacci(int number) {
    if(number == 0) return 0;
    else if(number == 1) return 1;

    long nMinus1 = 1;
    long nMinus2 = 0;
    long fib = 0;
    for ( int i=1; i < number; i++) {
      fib = (nMinus2 + nMinus1);
      System.out.println("minMinus2 :" + nMinus2 + " minMinus1 : " +  nMinus1 + " = " + fib);
      nMinus2 = nMinus1;
      nMinus1 = fib;
    }
    return fib;
  }
}
