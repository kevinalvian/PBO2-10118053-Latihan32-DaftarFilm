/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118053.latihan32.daftarfilm;

/**
 *
 * @author ACER
 * NAMA     : Kevin Alvian
 * KELAS    : IF-2
 * NIM      : 10118053
 * Deskripsi Program : Membuat program user login dengan berbasis objek pada 
 * java
 */
public class Film {
    String nama;
    String genre;
    Double rating;
    int duration;
    
    public void nowPlaying(String genre,String nama , Double rating ,int duration){
     System.out.println("Hallo everyone ");
     System.out.println("Judul Film: " +nama );
     System.out.println("Genre Film : "+genre);
     System.out.println("Rating Film : "+rating);
     System.out.println("Duration Film : "+duration+ " Menit");
     System.out.println("");
     System.out.println("Developed by Kevin Alvian");
    
    }
}
