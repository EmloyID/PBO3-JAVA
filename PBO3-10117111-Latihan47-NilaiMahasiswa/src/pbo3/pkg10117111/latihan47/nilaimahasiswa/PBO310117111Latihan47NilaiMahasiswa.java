/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Tias Gumelar Timorisky
 * KELAS : IF 3
 * NIM   : 10117111
 * Deskripsi Program : Program ini untuk menampilkan output Nilai Mahasiswa.
 */
public class PBO310117111Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scn1 =  new Scanner(System.in);
        Scanner scn2 =  new Scanner(System.in);
        Scanner scn3 =  new Scanner(System.in);
        
        Nilai nilai = new Nilai();
        nilai.getNA();
        
        System.out.print("Quiz\t = ");
        nilai.setQuiz(scn1.nextDouble());
        System.out.print("UTS\t = ");
        nilai.setUTS(scn2.nextDouble());
        System.out.print("UAS\t = ");
        nilai.setUAS(scn3.nextDouble());
        
        System.out.println("\nNilai Akhir "+nilai.nilaiAkhir());
        System.out.println("\nIndeks = "+nilai.Indeks());
        System.out.println("Keterangan = "+nilai.aturanKeterangan());
        
    }
    
}
