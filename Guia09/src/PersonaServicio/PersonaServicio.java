/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaServicio;
import java.util.Date;
import java.util.Scanner;
import PersonaEntidades.PersonaEntidades;

/*Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear.
* Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 *
 * @author chuki
 */
public class PersonaServicio {
    
     public static PersonaEntidades crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        Date fechaNacimiento = pedirFechaNacimiento();
        return new PersonaEntidades(nombre, fechaNacimiento);
     }
      private static Date pedirFechaNacimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese fecha de nacimiento (formato dd/mm/aaaa): ");
        String input = scanner.nextLine();
        String[] partes = input.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]) - 1; // Se resta 1 porque los meses empiezan en 0
        int anio = Integer.parseInt(partes[2]) - 1900; // Se resta 1900 porque Date considera el año 0 como 1900
        return new Date(anio, mes, dia);
    }
public static int calcularEdad(Date fechaNacimiento) {
        Date fechaActual = new Date();
        int anioNac = fechaNacimiento.getYear();
        int anioActual = fechaActual.getYear();
        int edad = anioActual - anioNac;
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() || (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            edad--;
        }
        return edad;
    }
 public static boolean menorQue(PersonaEntidades persona, int edad) {
        Date fechaNac = persona.getFechaNacimiento();
        int edadPersona = calcularEdad(fechaNac);
        return edadPersona < edad;
 }
  public static void mostrarPersona(PersonaEntidades persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad(persona.getFechaNacimiento()) + " años");
    }
}
