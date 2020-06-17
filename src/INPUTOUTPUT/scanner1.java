/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUTOUTPUT;

/**
 *
 * @author WINDOWS 10
 */
//program perkalian
import java.util.Scanner;
public class scanner1 {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 // masukkan nilai dari keyboard
 System.out.print("Masukkan nilai1 = ");
 int nilai1 = input.nextInt();

 System.out.print("Masukkan nilai2 = ");
 int nilai2 = input.nextInt();
 // Hitung dan Print
 int jumlah = nilai1*nilai2;
 System.out.println("Jumlah = " + jumlah);
 }
}

