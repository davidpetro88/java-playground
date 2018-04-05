package com.example.generics.ex1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

  public static void main(String[] args) {
    Container<Integer, String> container = new Container<>(12, "Hello World");

    Set<String> mySet1 = new HashSet<>();
    mySet1.add("first");
    mySet1.add("second");
    mySet1.add("third");

    Set<String> mySet2 = new HashSet<>();
    mySet2.add("fourth");
    mySet2.add("fifth");
    mySet2.add("sixth");

    Set<String> union = union(mySet1, mySet2);
    Iterator<String> iterator = union.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
    Set<E> result = new HashSet<>(set1);
    result.addAll(set2);
    return result;
  }
}
