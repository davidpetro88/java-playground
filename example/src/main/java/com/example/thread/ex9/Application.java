package com.example.thread.ex9;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) {

    List<Integer> questionList = new ArrayList<>();

    Thread threadOne = new Thread(new Producer(questionList));
    Thread threadTwo = new Thread(new Consumer(questionList));

    threadOne.start();
    threadTwo.start();
  }
}
