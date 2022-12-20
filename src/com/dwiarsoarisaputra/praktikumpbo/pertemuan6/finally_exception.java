package com.dwiarsoarisaputra.praktikumpbo.pertemuan6;

public class finally_exception {

    public static void main(String[] args) {
        try{
           int angka = 5;
           int hasil = angka/0;
           System.out.println(hasil);
        }catch(ArithmeticException ex){
            System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
        }finally{
            System.out.println("Program Diakhiri");
        }
    }
}

