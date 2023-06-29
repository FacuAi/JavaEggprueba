package Ejerciocio04;
import FechaServicio.FechaServicio;
import java.time.LocalDate;


import java.util.*;
/**
 * Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date

 *
 * @author chuki
 */
public class ejercicio04 {

   
    public static void main(String[] args) {
        
      Date fechaNac = FechaServicio.fechaNacimiento();
        Date fechaHoy = FechaServicio.fechaActual();
        int edad = FechaServicio.diferencia(fechaNac, fechaHoy);
        System.out.println("Tu edad es: " + edad + " años");
        System.out.println("la fache de hoy es : " + FechaServicio.fechaActual());
    }
}
