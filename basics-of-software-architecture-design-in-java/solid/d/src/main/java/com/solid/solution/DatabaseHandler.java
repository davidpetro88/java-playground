package com.solid.solution;

/**
 * Created by david on 09/04/17.
 */
public class DatabaseHandler {

    private Database database;

    public DatabaseHandler(Database database) {
        this.database = database;
    }

    public void connect(){
        database.connect();
    }

    public void disconnect(){
        database.disconnect();
    }
}
