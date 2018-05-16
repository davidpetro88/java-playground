package com.example.nio.filesystems.rename;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Application {
  public static void main(String[] args) {
    try {
      Path fileToMoveRename = FileSystems.getDefault().getPath("Examples", "file1.txt");
      Path destinationRename = FileSystems.getDefault().getPath("Examples", "file2.txt");
      Files.move(fileToMoveRename, destinationRename);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
