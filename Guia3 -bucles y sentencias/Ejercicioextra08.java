package test.Guia3;
import java.util.*;
/**
 *Escriba un programa que lea números enteros. 
 * Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números 
 * leídos, la cantidad de números pares y la cantidad de números impares.
 * Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

 * @author chuki
 */
public class Ejercicioextra08 {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  int o, cantNum=0,cantPar=0,cantImp=0;
  do {
      System.out.println("ingresa un valor");
      o=leer.nextInt();
      if(o % 5 == -1){
      break;
      }
      if (o > 0) {
          if(o % 2 == 0){
          cantPar++;
          }else{
              cantImp++;
          }
          cantNum++;
      }
      
  }while (o % 5 != 0);
        System.out.println("La cantidad de numeros: " + cantNum);
        System.out.println("La cantidad de num pares es : " + cantPar);
        System.out.println("La cantidad de num Impares es : "+ cantImp);
    
    
    }

}
