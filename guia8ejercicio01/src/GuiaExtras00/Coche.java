/*
 * Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
Crea clase de servicio con los métodos "ingresarCoche" y "mostrarCoche".
 */
package GuiaExtras00;

/**
 *
 * @author chuki
 */
public class Coche {
    public String Marca;
    public String Modelo;
    public int precio;  

    @Override
    public String toString() {
        return "Coche{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", precio=" + precio + '}';
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Coche(String Marca, String Modelo, int precio) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.precio = precio;
    }

   

    public Coche() {
    }
}
