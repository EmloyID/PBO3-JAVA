/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4.Kambing;

/**
 *
 * @author Tias Gumelar Timorisky 10117111
 * IF-3 UNIKOM
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