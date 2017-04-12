package com.solid.solution;

/**
 * Created by david on 09/04/17.
 */
public class MySQLDatabase implements Database {

    @Override
    public void connect(){
        System.out.println("Connecting to MySQL database...");
    }

    @Override
    public void disconnect(){
        System.out.println("Disconnect to MySQL database...");
    }

}
