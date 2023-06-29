package test.Guia3;

import java.util.*;
import javax.swing.JOptionPane;

/**
 * Escriba un programa que lea números enteros. 
 * Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,
 * la cantidad de números pares y la cantidad de números impares.
 * Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 *
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
        System.out.println("La cantidad de numeros: " + cantNum +
        "La cantidad de num pares es : " + cantPar+
        "La cantidad de num Impares es : "+ cantImp);
    }
}  
   
   
//       
//        int cantNum = 0, cantPar = 0, cantImp = 0;
//        do {
//            String letra = JOptionPane.showInputDialog("ingresa un valor");
//             int o = Integer.parseInt(letra);
//            if (o % 5 == -1) {
//                break;
//            }
//            if (o > 0) {
//          if(o % 2 == 0){          cantPar++;
//          }else{
//              cantImp++;          }
//          cantNum++;
//     
//            }
//        } while (0 % 5 != 0);
//        JOptionPane.showMessageDialog(null , "La cantidad de numeros: " + cantNum  +"\n"+
//                "La cantidad de num pares es : "+ cantPar +"\n"+ "La cantidad de num Impares es : " + cantImp );
//   
//    }
//}

