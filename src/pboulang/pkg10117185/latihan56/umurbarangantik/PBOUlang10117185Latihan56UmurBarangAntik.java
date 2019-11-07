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
public class PBOUlang10117185Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio rad = new Radio(234);
        rad.setName("Radio AM");
        System.out.println("Nama barang Antik : "+rad.getName());
        rad.tampilUmur();
    }
    
}
