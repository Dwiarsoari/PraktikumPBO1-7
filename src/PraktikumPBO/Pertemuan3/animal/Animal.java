/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO.Pertemuan3.animal;

public class Animal {
  // Attributes
  private String name;
  private int age;
  private String color;

  // Constructor 1
  public Animal() {}

  // Constructor 2
  public Animal(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  // Method untuk menampilkan semua isi attribute
  public void showProfile() {
    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
    System.out.println("Color: " + color);
    System.out.println();
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
  
}

