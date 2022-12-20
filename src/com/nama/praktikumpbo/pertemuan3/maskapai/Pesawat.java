package com.nama.praktikumpbo.pertemuan3.maskapai;

public class Pesawat {
    int ketinggian;
    String warna;
    String maskapai;
    
    public Pesawat(int ketinggian, String warna, String maskapai){
    this.ketinggian = ketinggian;
    this.warna = warna;
    this.maskapai = maskapai;
    }
  
    public void showProfile(){
        System.out.println("Ketinggian Max : "+ketinggian);
        System.out.println("Warna : "+warna);
        System.out.println("Maskapai : "+maskapai);
    }
    
    
}