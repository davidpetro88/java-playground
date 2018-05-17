package com.example.filereader.ex2;

import java.io.*;

public class Application {

  public static void main(String[] args) {
    File file = new File("file.txt");
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    try {
      fileReader = new FileReader(file);
      bufferedReader = new BufferedReader(fileReader);
      String line = bufferedReader.readLine();
      while (line != null) {
        System.out.println(line);
        line = bufferedReader.readLine();
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (bufferedReader != null) bufferedReader.close();
        if (fileReader != null) fileReader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
