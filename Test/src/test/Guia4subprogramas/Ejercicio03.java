package test.Guia4subprogramas;

import java.util.*;

/**
 *
 * @author chuki
 */
public class Ejercicio03 {

    /*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda,
    estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
    que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
    El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
     129.852 yenes es un 1 €
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String opciones;
        Double euros;
        System.out.println("Cantidad de euros");
        euros = leer.nextDouble();

        System.out.println("Convertir a: \n1. dolares \n2. yenes \n3. libras \n Elige una opcion ");

        opciones = leer.next();
        opciones = opciones.toLowerCase();
        conver(euros, opciones);
    }

    public static void conver(double euros, String opciones) {

        switch (opciones) {
            case "dolares":
                System.out.println(euros + "euros a dolar: " + (euros * 1.28611));
                break;
            case "yenes":
                System.out.println(euros + "euros a yenes: " + (euros * 129.852));
                break;
            case "libras":
                System.out.println(euros + "euros a libras: " + (euros * 0.86));
                break;
            default:
                System.out.println("Error!! 404");
        }

    }

}
