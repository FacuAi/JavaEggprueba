

package test;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author chuki
 */
public class ejercicio03 {

   
    public static void main(String[] args) {
//      Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
//      Nota: investigar la función toUpperCase() y toLowerCase() en Java.

//        Scanner leer = new Scanner(System.in);
//        String frase;
//        System.out.println("Ingrese una Frase: ");
//        frase = leer.nextLine();
//        System.out.println("Tu frase en minuscula es: " + frase.toUpperCase());
//        System.out.println("Tu frase en MAyuscula es: " + frase.toLowerCase());
        
        String frase = JOptionPane.showInputDialog("Ingresa una frase");
       
       JOptionPane.showMessageDialog(null, "Tu frase en minuscula es: " + frase.toLowerCase() + "\nTu frase en mayuscula es: " + frase.toUpperCase());
    }
}
