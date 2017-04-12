package com.strategy;

/**
 * Very important principle #1 in design -> take what varies and encapsulate it ... and it will not
 * affect the rest of our code
 * <p>
 * The code will be much more flexible ... later you can alter or extend the parts that vary without
 * affecting those that does not !!!
 * <p>
 * code that changes    <------->  code that stays the same
 * <p>
 * <p>
 * Very important principle #2 in design -> program to an interface/supertype not an implementation !!!
 * Abstract superclass would be perfect too ...
 * - the actual runtime object is not locked into the code
 * - the type of variable should be a supertype/interface: can be of any
 * concrete implementation
 * <p>
 * Dog dog = new Dog();    not so good  "programming to an implementation"
 * Animal dog = new Dog();   GOOD       "programming to an interface"
 * <p>
 * <p>
 * Sometimes it is good to separate behaviors from implementation: easier to reuse it
 * + we can add new behavior without modifying any of our existing behavior classes !!!
 * SOLID PRINCIPLE !!!
 * <p>
 * Very important principle #3 in design -> Favor composition over inheritance !!!
 * <p>
 * Composition: HAS-A relationship -> it gives you a lot more flexibility
 * 1. you can encapsulate stuffs into their own set of classes
 * 2. YOU CAN CHANGE BEHAVIOR AT RUNTIME with interfaces
 * So composition is used in several design patterns
 * <p>
 * Inheritance: IS-A relationship
 */

/**
 * Created by david on 09/04/17.
 */
public class App {

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setStrategy(new Multiply());
        manager.operation(5, 5);

        manager.setStrategy(new Add());
        manager.operation(5, 5);
    }
}
