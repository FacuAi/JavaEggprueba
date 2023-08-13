package Extras03;
import java.time.DayOfWeek;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/**Clase Date
Escribe un programa que calcule el número de días que una persona ha vivido en la Tierra a partir de su fecha de nacimiento.
Escribe un programa que calcule el tiempo transcurrido entre dos fechas, en años, meses y días.
Escribe un programa que calcule el día de la semana para una fecha determinada utilizando el algoritmo de Zeller.
Escribe un programa que determine el número de días que faltan para el siguiente día de pago de un trabajador a partir de su fecha de inicio y su ciclo de pago (semanal, quincenal, mensual, etc.).
Escribe un programa que determine la cantidad de días laborales entre dos fechas (es decir, excluyendo los fines de semana y días festivos).
 *
 * @author chuki
 */
public class fechaextra02 {

   
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        // Programa que calcula el número de días que una persona ha vivido en la Tierra a partir de su fecha de nacimiento
        System.out.println("Ingrese su fecha de nacimiento (formato: AAAA-MM-DD):");
        String fechaNacimientoStr = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        LocalDate fechaActual = LocalDate.now();
        long diasVividos = fechaNacimiento.until(fechaActual).getDays();
        System.out.println("Ha vivido aproximadamente " + diasVividos + " días en la Tierra.");

        // Programa que calcula el tiempo transcurrido entre dos fechas, en años, meses y días
        System.out.println("Ingrese la primera fecha (formato: AAAA-MM-DD):");
        String fecha1Str = scanner.nextLine();
        LocalDate fecha1 = LocalDate.parse(fecha1Str);
        System.out.println("Ingrese la segunda fecha (formato: AAAA-MM-DD):");
        String fecha2Str = scanner.nextLine();
        LocalDate fecha2 = LocalDate.parse(fecha2Str);
        Period periodoEntreFechas = fecha1.until(fecha2);
        int aniosTranscurridos = periodoEntreFechas.getYears();
        int mesesTranscurridos = periodoEntreFechas.getMonths();
        int diasTranscurridos = periodoEntreFechas.getDays();
        System.out.println("Han transcurrido " + aniosTranscurridos + " años, " + mesesTranscurridos + " meses y " + diasTranscurridos + " días entre las dos fechas.");

        // Programa que calcula el día de la semana para una fecha determinada utilizando el algoritmo de Zeller
        System.out.println("Ingrese una fecha para determinar el día de la semana (formato: AAAA-MM-DD):");
        String fechaZellerStr = scanner.nextLine();
        LocalDate fechaZeller = LocalDate.parse(fechaZellerStr);
        DayOfWeek diaSemana = fechaZeller.getDayOfWeek();
        System.out.println("El día de la semana para la fecha ingresada es: " + diaSemana);

        // Programa que determina el número de días que faltan para el siguiente día de pago a partir de la fecha de inicio y el ciclo de pago
        System.out.println("Ingrese la fecha de inicio del trabajador (formato: AAAA-MM-DD):");
        String fechaInicioStr = scanner.nextLine();
        LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);
        System.out.println("Ingrese el ciclo de pago del trabajador en días:");
        int cicloPago = scanner.nextInt();
        LocalDate siguientePago = fechaInicio.plusDays(cicloPago);
        Period periodoPago = fechaActual.until(siguientePago);
        int diasParaPago = periodoPago.getDays();
        System.out.println("Faltan " + diasParaPago + " días para el siguiente día de pago.");

        // Programa que determina la cantidad de días laborales entre dos fechas (excluyendo fines de semana y días festivos)
        System.out.println("Ingrese la primera fecha (formato: AAAA-MM-DD):");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String fechaInicioLaboralStr = scanner.nextLine();
        System.out.println("Ingrese la segunda fecha (formato: AAAA-MM-DD):");
        String fechaFinLaboralStr = scanner.nextLine();
        LocalDate fechaInicioLaboral = LocalDate.parse(fechaInicioLaboralStr);
        LocalDate fechaFinLaboral = LocalDate.parse(fechaFinLaboralStr);
        int diasLaborales = 0;
        LocalDate fechaActualLaboral = fechaInicioLaboral;
        while (!fechaActualLaboral.isAfter(fechaFinLaboral)) {
            if (fechaActualLaboral.getDayOfWeek() != DayOfWeek.SATURDAY && fechaActualLaboral.getDayOfWeek() != DayOfWeek.SUNDAY) {
                diasLaborales++;
            }
            fechaActualLaboral = fechaActualLaboral.plusDays(1);
        }
        System.out.println("La cantidad de días laborales entre las dos fechas es: " + diasLaborales);
    }
}


       
  
















///↓↓↓↓esto es un ejemplo ↓↓↓↓
        
        
        
        
        
        
        
//                
//                // Conversion de string a date
//String Dateinicio = request.getParameter("addtimeinicio");
//Date fechaInicio = date.parse(Dateinicio);
//
//// Aca tengo la fecha actual
//
//Date fechaactual = new Date(System.currentTimeMillis());
//SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
//
//// Operacion
//
// int dias = (int) ((fechaInicio.getTime() - fechaactual.getTime()));
//
// System.out.println("Hay " + dias + " dias de diferencia");
//    }
//            
        
   ////↓↓↓↓↓↓↓↓Este es el que funciona ↓↓↓↓↓↓↓

        
//        // Fecha de nacimiento
//        Date fechaNacimiento = new Date(81, 1, 8); // Año 1990, mes 0 (enero), día 1
//
//        // Fecha actual
//        Date fechaActual = new Date();
//
//        // Calcula la diferencia en milisegundos entre las fechas
//        long diferenciaMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
//
//        // Calcula el número de días vividos dividiendo la diferencia entre 1000 (ms/s) * 60 (s/min) * 60 (min/h) * 24 (h/día)
//        long diasVividos = diferenciaMilisegundos / (1000 * 60 * 60 * 24);
//
//        System.out.println("Días vividos: " + diasVividos);
//    }
//}