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

        while (true) {
            System.out.print("""
                    Manajemen Mahasiswa
                    1. Tambah mahasiswa
                    2. Hapus mahasiswa
                    3. Cari mahasiswa berdasarkan nama/nim
                    4. Urutkan mahasiswa berdasarkan nilai/nim
                    5. Filter mahasiswa berdasarkan nilai tertinggi/terendah
                    6. Keluar
                    """);

            System.out.print("Masukan menu pilihan anda (1/2/3/4/5/6) : ");
            int menu = input.nextInt();
            input.nextLine();
        }
    }
}