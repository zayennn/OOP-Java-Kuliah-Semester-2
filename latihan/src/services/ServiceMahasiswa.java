package services;

import modules.Mahasiswa;

public class ServiceMahasiswa {
    public static void getInfoMahasiswas(Mahasiswa mhs) {
        System.out.printf("""
                Nama mahasiswa  : %s
                NIM mahasiswa   : %d
                Nilai mahasiswa : %d
                """, mhs.nama, mhs.nim, mhs.nilai);
    }
}