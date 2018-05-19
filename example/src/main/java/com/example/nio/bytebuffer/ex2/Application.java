package com.example.nio.bytebuffer.ex2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Application {

  public static void main(String[] args) {

    try (FileOutputStream binFile = new FileOutputStream("data.dat");
         FileChannel binChannel = binFile.getChannel()) {

      ByteBuffer buffer = ByteBuffer.allocate(10);
      byte[] outputBytes = "Hello".getBytes();
      buffer.put(outputBytes);
      byte[] outputBytes2 = "World".getBytes();
      buffer.put(outputBytes2);
//      buffer.flip();
      binChannel.write(buffer);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
