import java.util.Scanner;

public class Main {
    String nama;
    int nim;
    int nilai;
    char nilai_akhir;
    String status = "";

    public void getStatus() {
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

    public void getInfoMahasiswa() {
        System.out.printf("""
                
                ============= Status Mahasiswa =============
                Nama Mahasiswa      : %s
                Nim Mahasiswa       : %d
                Nilai Mahasiswa     : %c
                Status Mahasiswa    : %s
                """, this.nama, this.nim, this.nilai_akhir, this.status);
    }

    public static void main(String[] args) {
        Main mahasiswa = new Main();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama : ");
        mahasiswa.nama = input.nextLine();

        System.out.print("Masukan nim : ");
        mahasiswa.nim = input.nextInt();
        input.nextLine();

        System.out.print("Masukan nilai : ");
        mahasiswa.nilai = input.nextInt();
        input.nextLine();

        mahasiswa.getStatus();
        mahasiswa.getInfoMahasiswa();
    }
}