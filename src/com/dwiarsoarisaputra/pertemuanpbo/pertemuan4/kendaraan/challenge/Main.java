package com.dwiarsoarisaputra.pertemuanpbo.pertemuan4.kendaraan.challenge;

public class Main {
    public static void main(String[] args) {
        Truk tronton = new Truk();
        Kendaraan kn= new Kendaraan();
        
        tronton.nama = "Tronton";
        tronton.jmlmuatan = 400;
        tronton.kecepatan = 80;
  
        kn.nama ="Truk tidak dikenal";
        kn.jmlmuatan= 120;
        kn.kecepatan=10;
      
        tronton.showInfo();
        tronton.tujuan("Bogor");
        
        kn.showInfo();
    }
}
