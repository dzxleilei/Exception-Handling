/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan3.multiplecatch;

/**
 *
 * @author ACER
 */
//import java.io.BufferedReader;
import java.io.FileReader; // Membaca File
import java.io.FileNotFoundException; // Menangkap Error File Tidak Ditemukan
import java.io.IOException; // Menangkap Error File Bermasalah

public class Latihan3MultipleCatch {

    // Fungsi untuk membaca File apakah ada atau tidak, jika ada akan mengeluarkan isi dari file tersebut
    public static String bacaFile(String fileName) throws FileNotFoundException, IOException{
        
   
        // StringBuilder memungkinkan manipulasi String tanpa menciptakan objek baru
        StringBuilder content = new StringBuilder();
            try (FileReader file = new FileReader(fileName)) {
                int character;

                // Pengulangan untuk memasukkan karakter yang ditemukan ke dalam "content", digabungkan menggunakan append
                while ((character = file.read()) != -1) {
                    content.append((char) character);
                }
                
            System.out.println("File ditemukan!");

            // Mengembalikan semua karakter yang telah digabungkan menggunakan append dalam bentuk string
            return content.toString(); // return null jika tidak ada file yang ditemukan dan dibaca
            }
    }
    
    public static void main(String[] args) {
        String fileName = "tes.txt";
        try {
            bacaFile(fileName);
        }catch(FileNotFoundException e){
            System.out.println("File tidak ditemukan");
        }catch (IOException e){
            System.out.println("Kesalahan dalam membaca file");                
        }
    }
}


