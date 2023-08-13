package test.Guia3;

import java.util.Scanner;

/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto,
 * sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 *
 * @author chuki
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner bandera = new Scanner(System.in);
        String sCadena1 ;
        System.out.println("ingrese una Cadena de texto");
        sCadena1 = bandera.nextLine();
        if (sCadena1.equals("eureka")) {
            System.out.println(sCadena1 +  "  Es correcto");
       
        } else {
            System.out.println(sCadena1 + " y " + " Incorrecto ");
        }

    }

}
