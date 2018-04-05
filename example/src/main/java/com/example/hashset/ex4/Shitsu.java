package com.example.hashset.ex4;

public class Shitsu extends Dog {

  public Shitsu(String name) {
    super(name);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj instanceof Shitsu) {
      String objName = ((Shitsu) obj).getName();
      return this.getName().equals(objName);
    }

    return false;
  }
}
