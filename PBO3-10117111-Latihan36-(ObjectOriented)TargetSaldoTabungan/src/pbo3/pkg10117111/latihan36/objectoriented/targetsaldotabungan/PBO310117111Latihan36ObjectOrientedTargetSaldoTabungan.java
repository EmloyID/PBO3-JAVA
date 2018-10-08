/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan36.objectoriented.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA     : Tias Gumelar Timorisky
 * KELAS    : IF-3
 * NIM      : 10117111
 * Deskripsi Program : Program ini untuk menampilkan menu saldo tabungan.
 */
public class PBO310117111Latihan36ObjectOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tabungan tab = new Tabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo,saldoTarget);

    }
    
}
