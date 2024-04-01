/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;
import java.util.Scanner;
/**
 *
 * @author 
 */
public class LatScanner {
    public static void main(String agrs[])
    {
    
        //membuat objek baru 
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel 
        String nama;
        int n2;
        double n1,n3;
        
        System.out.print("Masukan nama anda : ");
        nama = input.nextLine();
        System.out.print("Masukan Nilai 1 : ");
        n1 = input.nextDouble();
        System.out.print("Masukan Nilai 2 : ");
        n2 = input.nextInt();
        
        n3 = n1 + n2;
        System.out.print("\n Nama anda : "+nama);
        
        System.out.print("Nilai anda : "+ n3);
    }
}
