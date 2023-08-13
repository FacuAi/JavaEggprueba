package guia07extra05;
import java.util.*;
/**Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
 * Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual.
 * El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

 *
 * @author chuki
 */
public class extra05 {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);

    Empleado empleado1 = new Empleado("jorge", 32, 2000.0);
    empleado1.calcular_aumento();
}
    }
