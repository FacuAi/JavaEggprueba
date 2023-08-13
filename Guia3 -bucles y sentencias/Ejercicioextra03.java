package test.Guia3;

import java.util.*;
import javax.swing.JOptionPane;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal .
 * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 *
 * @author chuki
 */
public class Ejercicioextra03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        String letra = leer.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("aeiou")
          || letra.equalsIgnoreCase("oiuea")) {
            System.out.println("CORRECTO!");

        } else {
            System.out.println("INCORRECTO!!");
        }
    }
//String letra = JOptionPane.showInputDialog("Ingrese una letra");
//if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") || letra.equalsIgnoreCase("aeiou")
//  || letra.equalsIgnoreCase("oiuea")) {
//        JOptionPane.showMessageDialog(null, "Correcto" + "\n");}
//else{
//     JOptionPane.showMessageDialog(null, "Incorrecto" + "\n");}
//    }

}
