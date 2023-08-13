package Guia5vectores.extras;
import java.util.*;

/**
 *
 * @author chuki
 */
public class ejercicioextra01 {
/*
    Realizar un algoritmo que calcule la suma de todos los elementos
    de un vector de tamaño N, con los valores ingresados por el usuario.
    
    */
   
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
//        int [] vector = new int [2];
//       
//        
//        int aux = 0;
//        for (int i = 0; i < 2; i++) {
//            System.out.println("Ingrese un numero");
//            vector[i] = leer.nextInt();
//            aux += vector[i];
//        }
//        System.out.println("La suma de los valores ingresados es: " + aux);
//    }
//}
//  

        System.out.println("Ingrese el tamaño del vector: ");
        int[] vector = new int[leer.nextInt()];
        int aux = 0;
        int num;
       

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor en la posicion " + i + " : ");
            vector [i] = leer.nextInt();
            
        }
        
        for (int i = 0; i < vector.length ; i++) {
            aux += vector[i];
            
        }
           System.out.print("La suma del vector es: "+aux + "\n"); 
    } 
 }

