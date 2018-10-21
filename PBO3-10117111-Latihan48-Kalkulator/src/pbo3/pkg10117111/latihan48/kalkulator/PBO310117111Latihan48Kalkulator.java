/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan48.kalkulator;

/**
 *
 * @author 
 * NAMA  : Tias Gumelar Timorisky
 * KELAS : IF 3
 * NIM   : 10117111
 * Deskripsi Program : Program ini untuk membuat operasi kalkulator.
 */
public class PBO310117111Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kalkulator objKal = new Kalkulator();
        objKal.setValue1(7.0);
        objKal.setValue2(5.0);
        System.out.println("VALUE 1 = "+objKal.getValue1());
        System.out.println("VALUE 2 = "+objKal.getValue2());
        objKal.setNameProject();
        objKal.setNoteProject("");
        System.out.println("Result Add is = "+objKal.add());
        System.out.println("Result Minus is = "+objKal.minus());
        System.out.println("Result Multiple is = "+objKal.multiplication());
        System.out.println("Result Division is = "+objKal.division());
    }
    
}
