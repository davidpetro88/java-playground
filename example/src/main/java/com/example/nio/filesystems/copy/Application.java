package com.example.nio.filesystems.copy;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Application {
  public static void main(String[] args) {
    try {
      Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
      Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
      Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}
