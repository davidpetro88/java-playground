package com.nullobject;

/**
 * Created by david on 11/04/17.
 */
public class NullCostumer extends AbstractCustomer {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getCustomer() {
        return "No customer with the given name exists in the database...";
    }
}
