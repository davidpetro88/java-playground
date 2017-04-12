package com.solid.problem;

/**
 * Created by david on 09/04/17.
 */
public class DatabaseHandler {

    private MySQLDatabase mySQLDatabase;
    private OracleDatabase oracleDatabase;

    public DatabaseHandler() {
        this.mySQLDatabase = new MySQLDatabase();
        this.oracleDatabase = new OracleDatabase();
    }

    public void connectMySQL(){
        mySQLDatabase.connect();
    }

    public void disconnectMySQL(){
        mySQLDatabase.disconnect();
    }

    public void connectOracle(){
        oracleDatabase.connect();
    }

    public void disconnectOracle(){
        oracleDatabase.disconnect();
    }
}
