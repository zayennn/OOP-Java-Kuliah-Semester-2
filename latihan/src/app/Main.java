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
                    1. Lihat semua daftar mahasiswa
                    2. Tambah mahasiswa
                    3. Hapus mahasiswa
                    4. Cari mahasiswa berdasarkan nama/nim
                    5. Urutkan mahasiswa berdasarkan nilai/nim
                    6. Filter mahasiswa berdasarkan nilai tertinggi/terendah
                    7. Keluar
                    """);

            System.out.print("\nMasukan menu pilihan anda (1/2/3/4/5/6) : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    int count = 0;
                    for (Mahasiswa mhs : mahasiswas) {
                        count++;
                        System.out.printf("========= Mahasiswa ke - %d =========", count);
                        ServiceMahasiswa.getInfoMahasiswas(mhs);
                    }
                    return;

                case 2:
                    System.out.print("Masukan nama mahasiswa : ");
                    String nama = input.nextLine();

                    System.out.print("Masukan nim mahasiswa : ");
                    int nim = input.nextInt();
                    input.nextLine();
            }
        }
    }
}