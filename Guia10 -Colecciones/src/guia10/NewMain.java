package guia10;
import Servicios.ServicioAlumno;
import java.util.*;
/**
 *
 * @author chuki
 */
public class NewMain {

   
    public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
        ServicioAlumno servicio = new ServicioAlumno();

        String respuesta;
        do {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();

            List<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + " del alumno: ");
                int nota = scanner.nextInt();
                scanner.nextLine();
                notas.add(nota);
            }

            Alumno alumno = new Alumno(nombre, notas);
            servicio.agregarAlumno(alumno);

            System.out.print("¿Desea agregar otro alumno? (S/N): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));

        System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombreAlumno = scanner.nextLine();
        double notaFinal = servicio.notaFinal(nombreAlumno);

        if (notaFinal != -1) {
            System.out.println("La nota final de " + nombreAlumno + " es: " + notaFinal);
        } else {
            System.out.println("El alumno no se encuentra en la lista.");
        }
        System.out.println(Alumno.class.toString());
    }
    }


