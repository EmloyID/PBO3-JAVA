/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan15;

/**
 *
 * @author 
 * NAMA     : Tias Gumelar Timorisky
 * KELAS    : IF-3
 * NIM      : 10117111
 * Deskripsi Program : Program ini untuk menampilkan Logika dari variabel yang 
 *                     bertipe data boolean
 */
public class Latihan15 {

    public static void main(String[] args) {
        
        //Variabel
        boolean a = true;
        boolean b = false;
        
        //Tampilan
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);
        System.out.println("!(a && b) = " + !(a && b));
    }
    
}
