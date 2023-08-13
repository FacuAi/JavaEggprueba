package test.Guia4subprogramas;
import java.util.*;
/**
 *
 * @author chuki
 */
public class Ejercicio04 {
/**Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro 
 * para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
  Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
  ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

  */ 
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
   int num;
        
        System.out.println("Ingresa un numero para saber si es primo: ");
        num = leer.nextInt();
        
        if (primos(num)) {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
    
    public static boolean primos(int num){
        int contador = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        
        return contador == 2;
    }
}

