package com.example.nio.filesystems.temp.ex1;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Application {

  public static void main(String[] args) {


    String separator = File.separator;
    System.out.println(separator);
    separator = FileSystems.getDefault().getSeparator();
    System.out.println(separator);

    try {
      Path tempFile = Files.createTempFile("myapp", ".appext");  // C:\Users\???\AppData\Local\Temp\myapp1797805585146820741.appext
      System.out.println("Temporary file path = " + tempFile.toAbsolutePath());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

    Iterable<FileStore> stores = FileSystems.getDefault().getFileStores();
    for(FileStore store : stores) {
      System.out.println("Volume name/Drive letter = " + store);
      System.out.println("file store = " + store.name());
    }

    System.out.println("*******************");
    Iterable<Path> rootPaths = FileSystems.getDefault().getRootDirectories();
    for(Path path : rootPaths) {
      System.out.println(path);
    }
  }
}
