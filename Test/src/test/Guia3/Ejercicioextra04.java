package test.Guia3;
import java.util.*;
import javax.swing.JOptionPane;
/**
 Elaborar un algoritmo en el cuál se ingrese un 
 * número entre 1 y 10 y se muestre su 
 * equivalente en romano.

 * @author chuki
 */
public class Ejercicioextra04 {

   
   public static void main(String[] args) {
//  Scanner leer = new Scanner(System.in);
//  int num;
//  do{
//      System.out.println("ingrese un numero entre 1 y 10 :");
//      
//  num = leer.nextInt();
//  }while(num < 1 || num > 10);
//        switch (num) {
//            case 1:
//                System.out.println("I");
//                break;
//                   case 2:
//                System.out.println("II");
//                break;
//            case 3:
//                System.out.println("III");
//                break;
//            case 4:
//                System.out.println("IIII");
//                break;
//            case 5:
//                System.out.println("V");
//                break;
//            case 6:
//                System.out.println("VI");
//                break;
//            case 7:
//                System.out.println("VII");
//                break;
//            case 8:
//                System.out.println("VIII");
//                break;
//            case 9:
//                System.out.println("IX");
//                break;
//            case 10:
//                System.out.println("X");
//                break;
//            default:
//                throw new AssertionError();
//        }

String num = JOptionPane.showInputDialog("ingrese un numero entre 1 y 10 :");
 
 int  num1 = Integer.parseInt(num);
   int   l=50;
    do{
        
    }
     while(num1 < 1 || num1 > 10 || num1 > 50 || num1 > 100 );
   
      switch (num1) {
          case 1:
              JOptionPane.showMessageDialog(null,"El Numero ingresado es : "+"I");
              break;
          case 2:
              JOptionPane.showMessageDialog(null,"El Numero ingresado es : "+"II");
               break;
                case 3:
              JOptionPane.showMessageDialog(null,"El Numero ingresado es : "+"III");
              break;
         case 4:
              JOptionPane.showMessageDialog(null,"El Numero ingresado es : "+"IV");
              break;
         case 5:
             JOptionPane.showMessageDialog(null,"El Numero ingresado es : "+"V");
             break;
         case 6:
               JOptionPane.showMessageDialog(null,"El Numero ingresado es : "+"VI");
               break;
                case 7:
              JOptionPane.showMessageDialog(null,"El Numero ingresado es : "+"VII");
              break;
          case 8:
               JOptionPane.showMessageDialog(null,"El Numero ingresado es : "+"VIII");
               break;
                case 9:
              JOptionPane.showMessageDialog(null,"El Numero ingresado es : "+"IV");
              break;
          case 10:
               JOptionPane.showMessageDialog(null,"El Numero ingresado es : "+"V");
               break;
          case 50:
              JOptionPane.showMessageDialog(null,"El Numero ingresado es : "+"L");
               break;
          case 100:
              JOptionPane.showMessageDialog(null,"El numero ingresado es :"+ "C");
              break;
          default:
              throw new AssertionError();
       
          
  }
   }
}
