/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Tias Gumelar Timorisky
 * KELAS : IF 3
 * NIM   : 10117111
 * Deskripsi Program : Program ini untuk membandingkan dua buah nilai angka.
 */
public class PBO310117111Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //deklarasi variabel
        int nilai1, nilai2;
        String aktifitas = "Ya";
        int i = 0;
        
        //scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====Program Perbandingan Nilai=====");
        while ("Ya".equals(aktifitas)) {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = scanner.nextInt();
            System.out.print("Masukkan nilai kedua   : ");
            nilai2 = scanner.nextInt();
        
            //proses dan output
            if (nilai1 > nilai2) {
                System.out.println("Hasil : "+nilai1+" Lebih Besar Dari "+nilai2);
            }
            else if (nilai2 > nilai1) {
                System.out.println("Hasil : "+nilai2+" Lebih Besar Dari "+nilai1);
            }
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            aktifitas = scanner.next();
            System.out.println("");
        }
        System.out.println("");
    }
    
}
