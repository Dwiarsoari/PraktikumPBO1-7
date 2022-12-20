
package com.dwiarsoarisaputra.pertemuanpbo.pertemuan4.kendaraan;

public class Kendaraan {
    
    //Attribut (variable)
    String nama;
    int jmlRoda;
    
    
    // Method
    public void nyalakanMesin(){
        System.out.println("Mesin " + nama + "telah dinyalakan!");
    }
    
    public void showInfo(){
        System.out.println("Nama    : " + nama);
        System.out.println("Jml roda : "  + jmlRoda);
        extraInfo();
    }
    
    public void extraInfo(){}
    
}