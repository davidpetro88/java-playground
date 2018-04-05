package com.example.hashset.ex5;

public class Application {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println("Compare Labrador with Dog : " + rover2.equals(rover));
        System.out.println("Compare Dog with Labrador : " +rover.equals(rover2));
    }
}
