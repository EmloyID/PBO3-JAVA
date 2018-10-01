/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA  : Tias Gumelar Timorisky
 * KELAS : IF 3
 * NIM   : 10117111
 * Deskripsi Program : Program ini untuk menghitung luas dari suatu
 *                     lingkaran menggunakan diameter lingkaran dan jari-jari.
 */
public class PBO310117111Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //scanner
        Scanner scanner = new Scanner(System.in);
        
        //deklarasi variable
        String diameter = null;
        double phi, jari, luas, keliling;
        phi = 3.14;
        boolean ulang = true;
        
        //looping input dan proses
        while (ulang == true){
        System.out.println("========Perhitungan Lingkaran=========");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        diameter = scanner.next();
        
        //looping output
        if (diameter.matches("[0-9]*")){
            double d = Double.parseDouble(diameter);
            jari = d/2;
            luas = phi*(Math.pow(jari, 2));
            keliling = 2*phi*jari;
                System.out.println("==========Hasil Perhitungan Lingkaran==========");
                System.out.println("Jari-jari Lingkaran : "+jari+" cm");
                System.out.println("Luas Lingkaran      : "+luas+" cm");
                System.out.println("Keliling Lingkaran  : "+keliling+" cm");
                ulang = false;
        } else {
                System.out.println("Nilai diameter tidak sesuai");
        }
        }

    }
    
}
