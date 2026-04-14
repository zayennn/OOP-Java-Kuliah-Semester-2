package service;

import module.HitungLuas;

public class HitungLuasService {
    public void getInfo(HitungLuas hitungLuas) {
        System.out.printf("luas dari %d x %d = %d", hitungLuas.alas, hitungLuas.tinggi, (hitungLuas.alas * hitungLuas.tinggi));
    }
}