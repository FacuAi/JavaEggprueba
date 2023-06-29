package Guia5vectores;
import java.util.*;
/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
 * La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

 * @author chuki
 */
public class Ejercicio04 {

   
    public static void main(String[] args) {
int[][]matriz=new int[4][4];

 for (int i = 0; i < 4; i++) {
     for (int j = 0; j < 4; j++) {
        matriz[i][j] = (int) (Math.random()*10); // Agregar valores aleatorios i y j
            }
          }
        System.out.println("Matriz: ");     
        for (int i = 0; i < 4; i++) {
     for (int j = 0; j < 4; j++) {
         System.out.println(matriz[i][j] +"|");
     }
            System.out.println("-----------------");
    
    }
          System.out.println("Matriz transpuesta: ");
 int [][] transpuesta = new int [4][4]; // matriz transupuesta inverto los valores en la matriz 
 for (int i = 0; i < 4; i++) {
     for (int j = 0; j < 4; j++) {
         transpuesta[j][i] = matriz[i][j];
            
         System.out.println(transpuesta[i][j] +"|");
         
     }
System.out.println("-----------------");
 }
 
      
    
           
        }
            
        }
        
