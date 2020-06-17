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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Buffered_Readerr {
public static void main(String[] args) throws IOException {

        String nama,umur;

        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);

        // Mengisi varibel nama dengan Bufferreader
        System.out.print  ("Inputkan nama: ");
        nama = br.readLine();
        System.out.print  ("Inputkan Umur: ");
        umur = br.readLine();
        // tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama + " umurmu sekarang adalah " + umur + " tahun ");

    }

}


