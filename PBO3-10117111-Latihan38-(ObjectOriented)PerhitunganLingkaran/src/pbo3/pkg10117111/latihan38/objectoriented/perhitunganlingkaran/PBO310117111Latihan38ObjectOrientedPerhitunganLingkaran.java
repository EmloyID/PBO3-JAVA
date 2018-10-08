/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan38.objectoriented.perhitunganlingkaran;

/**
 *
 * @author 
 * NAMA     : Tias Gumelar Timorisky
 * KELAS    : IF-3
 * NIM      : 10117111
 * Deskripsi Program : Program ini untuk menampilkan tampilan program 
 *                     perhitungan lingkaran.
 */
public class PBO310117111Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
    
}
