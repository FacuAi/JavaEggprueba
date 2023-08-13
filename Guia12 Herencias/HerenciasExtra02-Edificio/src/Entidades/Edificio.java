
package Entidades;

/**
 *
 * @author chuki
 */
public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;
    protected String nombre;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }
    public abstract double calcularSuperficie();
   // return (ancho*largo);
    public abstract double calcularVolumen();
   // return (ancho*largo *alto)
}
