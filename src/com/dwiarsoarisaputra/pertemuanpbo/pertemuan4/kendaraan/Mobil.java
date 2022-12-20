
package com.dwiarsoarisaputra.pertemuanpbo.pertemuan4.kendaraan;

public class Mobil extends Kendaraan {
    
   int maxGear;
    
    public void belok(String arah){
        System.out.println("Mobil " + nama + "belok ke " + arah + "!");
    }
    public void belok(){
        System.out.println("error : mohon masukan arah");
    }
    public void exstraInfo(){
        System.out.println("Max Gear"+ maxGear);
    }
}