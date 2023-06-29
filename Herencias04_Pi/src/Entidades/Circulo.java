/*
 *  Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
package Entidades;

/**
 *
 * @author chuki
 */
public class Circulo implements CalculosFormas {

    protected double radio;
    protected double pi = 3.14;
   

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
        
    }

   

    @Override
    public String toString() {
        return "Cicruclo{" + "radio=" + radio + ", PI=" + pi +  '}';
    }

    @Override
    public double CalcularArea() {
    return  pi*Math.pow(radio, 2);
    }

    @Override
    public double CalcularPerimetro() {
        return pi * radio * 2;
    }

   
}
