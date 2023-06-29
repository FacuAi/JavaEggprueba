

package test.Guia3;
import java.util.Scanner;
/**
 *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
 * Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 * @author chuki
 */
public class ejercicio04 {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  String palabra;
        System.out.println("Ingrese una palabra Por favor");
        palabra =  leer.nextLine();
        if((palabra.substring(0,1).equals("A") || palabra.substring(0,1).equals("a"))) {
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
            
                }
}
}