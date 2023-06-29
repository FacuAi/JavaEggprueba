package Ejercicicio05;
import PersonaEntidades.PersonaEntidades;
import PersonaServicio.PersonaServicio;
import java.util.*;
/**Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date),
 * constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 *
 * @author chuki
 */
public class Ejercicio05 {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
      PersonaEntidades persona = PersonaServicio.crearPersona();
        PersonaServicio.mostrarPersona(persona);
        int edad = PersonaServicio.calcularEdad(persona.getFechaNacimiento());
        System.out.println("La edad de " + persona.getNombre() + " es " + edad + " años");
        boolean menorQue = PersonaServicio.menorQue(persona, 18);
        if (menorQue) {
            System.out.println(persona.getNombre() + " es menor de edad");
        } else {
            System.out.println(persona.getNombre() + " es mayor de edad");
         
        }
    }
    }


