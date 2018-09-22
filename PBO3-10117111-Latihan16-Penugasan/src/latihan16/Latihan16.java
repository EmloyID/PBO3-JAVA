/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan16;

/**
 *
 * @author 
 * NAMA     : Tias Gumelar Timorisky
 * KELAS    : IF-3
 * NIM      : 10117111
 * Deskripsi Program : Program ini untuk menampilkan penugasan dari tiap-tiap 
 *                     variabel
 */
public class Latihan16 {

    public static void main(String[] args) {
        
        //Variabel
        int a = 10;
        int b = 20;
        int c = 0;
        
        //Tampilan
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c + "\n");
        
        c = a + b;
        System.out.println("c = a + b = " + c);
        
        c += a;
        System.out.println("c += a = " + c);
        
        c -= a;
        System.out.println("c -= a = " + c);
        
        c *= a;
        System.out.println("c *= a = " + c);
        
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a " + c);
        
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " + c);
        
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        
        c >>= 2;
        System.out.println("c >>= a = " + c);
        
        c &= a;
        System.out.println("c &= a = " + c);
        
        c ^= a;
        System.out.println("c ^= a = " + c);
        
        c |= a;
        System.out.println("c |= a = " + c);
        
    }
    
}
