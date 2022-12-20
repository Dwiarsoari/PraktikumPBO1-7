package com.nama.praktikumpbo.pertemuan3.challenge;

public class Main {
    public static void main(String[] args) {
        Library central = new Library("Central Purbalingga ", 20, 2014);
       
        central.showProfile();
        central.setName("Perpustakaan Central Purbalingga");
        System.out.println("Name : "+ central.getName());

        central.setVisitsToday(20); 
        System.out.println("visitsToday  : "+ central.getVisitsToday());

        central.setYearsBuild(2014);
        System.out.println("yearsBuild : "+ central.getYearsBuild());
    }
}
