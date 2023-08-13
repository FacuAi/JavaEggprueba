

package test.Guia3;
import java.util.Scanner;
/**
 *  
 * Crear un programa que dado un número determine si es par o impar.
 * 
 * @author chuki
 */
public class ejercicio01 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero entero: ");
        num = leer.nextInt();
        
        
        if (num % 2 == 0 ){
            System.out.println("El número " + num + " es par");
        }else {
            System.out.println("El número " + num + " es impar");
        }
             

    }

}
