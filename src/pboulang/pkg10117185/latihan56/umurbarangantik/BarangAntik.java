/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan56.umurbarangantik;

/**
 *
 * @author user
 * Nama     : Andhyka Widariyanto
 * NIM      : 10117185
 * Kelas    : PBO-Ulang
 * Tugas    : Latihan 56 - Umur Barang Antik
 */
public class BarangAntik {
    //Atribute
    int umur;
    
    //Construction
    BarangAntik (int parUmur){
        umur = parUmur;
    }
    
    //Function
    void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : "+umur+" tahun.");
    }
}
