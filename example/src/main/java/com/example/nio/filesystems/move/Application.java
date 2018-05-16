package com.example.nio.filesystems.move;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Application {
  public static void main(String[] args) {
    try {
      Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
      Path destination = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
      Files.move(fileToMove, destination);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
