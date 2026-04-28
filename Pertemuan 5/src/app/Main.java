package app;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        InputStream is = Main.class.getResourceAsStream("/app/data.txt");
        System.out.println(is);
//        File file = new File(is);
//
//        if (file.exists()) {
//            System.out.println("file aja");
//        } else {
//            System.out.println("file tidak ada");
//        }
    }
}