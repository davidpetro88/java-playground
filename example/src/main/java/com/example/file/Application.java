package com.example.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
