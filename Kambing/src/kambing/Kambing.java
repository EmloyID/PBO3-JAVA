/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 *
 * @author riski
 */
import java.util.Scanner;

/**
 *
 * @author riski
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
