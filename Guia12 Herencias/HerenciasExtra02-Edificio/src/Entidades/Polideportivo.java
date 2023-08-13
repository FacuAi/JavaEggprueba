
package Entidades;

/**
 *
 * @author chuki
 */
public class Polideportivo extends Edificio {
    private String nombre;
    private String tipoInstalaciones;

    public Polideportivo(int ancho, int alto, int largo, String polideportivo_1, String techado) {
     super(ancho, alto, largo);
        this.nombre = polideportivo_1;
        this.tipoInstalaciones = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInstalaciones, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalaciones = tipoInstalaciones;
    }
    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);
    }

    // Implementación del método calcularVolumen para Polideportivo
    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }
     // Getter para el tipo de instalación
    public String getTipoInstalacion() {
        
        return tipoInstalaciones;
      
}

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipoInstalaciones=" + tipoInstalaciones + '}';
    }
}
