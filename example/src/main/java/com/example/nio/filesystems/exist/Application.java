package com.example.nio.filesystems.exist;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

  public static void main(String[] args) {

    Path path = FileSystems.getDefault().getPath("thisFileDoesNotExist.txt");
    System.out.println(path.toAbsolutePath());

    Path path2 = Paths.get("/Volumes/Test/ING", "abcdef", "whatever.txt");
    System.out.println(path2.toAbsolutePath());

    Path path3 = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
    System.out.println(path3.toAbsolutePath());

    System.out.println("Exists = " + Files.exists(path));
    System.out.println("Exists = " + Files.exists(path2));
    System.out.println("Exists = " + Files.exists(path3));
  }
}
