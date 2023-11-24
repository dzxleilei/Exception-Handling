/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author calvi
 */
public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private String gudang;
    private double hargaBeli;
    private double hargaJual;
    private int jumlah;

    public void setValue(double hargaJual, int jumlah) throws InvalidPurchase {
        if (hargaJual <= 0 && jumlah < 1) {
            throw new InvalidPurchase("Harga jual harus lebih dari 0 dan jumlah pembelian harus lebih dari 1");
        }
        if (hargaJual <= 0) {
            throw new InvalidPurchase("Harga jual harus lebih dari 0");
        }
        if (jumlah < 1) {
            throw new InvalidPurchase("Jumlah pembelian harus lebih dari 1");
        }
        this.hargaJual = hargaJual;
        this.jumlah = jumlah;
    }
}