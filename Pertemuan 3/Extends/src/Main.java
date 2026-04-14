import java.util.Scanner;

public class Main {
    static class Mahasiswa {
        public String nama;
        public int nim;

        public void getInfoMahasiswa() {
            System.out.printf("""
                    Nama Mahasiswa : %s
                    NIM Mahasiswa  : %d
                    """, this.nama, this.nim);
        }
    }

    static class TambahMahasiswa extends Mahasiswa {
        int nilai;
        char nilai_akhir;
        String status = "";

        @Override
        public void getInfoMahasiswa() {
            System.out.printf("""
                    Nama Mahasiswa          : %s
                    NIM Mahasiswa           : %d
                    Nilai Mahasiswa         : %d
                    Nilai Akhir Mahasiswa   : %c
                    Status Mahasiswa        : %s
                    """, this.nama, this.nim, this.nilai, this.nilai_akhir, this.status);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TambahMahasiswa mahasiswa1 = new TambahMahasiswa();

        mahasiswa1.nama = "elang";
        mahasiswa1.nim = 123;
        mahasiswa1.nilai = 75;
        mahasiswa1.nilai_akhir = 'C';
        mahasiswa1.status = "lulus";
        mahasiswa1.getInfoMahasiswa();
    }
}