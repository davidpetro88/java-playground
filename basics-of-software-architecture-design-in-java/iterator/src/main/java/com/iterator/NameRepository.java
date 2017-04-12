package com.iterator;

/**
 * Created by david on 10/04/17.
 */
public class NameRepository {

    private String[] names = {"Adam","Joe","John","Sarah"};

    public Iterator getIterator(){
        return new NameIterator(names);
    }
}
