package com.data.structure.queue.ex1;

public class Application {

    public static void main(String[] args) {

        System.out.println("First In is First Out");
        Queue queueCustom = new Queue();

        System.out.println("List is empty  : " + queueCustom.isEmpty());

        queueCustom.add("David");
        System.out.println(queueCustom);

        queueCustom.add("Smith");
        System.out.println(queueCustom);

        queueCustom.add("Phil");
        System.out.println(queueCustom);

        System.out.println("Removed : " + queueCustom.remove());
        System.out.println(queueCustom);

        System.out.println("List is empty  : " + queueCustom.isEmpty());
    }
}
