

package test;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

 * @author chuki
 */
public class ejercicio02 {

   
    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
//        String nombre;
//        
//        System.out.println("Ingrese su nombre: ");
//         
//        if(!leer.hasNextInt()) {
//        
//        nombre = leer.nextLine();
//          System.out.println("Hola!! " + nombre);
//        } 
//        else{ 
//            System.out.println("Error");
//            
            String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
        
        JOptionPane.showMessageDialog(null, "Tu nombre es: " + nombre);
    }
         
    }

//}
