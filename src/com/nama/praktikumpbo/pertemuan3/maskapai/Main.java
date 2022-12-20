package com.nama.praktikumpbo.pertemuan3.maskapai;

public class Main {
    public static void main(String[] args) {
       Pesawat boeing= new Pesawat(58000, "Putih Biru", "Garuda Indonesia");
       Pesawat airbus = new Pesawat(50000, "Merah Putih", "Lion Air");
       
       boeing.showProfile();
       airbus.showProfile();
    }
}

