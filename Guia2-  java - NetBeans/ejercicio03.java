

package test;
import java.util.Scanner;
/**
 *
 * @author chuki
 */
public class ejercicio03 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una Frase: ");
        frase= leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }

}
