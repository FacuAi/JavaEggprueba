/*
 * Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
Crea un constructor para inicializar los valores de las propiedades y un método para mostrar por pantalla la información de la mascota.
Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
 */
package Guia07extra09;

/**
 *
 * @author chuki
 */
public class Mascota {
    private String nombre;
    private int edad;
    private String raza;
    private String tipo;

    public Mascota(String nombre, int edad, String raza, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        edad++;
        this.tipo = tipo;
    }
    public void mostrarInfo(){
        System.out.println("nombre:" + nombre +"\n"
                + "Edad: "+ edad
               + "\n" + "Raza: " + raza
               +"\n" + "Tipo: " + tipo );
    
    
    }    
   void cumplirAnios(){
   
    this.edad++;
       System.out.println("!!!el perrito cumplee!! :  " +  edad );
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
