package com.example.io.resource.ex1;


import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Application {
  private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

  public static void main(String[] args) throws IOException {
    try (FileWriter locFile = new FileWriter("locations.txt")) {
      for (Location location : locations.values()) {
        locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
      }
    }
  }

  static {
    Map<String, Integer> tempExit = new HashMap<String, Integer>();
    locations.put(0, new Location(0, "Write Resource Ex1 learning Java", null));
  }

}
