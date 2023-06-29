/*
 *  Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. 
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(año, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra
(edad del usuario).
Si necesiten acá tienen más información en clase Date
.
 */
package FechaServicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class FechaServicio {
    public static Date fechaNacimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese día de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese mes de nacimiento: ");
        int mes = scanner.nextInt() - 1;                // Se resta 1 porque los meses empiezan en 0
        System.out.print("Ingrese año de nacimiento: ");
        int años = scanner.nextInt() - 1900;            // Se resta 1900 porque Date considera el año 0 como 1900
        return new Date(años, mes, dia);
    }

    public static Date fechaActual() {
        return new Date();
    }

    public static int diferencia(Date fecha1, Date fecha2) {
        int anio1 = fecha1.getYear();
        int anio2 = fecha2.getYear();
        int difAños = anio2 - anio1;
        if (fecha2.getMonth() < fecha1.getMonth() || (fecha2.getMonth() == fecha1.getMonth() && fecha2.getDate() < fecha1.getDate())) {
            difAños--;
        }
        return difAños;
    }
}