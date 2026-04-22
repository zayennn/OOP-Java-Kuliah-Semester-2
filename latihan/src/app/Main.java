package app;

import modules.Mahasiswa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

        mahasiswas.addAll(
                Arrays.asList(
                        new Mahasiswa("elang", 15250506, 85)
                )
        );
    }
}