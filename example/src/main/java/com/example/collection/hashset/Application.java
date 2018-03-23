package com.example.collection.hashset;

import java.util.HashSet;

public class Application {

  public static void main(String[] args) {
    HashSet<Integer> numbers = new HashSet<Integer>();
    numbers.add(100);
    numbers.add(100);
    numbers.add(200);
    numbers.add(45);
    numbers.add(1000);
    numbers.stream().forEach(System.out::println);
    System.out.println("Size : " + numbers.size());

    HashSet<Animal> animalHashSet = new HashSet<Animal>();
    animalHashSet.add(new Animal("Dog", 3));
    animalHashSet.add(new Animal("Bird", 1));
    animalHashSet.add(new Animal("Dog", 3));

    animalHashSet.stream().forEach(dog -> System.out.println("Animal : " + dog.getName() + " age : " + dog.getAge()));
    System.out.println("Size : " + animalHashSet.size());
  }
}