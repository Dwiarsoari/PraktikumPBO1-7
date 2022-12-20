package om.dwiarsoarisaputra.praktikumpbo.pertemuan5.tugas;

import java.util.Scanner;

public class Perkakas {
    public static void main(String[] args) {

        // membuat array buah-buahan
        String[] Perkakas = new String[4];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < Perkakas.length; i++ ){
            System.out.print("Perkakas ke-" + i + ": ");
            Perkakas[i] = scan.nextLine();
        }

        System.out.println("---------------------------");
        System.out.println("| DAFTAR PERKAKAS YANG ADA |");
        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : Perkakas ){
            System.out.println(b);
        }

    }
}
