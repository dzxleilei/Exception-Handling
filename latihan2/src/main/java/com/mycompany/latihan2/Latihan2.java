/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan2;

/**
 *
 * @author William
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Latihan2 {

    public static String bacaFile(String fileName) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader(fileName);
            System.out.println("File " + fileName + " opened successfully.");
            return "File opened successfully.";
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama file: ");
        String fileName = scanner.nextLine();

        try {
            String fileContent = bacaFile(fileName);
            System.out.println("File content: " + fileContent);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

    
