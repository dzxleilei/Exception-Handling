/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas1;

/**
 *
 * @author calvi
 */
public class Tugas1 {

    public static void main(String[] args) {
        Barang barang1 = new Barang();
        
        try {
            barang1.setValue(0, 0);
        } catch (InvalidPurchase e) {
            System.out.println("Ex: " + e.getMessage());
        }
    }
}
