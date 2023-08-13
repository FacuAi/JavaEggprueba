package Guia5vectores;
import java.util.*;
/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
 * los muestre por pantalla en orden descendente.

 * @author chuki
 */
public class Ejercicio01 {

   
    public static void main(String[] args) {
    int vector [] =  new int [100]; //deckaranis vectir tipo int e iniciamos con posisicion 100 
        for (int i = 0; i < 100; i++) {
            vector [i] = ( i + 1); //llenando la posicion 
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println("valores"+ "|" +vector [i]+"|");
         }
   
    }
    
}
