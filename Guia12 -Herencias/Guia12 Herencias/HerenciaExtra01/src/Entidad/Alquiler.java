/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author chuki
 */
 public class Alquiler extends Barco {
    protected String nombre;
    protected int dni;
    protected LocalDate FechaAlquiler ;
    protected LocalDate FechaDevolucion;
    protected int posiciondelAmarre;
    private Barco barco;

    public Alquiler(String nombre, int dni, LocalDate FechaAlquiler, LocalDate FechaDevolucion, int posiciondelAmarre, Barco barco, String matricula, double metros, int anioFabri) {
        super(matricula, metros, anioFabri);
        this.nombre = nombre;
        this.dni = dni;
        this.FechaAlquiler = FechaAlquiler;
        this.FechaDevolucion = FechaDevolucion;
        this.posiciondelAmarre = posiciondelAmarre;
        this.barco = barco;
    }

    

  
    
    public double CalcularPrecioFinal(){
    return barco.calcularAlquiler(FechaAlquiler, FechaDevolucion);
    }

    @Override
    public double calcularModulo() {
        return barco.calcularAlquiler(FechaAlquiler, FechaDevolucion);
    }
}
