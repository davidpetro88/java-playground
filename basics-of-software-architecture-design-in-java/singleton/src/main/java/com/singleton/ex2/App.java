package com.singleton.ex2;

import com.singleton.ex1.Downloader;

/**
 * Created by david on 11/04/17.
 */
public class App {
    /**
     * Singleton Pattern -> restricts the instantiation of a class to one object
     *	This is useful when exactly one object is needed to coordinate actions across the system
     *
     *	- For example: We need just single database instance !!!
     */
    public static void main(String[] args) {
        SingletonClass.INSTANCE.setCounter(10);
        System.out.println(SingletonClass.INSTANCE.getCounter());
    }


}
