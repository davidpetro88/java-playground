package com.solid.solution;

/**
 * Created by david on 08/04/17.
 */
public class Car implements NormalVehicle{

    @Override
    public void speed() {
        System.out.println("Speed up the car...");
    }

    @Override
    public void addFuel() {
        System.out.println("Adding fuel to car...");
    }
}

