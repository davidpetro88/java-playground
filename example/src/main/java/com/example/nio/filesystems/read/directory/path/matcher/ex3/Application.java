package com.example.nio.filesystems.read.directory.path.matcher.ex3;


import java.io.IOException;
import java.nio.file.*;

public class Application {
  public static void main(String[] args) {
    System.out.println("Regular Path");
    regularFile();

    System.out.println("\n Not Regular Path");
    notRegularFile();
  }

  private static void regularFile() {
    DirectoryStream.Filter<Path> filter = p -> Files.isRegularFile(p);
    Path directory = FileSystems.getDefault().getPath("Examples/FileTree/Dir2");
    try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
      for (Path file : contents) {
        System.out.println(file.getFileName());
      }
    } catch (IOException | DirectoryIteratorException e) {
      e.printStackTrace();
    }
  }
  private static void notRegularFile() {
    DirectoryStream.Filter<Path> filter = p -> !Files.isRegularFile(p);
    Path directory = FileSystems.getDefault().getPath("Examples/FileTree/Dir2");
    try (DirectoryStream<Path> contents = Files.newDirectoryStream(directory, filter)) {
      for (Path file : contents) {
        System.out.println(file.getFileName());
      }
    } catch (IOException | DirectoryIteratorException e) {
      e.printStackTrace();
    }
  }
}
