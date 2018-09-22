/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan7;

/**
 *
 * @author 
 * NAMA     : Tias Gumelar Timorisky
 * KELAS    : IF-3
 * NIM      : 10117111
 * Deskripsi Program : Program ini untuk menampilkan value integer yang 
 *                     sudah ditentukan
 */
public class Latihan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Deklarasi variabel
        byte b;
        short s;
        int i;
        long l;
        
        //Menambahkan nilai ke variabel
        b = 120;
        s = 32767;
        i = 1_000_000_000;
        l = 90000000000L;
        
        //Tampilan Output
        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
    }
    
}
