package Guia5vectores.extras;
import java.util.*;
/**
 **Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
Después haremos otra función o procedimiento que imprima el vector.
 * @author chuki
 */
public class Ejercicioextra03 {

   
    public static void main(String[] args) {
 int[]vec=new int[5];
 rellenarVectores(vec);
 imprimirVectores(vec);
    }
    public static void rellenarVectores(int[]vec){
    for (int i = 0; i< vec.length; i++){
    vec[i] = (int) (Math.random()*10);
    
    }
    }
public static void imprimirVectores(int[] vec){
for (int i = 0 ; i < vec.length; i++) { 
    System.out.println(vec[i]+ " - ");
}

}
}    

