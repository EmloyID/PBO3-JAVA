/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamalia;

/**
 *
 * @author riski
 */
public class KambingStatic {
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " Memiliki Kambing Sebanyak "+Mamalia.jumlahKambing);
    }
    
}
