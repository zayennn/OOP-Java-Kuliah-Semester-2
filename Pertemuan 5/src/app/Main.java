package app;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/app/data.txt");

        if (file.exists()) {
            System.out.println("file aja");
        } else {
            System.out.println("file tidak ada");
        }
    }
}