/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan4;

/**
 *
 * @author Asus
 */
public class InisialisasiArray2 {
    public static void main(String[]agrs)
    {
     int i,j;
     int[][] nil_akhir = {{150, 159, 230},{100, 125, 150},{210,125,156}};
     
     System.out.println("Data yang diinput ke elemen array \n");
     // menampilkan data dari elemen array
     for (i=0; i<3; i++)
     {
      for(j=0; j<3; j++)
      {
       System.out.print("Nilai Akhir Index["+i+"]{"+j+"]=");
       System.out.println("="+nil_akhir [i][j]);
      }   
     }
    }
}
