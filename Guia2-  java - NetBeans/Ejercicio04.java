package test;

import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double C, F;
        System.out.println("Ingrese una temperatura en gracos C°: ");
        if (leer.hasNextDouble()) {
            C = leer.nextDouble();
            F = 32 + (9 * C / 5);
            System.out.println("La temperatura en grados F° es: " + F);
        } else {
            System.out.println("Error");
        }

    }
}
