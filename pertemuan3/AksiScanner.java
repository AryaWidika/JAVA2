/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan3;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class AksiScanner {
    public static void main (String agrs[]){
        
        // membuat objek baru
        ClassScanner scan = new ClassScanner();
        
        scan.inputScanner();
        System.out.println("\n Nama anda :"+scan.getnama());
        System.out.println("Nilai Anda :"+scan.rata());
    }
}
