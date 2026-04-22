package app;

import modules.Mahasiswa;
import services.ServiceMahasiswa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

        mahasiswas.addAll(Arrays.asList(
                new Mahasiswa("elang", 15250506, 85),
                new Mahasiswa("capyking", 15250507, 75),
                new Mahasiswa("capypoter", 15250508, 95)
        ));

        mahasiswas.stream()
                .filter(mahasiswa -> mahasiswa.nilai > 75)
                .forEach(ServiceMahasiswa::getInfoMahasiswas);
    }
}