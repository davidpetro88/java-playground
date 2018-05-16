package com.example.nio.filesystems.read.directory.path.matcher.ex2;


import java.io.IOException;
import java.nio.file.*;

public class Application {
  public static void main(String[] args) {

    DirectoryStream.Filter<Path> filter =
      new DirectoryStream.Filter<Path>() {
        public boolean accept(Path path) throws IOException {
          return (Files.isRegularFile(path));
        }
      };

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
