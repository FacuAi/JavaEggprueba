package Guia5vectores;

import java.util.*;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
 * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y 
 * se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * @author chuki
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10); // Agregar valores aleatorios i y j
            }
        }
        System.out.println(" --Matriz--");     //matriz limpia 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|" + matriz[i][j] + "|"); //print deja todo en la misma linea

            }
            System.out.println(); //println hace el efecto "todo" en la matriz organizado linea
        }

        System.out.println("--Matriz Trans--");
        int[][] transpuesta = new int[4][4]; // matriz transupuesta 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[j][i] = matriz[i][j];
                System.out.print("|" + transpuesta[i][j] + "|");

            }
            System.out.println();
        }

    }

}
