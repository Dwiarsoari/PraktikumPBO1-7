package com.dwiarsoarisaputra.praktikumpbo.pertemuan6;

public class Exception1 {
 public static void main(String[] args) {
 int a[]=new int[5];
 try
 {
 a[5]=100;
 }
 catch(Exception e)
 {
 System.out.println("terlalu banyak");
 }
 }
}
