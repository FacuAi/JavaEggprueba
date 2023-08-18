package Mainanimal;
import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;
import java.util.*;
/**Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 *
 * @author chuki
 */
public class Herencias01Animales {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  
  Animal perro1 = new Perro("Lola", "Pedigri" ,"Perro", 60);
        perro1.Alimentar();
        
        Animal perro2 = new Perro("Chiquito", "Carne",  "Beagle" , 10);
        perro2.Alimentar();
        
       Animal gato1 = new Gato("Fernando", "Pescado", "Gato", 10);
       gato1.Alimentar();
       
       Caballo caballo1 = new Caballo("Tiro al blanco", "Pasto", "Caballo", 20);
       caballo1.Alimentar();
    }

}

