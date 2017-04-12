package com.factory;

/**
 * Created by david on 11/04/17.
 */
public class App {
    /**
     * Factory Pattern: helps to create loosely coupled OO designs !!!
     * <p>
     * WHAT IS THE PROBLEM WITH THE NEW KEYWORD?
     * <p>
     * We should not program to an implementation, we should program to an interface
     * BUT every time we use 'new' keyword we do so !!!
     * <p>
     * - so when we instantiate a class that is definitely an implementation
     * <p>
     * - tying our code to a concrete class: make our application
     * more fragile and less flexible
     * <p>
     * - in java -> if we program to an interface, our system will work for any class
     * implementing that interface ( because of polymorphism )
     * <p>
     * <p>
     * The concrete new Dog() classes may have to be changed as new concrete classes
     * are added: so our code will not be closed for modification
     * <p>
     * - we have to find the part in our code that will change -> separate it
     * - WE MAY ENCAPSULATE OBJECT CREATION
     * <p>
     * We can do it with Factory Pattern !!!
     */

    public static void main(String[] args) {

        Algorithm algorithm = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SPANNING_TREE);
        algorithm.solve();
    }
}
