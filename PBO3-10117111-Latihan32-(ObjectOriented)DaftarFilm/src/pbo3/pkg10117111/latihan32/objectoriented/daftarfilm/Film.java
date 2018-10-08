/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117111.latihan32.objectoriented.daftarfilm;

/**
 *
 * @author 
 * NAMA     : Tias Gumelar Timorisky
 * KELAS    : IF-3
 * NIM      : 10117111
 * Deskripsi Program : Program ini untuk menampilkan variabel 
 *                     mahasiswa ke mainclass film.
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String parJudul, String parGenre, double parRating, int parDuration){
        System.out.println("Judul Film  : "+parJudul);
        System.out.println("Genre Film  : "+parGenre);
        System.out.println("Rating Film : "+parRating);
        System.out.println("Duration Film : "+parDuration+" menit\n");
    }
    
}
