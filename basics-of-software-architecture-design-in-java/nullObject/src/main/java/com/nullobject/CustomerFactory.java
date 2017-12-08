package com.nullobject;

/**
 * Created by david on 11/04/17.
 */
public class CustomerFactory {

    private Database database;

    public CustomerFactory() {
        this.database = new Database();
    }

    public AbstractCustomer getCustomer(String name){
        if(checkName(name)) return new RealCustomer(name);
        return new NullCostumer();
    }

    private boolean checkName(String name) {
        return database.existCustomer(name);
    }
}
