/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan20.targetsaldotabungan;

/**
 *
 * @author
 * NAMA  : Tias Gumelar Timorisky
 * KELAS : IF 3
 * NIM   : 10117111
 * Deskripsi Program : Program ini untuk menampilkan saldo yang berkelipatan 
 *                     sesuai dengan target yang dituju.
 */
public class PBO310117111Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Deklarasi variable
        double saldoAwal = 3500000;
        double bunga = 0.08;
        double target = 6000000;
        int i = 1;
        
        //proses dan output
        do {
            saldoAwal = (saldoAwal * bunga) + saldoAwal;
            System.out.println("Saldo di bulan ke-"+i+" Rp."+saldoAwal);
            i++;
        } while (saldoAwal <= target); 
        
    }
    
}
