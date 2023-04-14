package test.Guia3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 *
 * @author chuki
 */
public class Ejercicioextra06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        boolean continuar = true;
//        double estatura, totalGeneral, total160;
//        int contadorGeneral = 0;
//        int contador160 = 0;
//        totalGeneral = 0;
//        total160 = 0;
//        while (continuar) {
//            try {
//                System.out.print("Introduzca una altura: ");
//                estatura = Double.parseDouble(br.readLine());
//                totalGeneral += estatura;
//                contadorGeneral++;
//                if (estatura < 1.60) {
//                    total160 += estatura;
//                    contador160++;
//                }
//                System.out.print("Introduce S para ingresar una nueva altura, de otro modo introduzca otro valor para los resultados: ");
//                continuar = br.readLine().equalsIgnoreCase("S");
//            } catch (IOException | NumberFormatException ex) {
//                System.out.println("Hubo un error de lectura");
//            }
//        }
//        System.out.println("El promedio general: " + (totalGeneral / contadorGeneral) + "\nEl promeido de estaturas por debajo de 1,60: " + (total160 / contador160));

        System.out.println("Cuantas personas ingresaras?");
        double totalGeneral, total160;
        int contadorGeneral = 0;
        int contador160 = 0;
        totalGeneral = 0;
        total160 = 0;

        for (int i = 0; i < contadorGeneral; i++) {
            System.out.println("Cuanto mide la persona " + (i + 1));
            double pers = leer.nextDouble();

            if (pers < 1.60) {

                contador160++;
                total160 += pers;
            }

            contadorGeneral++;
            total160 += pers;
        }
        System.out.println("El promedio de la estatura por debajo de 1.60 es: " + (total160 / contador160));
        System.out.println("El promedio en general es: " + (total160 / totalGeneral));
    }
}
