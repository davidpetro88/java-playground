package com.example.oop;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
  private String name;
  private String meat;
  private double price;
  private String breadRollType;
  private List<Aditional> aditionalList;
  private int maxAditionalItem;

  public Hamburger(String name, String meat, double price, String breadRollType, int maxAditionalItem) {
    this.name = name;
    this.meat = meat;
    this.price = price;
    this.breadRollType = breadRollType;
    this.maxAditionalItem = maxAditionalItem;
    this.aditionalList = new ArrayList<>();
  }

  public void addAdditional(String name, double price) {
    if (maxAditionalItem >= aditionalList.size() + 1) aditionalList.add(new Aditional(name, price));
    else System.out.println("You don't can add any more additional item : " + name + " price :" + price);
  }

  public double itemizeHamburger() {
    double hamburgerPrice = this.price;
    System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
      + "with " + this.meat + ", price is " + this.price);
    this.aditionalList.forEach(aditional -> {
      System.out.println("Added " + aditional.getName() + " for an extra " + aditional.getPrice());
    });
    hamburgerPrice += this.aditionalList.stream().map(aditional -> aditional.getPrice()).reduce(0.0, Double::sum);
    return hamburgerPrice;
  }
}
