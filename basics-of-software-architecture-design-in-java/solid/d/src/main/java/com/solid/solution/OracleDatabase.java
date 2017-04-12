package com.solid.solution;

/**
 * Created by david on 09/04/17.
 */
public class OracleDatabase implements Database {
    @Override
    public void connect(){
        System.out.println("Connecting to Oracle database...");
    }

    @Override
    public void disconnect(){
        System.out.println("Disconnect to Oracle database...");
    }
}
