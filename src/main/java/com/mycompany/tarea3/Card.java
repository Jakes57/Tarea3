/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

/**
 *
 * @author Alfredo Martelet 
 */
public class Card {
    
    
    private int numero;
    private String palo;
    private String color;
    
    
    public static final String[] PALOS={"ESPADAS", "CORAZONES", "DIAMANTES", "TREBOLES"};
    public static final String[] COLOR={"ROJO", "NEGRO"};
    public static final int LIMITE_CARTA_PALO=13;

    
    public Card(int numero, String palo, String color) {
        this.numero = numero;
        this.palo = palo;
        this.color = color; 
    }

    Card(int i, String palo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    @Override
    public String toString() {
        return "numero=" + numero + ", palo=" + palo + ", color=" + color;
    }
}
