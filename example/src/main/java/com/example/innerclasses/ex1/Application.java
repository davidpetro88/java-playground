package com.example.innerclasses.ex1;

public class Application {

    public static void main(String[] args) {
	    Gearbox mcLaren = new Gearbox(6);
      mcLaren.addGear(2,60);
      mcLaren.addGear(3,111);
      mcLaren.changeGear(2);
      mcLaren.operateClutch(true);

      System.out.println(mcLaren.wheelSpeed(90));
      System.out.println(mcLaren.wheelSpeed(200));
      System.out.println(mcLaren.wheelSpeed(300));

      System.out.println(mcLaren);

    }
}
