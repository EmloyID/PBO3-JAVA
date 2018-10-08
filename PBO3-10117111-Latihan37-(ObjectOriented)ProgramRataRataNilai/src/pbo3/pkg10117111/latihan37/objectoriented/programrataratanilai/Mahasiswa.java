/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan37.objectoriented.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Tias Gumelar Timorisky
 * KELAS    : IF-3
 * NIM      : 10117111
 * Deskripsi Program : Program ini untuk mencari rata-rata nilai.
 */
public class Mahasiswa {
    public int nilaiMhs;
    public double totalNilaiMhs;
    Scanner scn = new Scanner(System.in);

    public double HitungTotal(int parNilaiMhs, int parN){
        for (int i=1; i<=parN; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            parNilaiMhs = scn.nextInt();
            totalNilaiMhs += parNilaiMhs;
        }
    return totalNilaiMhs;}

    public double HitungRataRataNilaiMhs(double total, int jmlhMhs) {
        return total/jmlhMhs;
    }
    
}
