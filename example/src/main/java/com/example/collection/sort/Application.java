package com.example.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {

    public static void main(String[] args) {
        HashSet<Employer> hashSet = new HashSet<Employer>();
        hashSet.add(new Employer("Mike", 3500, "Accounting"));
        hashSet.add(new Employer("Paul", 3000, "Admin"));
        hashSet.add(new Employer("Peter", 3500, "IT"));
        hashSet.add(new Employer("Angel", 2700, "Support 1"));
        hashSet.add(new Employer("Andrew", 2300, "Support 2"));

        ArrayList<Employer> myList = new ArrayList<Employer>(hashSet);
        Collections.sort(myList);

        System.out.println(myList);

    }
}
