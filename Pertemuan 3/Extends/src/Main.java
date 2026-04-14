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

        public void setStatus() {
            if (this.nilai < 0 || this.nilai > 100) {
                throw new IllegalArgumentException("this.nilai tidak boleh kurang dari 0 atau lebih dari 100!");
            } else if (this.nilai > 85) {
                this.nilai_akhir = 'A';
                this.status += "lulus";
            } else if (this.nilai > 75) {
                this.nilai_akhir = 'B';
                this.status += "lulus";
            } else if (this.nilai > 65) {
                this.nilai_akhir = 'C';
                this.status += "lulus tapi direkomendasikan untuk her";
            } else if (this.nilai > 50) {
                this.nilai_akhir = 'D';
                this.status += "her";
            } else {
                this.nilai_akhir = 'E';
                this.status = "her";
            }
        }

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

        System.out.print("Masukan nama mahasiswa : ");
        mahasiswa1.nama = input.nextLine();

        System.out.print("Masukan nim mahasiswa : ");
        mahasiswa1.nim = input.nextInt();
        input.nextLine();
    }
}