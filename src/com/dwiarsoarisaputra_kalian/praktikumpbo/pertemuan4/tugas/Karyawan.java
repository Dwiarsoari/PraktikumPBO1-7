package com.dwiarsoarisaputra_kalian.praktikumpbo.pertemuan4.tugas;

public class Karyawan { 
	String NIP;
	String nama;
	String jenisKelamin;
	
	public void masukKerja() {
		System.out.println("Karyawan Masuk kerja");
	}
	public void showInfo(){
        System.out.println("Nama               : " + NIP);
        System.out.println("Jumlah Muatan Truk : " + nama);
        System.out.println("Kecepatan          : " + jenisKelamin);
    }
}
