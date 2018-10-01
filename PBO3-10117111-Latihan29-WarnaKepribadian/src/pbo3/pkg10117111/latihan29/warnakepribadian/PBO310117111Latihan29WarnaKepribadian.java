/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan29.warnakepribadian;

import java.util.Scanner;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.BLACK;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.BLUE;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.BLUE2;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.BLUE_BACKGROUND;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.GREEN;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.GREEN_BACKGROUND;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.PURPLE;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.PURPLE_BACKGROUND;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.RED;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.RED_BACKGROUND;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.RESET;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.WHITE;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.YELLOW;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.YELLOW_BACKGROUND;
import static pbo3.pkg10117111.latihan29.warnakepribadian.Warna.hasilTest;

/**
 *
 * @author 
 * NAMA  : Tias Gumelar Timorisky
 * KELAS : IF 3
 * NIM   : 10117111
 * Deskripsi Program : Program ini untuk menampilkan kepribadian sesuai dengan 
 *                     inputan warna yang dipilih.
 */
public class PBO310117111Latihan29WarnaKepribadian{
  
   
    public static void main(String[] args) {
        
        //variabel
        String warnaMu;
        String namaMu;
        Scanner scn = new Scanner(System.in);
        
        //input
        System.out.print(BLACK + "PILIH WARNA FAVORITMU : ");
        
        System.out.println(RED + "YUK " + GREEN + ("CEK ") + YELLOW 
                + ("KEPRIBADIANMU ") + BLUE2 + ("DARI ") + PURPLE + 
                ("WARNA ") + BLUE + ("FAVORITMU\n")+RESET);
        
        //warna
        System.out.println(RED_BACKGROUND + WHITE + "\tMERAH\t\t");
        System.out.println(GREEN_BACKGROUND + WHITE + "\tHIJAU\t\t");
        System.out.println(YELLOW_BACKGROUND + WHITE + "\tKUNING\t\t");
        System.out.println(BLUE_BACKGROUND + WHITE + "\tBIRU\t\t");
        System.out.println(PURPLE_BACKGROUND + WHITE + "\tUNGU\t\t\n" + RESET);
        
        //input pilih warna
        System.out.print(BLACK + "PILIH WARNA FAVORITMU : ");
        warnaMu = scn.next();
        System.out.print(BLACK + "NAMA KAMU : ");
        namaMu = scn.next();
        
        
        
         //output hasil
         System.out.println("===HASIL TEST KEPRIBADIAN "+namaMu+("==="));
         System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + namaMu.toUpperCase()+"====");
        hasilTest(warnaMu);
    }
    
}
