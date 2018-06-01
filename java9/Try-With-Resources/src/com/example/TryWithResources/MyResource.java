package com.example.TryWithResources;

/**
 * <p>
 * The MyResource class is used to demonstrate the
 * behavior of the try-with-resources statement in Java
 * Note that this class implements AutoClosable which
 * is required with try-with-resources
 * <p>
 * When the resource id is:
 * 0 - no exceptions are thrown
 * 1 - an exception is thrown in the process method
 * 2 - an exception is thrown in the close method
 * 3 - exceptions are thrown in BOTH the process and close methods
 */

public class MyResource implements AutoCloseable {
    int id;

    public MyResource(int id) {
        this.id = id;
        System.out.println("Creating resource " + id);
    }


    public void process() throws Exception {
        System.out.println("Processing resource " + id);
        if (id == 1 || id == 3) {
            throw new Exception("Exception in process");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing resource " + id);
        if (id == 2 || id == 3)
            throw new Exception("Exception in close");
    }
}

