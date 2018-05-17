package com.example.nio.filesystems.create.ex1;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Application {
  public static void main(String[] args) {
    try {
      Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file1.txt");
      Files.createFile(fileToCreate);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
