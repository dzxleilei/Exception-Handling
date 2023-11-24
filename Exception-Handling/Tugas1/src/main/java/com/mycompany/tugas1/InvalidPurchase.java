/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;

/**
 *
 * @author calvi
 */
public class InvalidPurchase extends Exception {
    private String message;
    public InvalidPurchase(String message) {
        super(message);
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
}