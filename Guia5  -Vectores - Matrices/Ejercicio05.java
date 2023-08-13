package Guia5vectores;
import java.util.*;
/**
 *Realice un programa que compruebe si una matriz dada es antisimétrica.
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
 * pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz 
 * A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

 * @author chuki
 */
public class Ejercicio05 {
    public static void main(String[] args) {
// int[][] matriz = new int [4][4];
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                matriz[i][j] = (int) (Math.random()*10);
//            }  
//        }
//       System.out.println(" --Matriz--");     //matriz limpia 
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                System.out.print("|" + matriz[j][i] + "|"); //print deja todo en la misma linea
//
//            }
//            System.out.println("");//println hace el efecto "todo" en la matriz organizado linea
//    }
//        int[][] cambio = new int[4][4];  // antisimétrica.transpuesta + cambiada de signo
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                cambio[j][i] = -matriz[i][j];
//            }
//        }
//         System.out.println("Traspuesta de signo:"); // la declare en otra linea + for porque note menor cantidad de 0 
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (cambio[i][j] > 0) {
//                    System.out.print("|" +cambio[i][j] + "|");
//                }                                        // length devuelve un valor de entero
//                System.out.print("|"+cambio[i][j] + "|");
//            }
//            System.out.println();
//        }
//    }
//}

        int[][] matriz = new int[3][3];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = (int) (Math.random()*9);
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println(" ");
        }
        System.out.println("===================");

        //TRANSPUESTA
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print("|" + (matriz[i][j])*(-1) + "|");
            }
            System.out.println("");
        }
    }
}