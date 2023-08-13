/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author chuki
 */
abstract class Barco {
    protected String matricula;
    protected double metros;
    protected int anioFabri;

    public Barco(String matricula, double metros, int anioFabri) {
        this.matricula = matricula;
        this.metros = metros;
        this.anioFabri = anioFabri;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public int getAnioFabri() {
        return anioFabri;
    }

    public void setAnioFabri(int anioFabri) {
        this.anioFabri = anioFabri;
    }
     public abstract double calcularModulo();

    public double calcularAlquiler(LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        long diasOcupacion = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        double modulo = calcularModulo();
        return diasOcupacion * modulo;
    }
}

