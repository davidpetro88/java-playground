package com.example.nio.filesystems.create.ex2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Application {
  public static void main(String[] args) {
    try {
      Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
      Files.createDirectories(dirToCreate);

      Path dirToCreat2 = FileSystems.getDefault().getPath("Examples", "Dir2/Dir3/Dir4/Dir5/Dir6");
      Files.createDirectories(dirToCreat2);

//      windows
//      Path dirToCreate3 = FileSystems.getDefault().getPath("Examples", "Dir_2\\Dir_3\\Dir_4\\Dir_5\\Dir_6");
//      Files.createDirectories(dirToCreate3);

      Path dirToCreate4 = FileSystems.getDefault().getPath("Examples/Dir2/Dir3/Dir4/Dir5/Dir6/Dir7");
      Files.createDirectories(dirToCreate4);

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
