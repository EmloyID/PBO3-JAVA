/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.kambing;

/**
 *
 * @author riski
 */
public class KambingGlobal {
    
    int jumlahKambing = 88;
    
    public void getJumlahKambing() {
        
        System.out.println("Jumlah Kambing : "+jumlahKambing); 
    }
    
    public void tambahKambing() {
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambah : "+jumlahKambing);
    }
    
   public static void main(String[] args) {
       
       KambingGlobal kambingSusu = new KambingGlobal();
       
       kambingSusu.getJumlahKambing();
       
       kambingSusu.tambahKambing();
       
       kambingSusu.getJumlahKambing();
   }
}
