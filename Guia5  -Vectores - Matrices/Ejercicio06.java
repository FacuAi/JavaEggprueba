package Guia5vectores;

import java.util.*;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
 * sus columnas y sus diagonales son idénticas. 
 * Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
 * El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 *
 * @author chuki
 */
public class Ejercicio06 {

    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la dimension de la Matriz: ");
        int[][] matriz;
        int n = validarEntero(leer);
        matriz = new int[3][3];
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("La matriz es magica: " + validarMatrizMagica(matriz, n));
        System.exit(0);
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz1[j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static int validarEntero(Scanner leer) {
        int n;
        do {
            if (leer.hasNextInt()) {
                n = leer.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.print("El numero debe ser mayor que cero. Intente nuevamente: ");
                }
            } else {
                System.out.print("Tipo de dato incorrecto. Intente nuevamente: ");
                leer.next();// descarta el valor no entero
            }
        } while (true);
        return n;
    }

    private static void llenarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el elemento " + (j + 1) + " ");
                matriz[i][j] = validarEntero(leer);
            }
        }
        System.out.println("");
    }

    private static boolean validarMatrizMagica(int[][] matriz, int n) {
        boolean magica = false;       
        int conutDiagonal1 = 0;
        int conutDiagonal2 = 0;
        for (int i = 0; i < matriz.length; i++) {
           int conutFila = 0;
           int conutColumna = 0;
            for (int j = 0; j < n; j++) {
                conutFila += matriz[i][j];
                conutColumna += matriz[i][j];
                if (i == j) {
                    conutDiagonal1 += matriz[i][j];
                }
                if (i + j == n - 1) {
                    conutDiagonal2 += matriz[i][j];
                }
                if (true) {
                    if (conutFila == conutColumna && conutColumna == conutDiagonal2 && conutDiagonal1 == conutFila) {
                        magica = true;
                    } else {
                        if (i==n-1&&j==n-1) {
                             magica = false;
                        }
                       
                    }
                }

            }

        }

        return magica;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                                                        
//		 long TInicio;             //Tiempo de ejecución
//		 TInicio = System.currentTimeMillis(); //de ejecución
//		
//		
//		System.out.print("Dame un número: ");
//	    Scanner sc = new Scanner(System.in);
//	    int n = sc.nextInt();
//	    int[][] magicSquare = new int[n][n];
//
//	    int number = 1;
//	    int fila = 0;
//	    int column = n / 2;
//	    
//	    while (number <= n * n) {
//	        magicSquare[fila][column] = number;
//	        number++;
//	        fila -= 1;
//	        column += 1;
//	        if (fila == -1) {
//	            fila = n - 1;
//	        }
//	        if (column == n) {
//	            column = 0;
//	        }
//	        if (fila == 0 && column == n - 1) {
//	            column = n - 1;
//	            fila += 1;
//	        } else if (magicSquare[fila][column] != 0) {
//	            fila += 1;
//	        }
//	    }
//
//	    for (int i = 0; i < magicSquare.length; i++) {
//	        for (int j = 0; j < magicSquare.length; j++) {
//	            System.out.print(magicSquare[i][j] + " ");
//	        }
//	        System.out.println();
//	    }
//	    
//	    
//	    //1 minuto 60000 milisegundos
//	  
	}
}
