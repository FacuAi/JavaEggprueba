

package test;
import java.util.Scanner;
/**
 *
 * @author chuki
 */
public class ejercicio02 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese su nombre: ");
         
        if(!leer.hasNextInt()) {
        
        nombre = leer.nextLine();
          System.out.println("Hola!! " + nombre);
        } 
        else{ 
            System.out.println("Error");
    }
        
        
      
    }

}
