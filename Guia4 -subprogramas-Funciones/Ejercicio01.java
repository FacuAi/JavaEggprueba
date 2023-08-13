package test.Guia4subprogramas;

import java.util.*;

/**
 *
 * @author chuki
 */
public class Ejercicio01 {

//   Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
//    La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, opc;
        
        System.out.println("Igresa 2 Numeros: ");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        System.out.println("----------\n-----\n----------\n"
                +"***Menu ***\n1. Sumar"
                + "\n2. Restar "
                + "\n3. Multiplicar"
                + "\n4. Dividir\n"
                +"!Seleccionar una opcion!"
               + "----\n---------\n------------\n");
        opc = leer.nextInt();
        switch (opc) {
            case 1:
                System.out.println(Suma(+n1, n2));
                break;
            case 2:
                System.out.println(Resta(n1, n2));
                break;
            case 3:
                System.out.println(Multiplicar(n1, n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Error! No se puede Dividir por 0");

                } else {
                    System.out.println(Dividir(n1, n2));
                }
                break;
            default:
                System.out.println("Error opcion Incorrecta");
        
        }
    }

    public static int Suma(int n1, int n2) {
        return n1 + n2;
    }

    public static int Resta(int n1, int n2) {
        return n1 - n2;
    }

    public static int Multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public static int Dividir(int n1, int n2) {
        return n1 / n2;
    }
}
