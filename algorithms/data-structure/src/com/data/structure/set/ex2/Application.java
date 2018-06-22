package com.data.structure.set.ex2;


import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        Set setCustom = new HashSet();

        setCustom.add("Anderson");
        setCustom.add("David");
        setCustom.add("David");
        setCustom.add("Daniel");
        setCustom.add("Dan");
        setCustom.add("Bob");
        setCustom.add("Brian");
        setCustom.add("Chris");
        setCustom.add("Charles");
        System.out.println(setCustom);

        setCustom.remove("Dan");
        System.out.println(setCustom);

        System.out.println("david".hashCode());
        System.out.println("david".hashCode());
    }
}
