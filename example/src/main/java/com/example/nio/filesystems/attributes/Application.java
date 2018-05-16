package com.example.nio.filesystems.attributes;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class Application {
  public static void main(String[] args) {
    try {
      Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1/file1.txt");
      long size = Files.size(filePath);
      System.out.println("Size = " + size);
      System.out.println("Last modified =  " + Files.getLastModifiedTime(filePath));


      BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
      System.out.println("Size =  " + attrs.size());
      System.out.println("Last modified =  " + attrs.lastModifiedTime());
      System.out.println("Created = " + attrs.creationTime());
      System.out.println("Is directory = " + attrs.isDirectory());
      System.out.println("Is regular file = " + attrs.isRegularFile());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
