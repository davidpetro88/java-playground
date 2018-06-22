package com.data.structure.queue.ex2;


import java.util.LinkedList;
import java.util.Queue;

public class Application {

    public static void main(String[] args) {

        System.out.println("First In is First Out");
        Queue<String> queue = new LinkedList<>();

        System.out.println("List is empty  : " + queue.isEmpty());

        queue.add("David");
        queue.add("Smith");
        queue.add("Phil");
        System.out.println(queue);

        System.out.println("Removed : " + queue.remove());
        System.out.println(queue);

        System.out.println("List is empty  : " + queue.isEmpty());

        System.out.println("Removed : " + queue.remove());
        System.out.println(queue);

        System.out.println("Removed : " + queue.remove());
        System.out.println(queue);
    }
}
