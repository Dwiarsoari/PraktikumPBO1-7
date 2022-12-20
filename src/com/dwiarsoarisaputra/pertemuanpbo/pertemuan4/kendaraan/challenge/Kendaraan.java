package com.dwiarsoarisaputra.pertemuanpbo.pertemuan4.kendaraan.challenge;

public class Kendaraan {
    String nama;
    int jmlmuatan;
    int kecepatan;
    
    public void showInfo(){
        System.out.println("Nama               : " + nama);
        System.out.println("Jumlah Muatan Truk : " + jmlmuatan);
        System.out.println("Kecepatan          : " + kecepatan);
        extraInfo();
    }
    
    public void extraInfo(){}
    
}