/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.Kambing;

/**
 *
 * @author 
 * NAMA     : Tias Gumelar Timorisky
 * KELAS    : IF-3
 * NIM      : 10117111
 * Deskripsi Program : Program ini untuk menampilkan value dari variabel 
 *                     jumlahKambing
 */
public class Kambing {
    
    public void tambahKambing() {
      
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah : "+jumlahKambing);
        
    }
    
    public static void main(String[] args) {

       Kambing kambingJantan = new Kambing();
       kambingJantan.tambahKambing();
        
    }

}