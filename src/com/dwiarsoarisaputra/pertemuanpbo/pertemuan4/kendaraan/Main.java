
package com.dwiarsoarisaputra.pertemuanpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        //class object = new class
        Mobil toyota = new Mobil();
        Kendaraan kn= new Kendaraan();
        
        toyota.nama = "avanza";
        toyota.jmlRoda = 4;
        toyota.maxGear = 5;
        
        kn.nama =" kendaraan Misterius";
        kn.jmlRoda= 4;
        
        // uji coba pemanggilan method
        
        toyota.showInfo();
        toyota.belok("kanan");
        toyota.belok();
        
        kn.showInfo();
    }
    
}