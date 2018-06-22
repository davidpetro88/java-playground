package com.data.structure.set;


public class Application {

    public static void main(String[] args) {
        Set setCustom = new Set();

        setCustom.add("Anderson");
        setCustom.add("David");
        setCustom.add("David");
        System.out.println(setCustom);

        setCustom.add("Daniel");
        setCustom.add("Dan");
        System.out.println(setCustom);

        setCustom.add("Bob");
        setCustom.add("Brian");
        setCustom.add("Chris");
        setCustom.add("Charles");
        System.out.println(setCustom);

        setCustom.remove("Dan");
        System.out.println(setCustom);
    }
}
