/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Tias Gumelar Timorisky
 * KELAS : IF 3
 * NIM   : 10117111
 * Deskripsi Program : Program ini untuk mencari nilai terbesar dan terkecil
 *                     dalam nilai mahasiswa.
 */
public class PBO310117111Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //deklarasi variabel
        String namaP;
        int no, min, max, banyakMhs;
        int[] nilai = new int[100];

         //scanner
        Scanner scanner = new Scanner(System.in);
        
        //Tampilan output
        System.out.println
        ("========Program Nilai Terbesar dan Terkecil nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        namaP = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakMhs = scanner.nextInt();
        
        for (no = 1; no <= banyakMhs; no++){    
        System.out.print("Masukkan Nilai Mahasiswa ke- "+no+" : ");
        nilai[no] = scanner.nextInt();
        }
        
        //inisialisasi
        max = 0;
        min = 100;
        
        System.out.println("\n"+"=========Hasil Nilai Mahasiswa=========");
        for (no=1; no<=nilai[no];no++){
        if (nilai[no]<min){
            min = nilai[no];
        }
        else if (nilai[no]>max){
            max= nilai[no];
        }
        if (nilai[no]>max){
            max= nilai[no];
        }
        
        System.out.print("Nilai Mahasiswa ke- "+no+" : "+nilai[no]+"\n");
        }
        
        System.out.println("\n"+"Nilai Terbesar adalah "+max);
        System.out.println("Nilai Terkecil adalah "+min+"\n");
        System.out.println("Petugas "+namaP+"\n");
    }
    
}
