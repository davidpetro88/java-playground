package com.example.hashset.ex4;

public class Application {
    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");
        Shitsu shitsu = new Shitsu("Rover");

        System.out.println("Compare Labrador with Dog : " + rover.equals(rover2));
        System.out.println("Compare Dog with Labrador : " + rover2.equals(rover));
        System.out.println("Compare Shitsu with Dog : " + shitsu.equals(rover2));
        System.out.println("Compare Dog with Shitsu : " + rover2.equals(shitsu));
    }
}
