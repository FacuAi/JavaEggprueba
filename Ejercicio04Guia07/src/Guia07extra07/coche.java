/*
 * Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
    Crea tres objetos de la clase "Coche" y muéstralos por pantalla. 
 */
package Guia07extra07;

/**
 *
 * @author chuki
 */
public class coche {
    private String marcas;
    private String modelo;
    private double precio;

    coche(String honda) {
        
    }

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public coche(String marcas, String modelo, double precio) {
        this.marcas = marcas;
        this.modelo = modelo;
        this.precio = precio;
    }
}
