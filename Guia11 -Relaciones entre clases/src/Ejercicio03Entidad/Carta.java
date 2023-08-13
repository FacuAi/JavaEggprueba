/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03Entidad;

/**
 *
 * @author chuki
 */
public class Carta {
    private String numero;
    private Palo palos;

    public Carta(String numero, Palo palos) {
        this.numero = numero;
        this.palos = palos;
    }

    public Carta() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Palo getPalos() {
        return palos;
    }

    public void setPalos(Palo palos) {
        this.palos = palos;
    }

    @Override
    public String toString() {
        return numero + " de " + palos;
    }

  
    
    
}
