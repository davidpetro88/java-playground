package com.example.nio.filesystems.tree.walk;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Application {
  public static void main(String[] args) {

    System.out.println("---Walking Tree for Dir2---");
    Path dir2Path = FileSystems.getDefault().getPath("Examples/FileTree" + File.separator + "Dir2");
    try {
      Files.walkFileTree(dir2Path, new PrintNames());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

  }
}
