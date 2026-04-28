package app;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int i, j;
        double total = 0;
        String[] jenis, ukuran, nama;
        int[] jumlah_beli;
        double[] harga, jumlah_harga, pajak, total_bayar;

        jenis = new String[10];
        jenis[0] = "baju";
        jenis[1] = "sepatu";
        jenis[2] = "kaos";
        jenis[3] = "jaket";
        jenis[4] = "celana";

        for ( int k = 0; k < jenis.length; k++ ) {
            System.out.println(k);
        }
    }
}