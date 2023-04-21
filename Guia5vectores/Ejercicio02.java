package Guia5vectores;

import java.util.Scanner;

/**
 *Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
 * le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 * @author chuki
 */
public class Ejercicio02 {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar dimension del vector: ");
    int n = leer.nextInt();
    int vector[]=new int[n];
    int contador = 0 ;
        
    for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random()*6)+1; // Agregar valores aleatorios
            }
    
       for (int i = 0; i < n; i++) {
          System.out.println("["+vector [i]+"]"); //muestra el vector 
       }
    int buscar = 0;
        System.out.println("Ingrese el numero a buscar: ");
         buscar = leer.nextInt();

        
       for (int i = 0; i < n; i++) {
        if (vector[i] == buscar) {
            contador++;
          System.out.println("posicion donde se encuentra es: "+ (i + 1));
        }
          
       }
       
       if (contador == 0) {
           System.out.println("No se encontro el Numero: ");
       }
        System.out.println("La cantidad de veces que se repite el numero es: " +contador); 
        }
    }
  
