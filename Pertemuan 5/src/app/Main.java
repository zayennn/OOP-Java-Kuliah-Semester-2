package app;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\athaz\\IdeaProjects\\Kuliah Semester 2\\src\\app\\data.txt");

        if (file.exists()) {
            System.out.println("file aja");
        } else {
            System.out.println("file tidak ada");
        }

//        System.out.println(file.getAbsolutePath());
    }
}