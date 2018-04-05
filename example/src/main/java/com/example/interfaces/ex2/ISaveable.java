package com.example.interfaces.ex2;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
