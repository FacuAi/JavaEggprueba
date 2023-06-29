package test.Guia3;

import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 * Declarar cuatro variables de tipo entero A, B, C y D y 
 * asignarle un valor diferente a cada una. A continuación, 
 * realizar las instrucciones necesarias para que:
 * B tome el valor de C,
 * C tome el valor de A,
 * A tome el valor de D 
 * y D tome el valor de B.
 * Mostrar los valores iniciales y los valores finales de cada variable. 
 * Utilizar sólo una variable auxiliar.
 *
 *
 *
 * @author chuki
 */
public class Ejercicioextra02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//        int A = 1, B = 2, C = 3, D = 4, AUX;
//        System.out.println("Valores iniciales" + "\n");
//        System.out.println("A = " + A);
//        System.out.println("B = " + B);
//        System.out.println("C = " + C);
//        System.out.println("D = " + D + "\n");
//
//        AUX = B;
//        B = C;
//        C = A;
//        A = D;
//        D = AUX;
//
//        //averiguar o preguntar mas sobre  Como colocar las cosas en la consola del lado derecho de la pantalla 

//        System.out.println("Valores finales" + "\n");
//        System.out.println("B toma el valor de C -> B = " + B);
//        System.out.println("C toma el valor de A -> C = " + C);
//        System.out.println("A toma el valor de D -> A = " + A);
//        System.out.println("D toma el valor de B -> D = " + D);
//        
        int A = 1, B = 2, C = 3, D = 4, AUX;
        JOptionPane.showMessageDialog(null, "Valores iniciales" + "\n"
                + "A = " + A + "\n"
                + "B = " + B + "\n"
                + "C = " + C + "\n"
                + "D = " + D + "\n");
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;
        JOptionPane.showMessageDialog(null, "Valores Finales" + "\n"
                + "B toma el valor de C -> B = " + B + "\n"
                + "C toma el valor de A -> C = " + C + "\n"
                + "A toma el valor de D -> A = " + A + "\n"
                + "D toma el valor de B -> D = " + D + "\n");
    }

}
