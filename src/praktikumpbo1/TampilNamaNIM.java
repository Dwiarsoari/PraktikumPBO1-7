/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo1;

/**
 *
 * @author hp
 */
import java.util.Scanner;
   
class TampilNamaNIM {
  public static void main(String args[]){
      
    Scanner input = new Scanner(System.in);
    String nama, nim;
 
    System.out.print("Nama Saya: ");
    nama = input.nextLine();
     
    System.out.print("NIM: ");
    nim = input.nextLine();
     
    System.out.println();
    System.out.println("Nama Saya: " + nama);
    System.out.println("NIM: " + nim);
  }
}