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
import javax.swing.JOptionPane;
public class JOption_Pane {
 // Mengimport Class JOptionPane
    public static void main(String[] args){
        String nama; // Variale String Untuk Menyimpan Input
        //Memunculkan Pesan Dialog serta Menerima Input Dari User
        nama = JOptionPane.showInputDialog("Siapa Nama Kamu?");
        //Menampilkan Pesan kepada User
        JOptionPane.showMessageDialog(null, "Salam Kenal "+nama);
    }
}   

