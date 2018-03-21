package com.example.oop;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White", 2);
        super.addAdditional("Chips", 2.75);
        super.addAdditional("Drink", 1.81);
    }
}
