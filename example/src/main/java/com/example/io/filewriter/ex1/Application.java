package com.example.io.filewriter.ex1;


import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Application {
  private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

  public static void main(String[] args) {

    FileWriter locFile = null;
    try {
      locFile = new FileWriter("locations.txt");
      for (Location location : locations.values()) {
        locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
      }
    } catch (IOException e) {
      System.out.println("In catch block");
      e.printStackTrace();
    } finally {
      System.out.println("in finally block");
      try {
        if (locFile != null) {
          System.out.println("Attempting to close locfile");
          locFile.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  static {
    Map<String, Integer> tempExit = new HashMap<String, Integer>();
    locations.put(0, new Location(0, "Write FileWriter Ex1 learning Java", null));
  }
}
