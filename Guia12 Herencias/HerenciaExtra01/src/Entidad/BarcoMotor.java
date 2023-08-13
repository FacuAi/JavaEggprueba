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
 public class BarcoMotor extends Barco {
     protected double potenciaCV;
     
    public BarcoMotor(String matricula, double eslora, int anioFabricacion, double potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public double calcularModulo() {
         return getMetros() * 10 + potenciaCV;
    }
 }