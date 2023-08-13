package test.Guia3;
import java.util.*;
/**
Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10.
* El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario
* ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

 * @author chuki
 */
public class Ejercicioextra10 {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  Random R = new Random();
    int sec,n;
    sec = R.nextInt(11)*R.nextInt(11);
    do{
        System.out.println("ingrese un numero para adivinar ");
        n = leer.nextInt();
    if(n==sec) {
        System.out.println("!Correcto!");
        break;
    }else{
        System.out.println("Incorrecto!!");
    }
    }while (true);
 
}
}