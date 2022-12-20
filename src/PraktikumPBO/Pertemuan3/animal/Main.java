/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Pertemuan3.animal;
  public class Main {
  public static void main(String[] args) {
    Animal cat = new Animal("Miyu", 3, "Black");
    Animal dog = new Animal("Shepard", 2, "Brown");
    Animal rabbit = new Animal("Snowball", 1, "White");

    cat.showProfile();
    dog.showProfile();
    rabbit.showProfile();
    
    System.out.println("Dog's name (before): " + dog.getName());
    dog.setName("Cheddar");
    System.out.println("Dog's name (after) : " + dog.getName());
  }
}