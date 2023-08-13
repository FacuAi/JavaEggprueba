package Guia07extra09;
import java.util.*;
/**
 * Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
* Crea un constructor para inicializar los valores de las propiedades 
* y un método para mostrar por pantalla la información de la mascota.
* Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
 *
 * @author chuki
 */
public class extra09 {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  Mascota miMascota = new Mascota("Fido ", 3 , " Golden Retriever ", " Perro ");
  miMascota.mostrarInfo();
  miMascota.cumplirAnios();
  
    }

}
