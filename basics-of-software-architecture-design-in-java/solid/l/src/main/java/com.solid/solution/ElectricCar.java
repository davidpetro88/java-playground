package com.solid.solution;

/**
 * Created by david on 08/04/17.
 */
public class ElectricCar implements ElectricVehicle {
    @Override
    public void speed() {
        System.out.println("Speed up the car...");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Charging the battery...");
    }
}
