package com.example.nio.filesystems.temp.ex2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Application {

  public static void main(String[] args) {
    try {
      Path tempFile = Files.createTempFile("myapp", ".appext");  // C:\Users\???\AppData\Local\Temp\myapp1797805585146820741.appext
      System.out.println("Temporary file path = " + tempFile.toAbsolutePath());

      Path copyFile = FileSystems.getDefault().getPath("Examples", "TempCopyFile.txt");
      Files.copy(tempFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

      System.out.println("Compy file path = " + copyFile.toAbsolutePath());

    } catch(IOException e) {
      System.out.println(e.getMessage());
    }

  }
}
