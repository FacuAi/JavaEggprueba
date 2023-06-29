/*
 *Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package Entidades;

/**
 *
 * @author chuki
 */
public class Rectangulo  implements CalculosFormas {
    protected double base;
    protected double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
   return (base + altura);
    }

    @Override
    public double CalcularPerimetro() {
     return    base * altura* 2; 
    }
    
}
