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
 public class Yate extends Barco {
private double potenciaCV;
    private int numeroCamarotes;

    public Yate(String matricula, double eslora, int anioFabricacion, double potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    @Override
    public double calcularModulo() {
        return getMetros() * 10 + potenciaCV + numeroCamarotes;
    }

    
}
