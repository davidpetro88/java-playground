package com.example.thread.ex11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

  public static void main(String[] args) {

    ExecutorService executorService = Executors.newFixedThreadPool(2);

    Runnable processor = new MessageProcessor(1);
    executorService.execute(processor);

    Runnable processor2 = new MessageProcessor(2);
    executorService.execute(processor2);

    Runnable processor3 = new MessageProcessor(3);
    executorService.execute(processor3);

    Runnable processor4 = new MessageProcessor(4);
    executorService.execute(processor4);

    Runnable processor5 = new MessageProcessor(5);
    executorService.execute(processor5);

    // Rejects any new tasks from being submitted. Gracefully shuts down the service
    executorService.shutdown();

    // Terminate the executor service immediately
    executorService.shutdownNow();

    while (!executorService.isTerminated()) { }

    System.out.println("Submitted all tasks.....");
  }
}
