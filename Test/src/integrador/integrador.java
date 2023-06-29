package integrador;
import java.util.*;
/**
 *
 * @author chuki
 */
public class integrador {
  
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Empleado[] empleados = new Empleado[6];

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Ingrese el nombre del empleado");
            String nombre = leer.next();
            System.out.println("Ingrese el salario del empleado");
            double salario = leer.nextDouble();
            empleados[i] = new Empleado(nombre, salario);
        }
        double sumaSalarios = 0;
      for (Empleado empleado : empleados) {
          sumaSalarios += empleado.getSalario();
      }
        double promedioSalarios = sumaSalarios / empleados.length;
        System.out.printf("El promedio de todos los salarios es de: %.2f", promedioSalarios, "\n");
        int contador = 0;
      for (Empleado empleado : empleados) {
          if (empleado.getSalario() > promedioSalarios) {
              contador++;
          }
      }
        String[] nombresEmpleados = new String[contador];
        contador = 0;
      for (Empleado empleado : empleados) {
          if (empleado.getSalario() > promedioSalarios) {
              nombresEmpleados[contador] = empleado.getNombre();
              contador++;
          }
      }

        for (String nombre : nombresEmpleados) {
            System.out.println("El empleado " + nombre + " supera el promedio del salario, que afortunado!");
        }
    }
    }


