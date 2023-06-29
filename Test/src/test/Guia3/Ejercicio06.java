package test.Guia3;

import java.io.IOException;
import java.util.*;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y 
 * muestre por pantalla el siguiente menú:El usuario deberá elegir una opción 
 * y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
 * si el usuario selecciona la opción 5, en vez de salir del programa directamente,
 * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir 
 * del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 *
 *
 * @author chuki
 */
public class Ejercicio06 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leer = new Scanner(System.in);
        int num1, num2, i, opcion, resultado;
            String tecla;

        tecla = "n";
        do {

            System.out.println("ingrese el primer numero");
            num1 = leer.nextInt();
            System.out.println("ingrese el segundo numero");
            num2 = leer.nextInt();

            System.out.println("Menu\n"
                    + "============\n"
                    + "1- Suma\n"
                    + "2- Resta\n"
                    + "3- Multiplicar\n"
                    + "4- Dividir\n"
                    + "5- salir\n"
                    + "==============\n"
                    + "elija una opcion:\n");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("la suma de " + num1 + "+" + num2 + " es " + resultado);
                    break;

                case 2:
                    resultado = num1 - num2;
                    System.out.println("la suma de " + num1 + "-" + num2 + " es " + resultado);
                    break;

                case 3:
                    resultado = num1 * num2;
                    System.out.println("la suma de " + num1 + "*" + num2 + " es " + resultado);
                    break;
                case 4:
                    if (num2 == 0) {

                        System.out.println("la division no es posible por 0(Cero)");
                    } else {
                        resultado = num1 / num2;
                        System.out.println("la suma de " + num1 + "/" + num2 + " es " + resultado);
                    }
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa S/N ?: ");
                    tecla = leer.next();
                    if (!tecla.equalsIgnoreCase("S")) {

                    } else {
                        break;
                    }
                default:
                    System.out.println("opcion incorrecta");

            }

        } while (opcion != 5);
        System.out.println("Gracias por usar esta app");
    }
}
