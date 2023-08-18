/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author chuki
 */
 public class Velero extends Barco {
     
protected int numeroMastiles;

    public Velero(String matricula, double metros, int anioFabri, int par2) {
        super(matricula, metros, anioFabri);
    }



    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularModulo() {
      return getMetros() * 10 + numeroMastiles;
    } 
 }  

