/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoejercicioextra01;

/**
 *
 * @author chuki
 */
public class mes {

    public mes() {
    }
    
     private String nombre;

    public mes(String nombre) {
        this.nombre = nombre;
    }

    

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "mes{" + "nombre=" + nombre + '}';
    }

    
}

