package com.example.autoclose;

public class MyCustoAutoClose implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Initialize auto close");
    }

    public String getMessage(){
        return "Hello World";
    }
}
