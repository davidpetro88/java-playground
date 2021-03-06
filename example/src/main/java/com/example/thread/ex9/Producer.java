package com.example.thread.ex9;

import java.util.List;

public class Producer implements Runnable {

  final int LIMIT = 5;
  private List<Integer> questionList = null;
  private int questionNumber;

  public Producer(List<Integer> questionList) {
    this.questionList = questionList;
  }

  public void readQuestion(int questionNumber) throws InterruptedException {
    synchronized (questionList) {
      while (questionList.size() == LIMIT) {
        System.out.println("Questions have pile up.. wait for answers");
        questionList.wait();
      }
    }

    synchronized (questionList) {
      System.out.println("New Question" + questionNumber);
      questionList.add(questionNumber);
      Thread.sleep(100);
      questionList.notify();
    }
  }

  @Override
  public void run() {
    while (true) {
      try {
        readQuestion(questionNumber++);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
