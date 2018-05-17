package com.example.nio.filesystems.delete;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Application {
  public static void main(String[] args) {
    try {
      Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
      Files.deleteIfExists(fileToDelete);
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
