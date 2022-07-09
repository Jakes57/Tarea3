/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

/**
 *
 * @author Alfredo Martelet
 */
public final class Deck {
    
     
    private final Card cartas[];

    
    public static final int NUM_CARTAS = 52;

    public Deck() {
        this.cartas = new Card[NUM_CARTAS];
        crearBaraja(); 
        barajar(); 
    }
    public void crearBaraja() {

        String[] palos = Card.PALOS;
        String[] color = Card.COLOR;

        
        for (int i = 0; i < palos.length; i++) {
            for (int i = 0; i < color.length; i++) {
            
            for (int j = 0; j < Card.LIMITE_CARTA_PALO; j++) {
                
                if (!(j == 7 || j == 8)) {
                    if (j >= 9) {
                        
                        cartas[((i * (Card.LIMITE_CARTA_PALO - 2)) + (j - 2))] = new Card(j + 1, palos[i]);
                    } else {
                        
                        cartas[((i * (Card.LIMITE_CARTA_PALO - 2)) + j)] = new Card(j + 1, palos[i]);
                    }

                }
            }

        }
      }

    }
    public void shuffle() {

        int posAleatorio = 0;
        Card c;

        
        for (int i = 0; i < cartas.length; i++) {

            posAleatorio = Metodos.generaNumeroEnteroAleatorio(0, NUM_CARTAS - 1);

           
            c = cartas[i];
            cartas[i] = cartas[posAleatorio];
            cartas[posAleatorio] = c;

        }

        

    }

    /**
     * 
     * 
     * @return 
     */
     
    public Card head() {

        Card c = null;
        int head = 0;

        if (head == NUM_CARTAS) {
            System.out.println("Ya no hay mas cartas");
        } else {
            c = cartas[head++];
        }

        return c;

     }

    private void barajar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void pick() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    }

