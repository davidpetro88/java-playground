package com.example.nio.bytebuffer.ex3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Application {

  public static void main(String[] args) {

    try (FileOutputStream binFile = new FileOutputStream("data.dat");
         FileChannel binChannel = binFile.getChannel()) {

      ByteBuffer buffer = ByteBuffer.allocate(100);
      byte[] outputBytes = "Hello World!".getBytes();
      byte[] outputBytes2 = "Nice to meet you".getBytes();
      buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2)
        .putInt(1000);


      buffer.flip();
      binChannel.write(buffer);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
