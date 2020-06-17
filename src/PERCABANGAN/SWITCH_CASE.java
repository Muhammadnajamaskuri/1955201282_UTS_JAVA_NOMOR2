/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERCABANGAN;

/**
 *
 * @author WINDOWS 10
 */
public class SWITCH_CASE {
 public static void main(String args[]) {

      char nilai = 'A';

      switch(nilai) {
         case 'A' :
            System.out.println("BAIK SEKALI!");
            break;
         case 'B' :
            System.out.println("BAIK!");
            break;
         case 'C' :
            System.out.println("CUKUP BAIK");
            break;
         case 'D' :
            System.out.println("CUKUP");
         case 'F' :
            System.out.println("KURANG DARI CUKUP");
            break;
         default :
            System.out.println("NILAI YANG KAMU MASUKKAN SALAH");
      }
      System.out.println("NILAIMU  " + nilai);
   }
}   

