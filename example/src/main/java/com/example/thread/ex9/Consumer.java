package com.example.thread.ex9;

import java.util.List;

public class Consumer implements Runnable {

    private List<Integer> questionList = null;

    public Consumer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void answerQuestion() throws InterruptedException {
        synchronized (questionList){
            while (questionList.isEmpty()) {
                System.out.println("No Questions to answers waiting for producer questions to get.");
                questionList.wait();
            }
        }

        synchronized (questionList){
            Thread.sleep(5000);
            System.out.println("ANSWERED Questions : " + questionList.remove(0));
            questionList.notify();
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                answerQuestion();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}