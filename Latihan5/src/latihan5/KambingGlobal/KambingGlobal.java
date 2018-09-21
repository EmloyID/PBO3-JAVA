/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5.KambingGlobal;

/**
 *
 * @author Tias Gumelar Timorisky 10117111
 * IF-3 UNIKOM
 */
public class KambingGlobal {

   //Variabel jumlahKambing menjadi Variabel Instance
   int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        
        System.out.println("Jumlah Kambing : "+jumlahKambing); 
    }
    
    public void tambahKambing() {
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah : "+jumlahKambing);
    }
    
   public static void main(String[] args) {
       
       KambingGlobal kambingSusu = new KambingGlobal();
       
       //Menampilkan jumlah kambing yang ada saat program pertama kali berjalan
       kambingSusu.getJumlahKambing();
       
       //menambah satu kambing
       kambingSusu.tambahKambing();
       
       //menampilkan jumlah kambing yang ada
       kambingSusu.getJumlahKambing();
   }
}