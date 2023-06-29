package Guia07extra08;
import java.util.*;
/*
*  Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y 
* otro para mostrar por pantalla los estudiantes que tienen una nota media superior.
 *
 * @author chuki
 */
public class extra08 {

     Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
        estudiante E1 = new estudiante ("Ezequiel", 20,8);
        estudiante E2 = new estudiante("Dani", 21,9);
        estudiante E3 = new estudiante("Matias",42,9);
        
        estudiante[] estudiante = {E1,E2,E3};
     
        
         E1.mostrarEstudiantesmejornota(estudiante);
         
          }
}

