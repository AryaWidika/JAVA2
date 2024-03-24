/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjava;

/**
 *
 * @author Asus
 */
public class OptLogika {
    public static void main(String[]agrs){
        System.out.println("Operasi And");
        System.out.println("true && true"+ (true && true));
        System.out.println("true && false"+ (true && false));
        System.out.println("false && true"+ (false && true));
        System.out.println("false && false"+ (false && false));
        
        System.out.println("\nOperasi OR");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false =" + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        System.out.println("\nOperasi XOR");
        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("true ^ false = " + (true ^ false));
        System.out.println("false ^ true = " + (false ^ true));
        System.out.println("false ^ false = " + (false ^ false));

        System.out.println("\nOperasi NOT");
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));
    }
}
