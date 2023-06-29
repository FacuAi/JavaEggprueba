package test;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Escribir un programa que lea un número entero por teclado 
 * y muestre por pantalla el doble, 
 * el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 *
 * @author chuki
 */
public class Ejecutar05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("el Doble de ");

        System.out.format("El doble de %d es: %d \nEl triple de %d es: %d \nLa raiz cuadrada de %d es: %f \n", num1, (num1 * 2), num1, (num1 * 3), num1, (Math.sqrt(num1)));
        
        System.out.println("El doble de " + num1 + " es: " + (num1 * 2) + "\nEl triple de " + num1 + " es: " + (num1 * 3)  + "\nLa raiz cuadrada de " + num1 + " es: " + (Math.sqrt(num1))+ "\n");
    }
}
//        
////        
//        
//        
//        double num = Double.parseDouble(JOptionPane.showInputDialog("ingresa un numero"))    ;
//        
//        JOptionPane.showMessageDialog(null, 
//                "El doble de " + num + " es: " + (num *2) + 
//                "\nEl triple de " + num + " es: " + (num *3) + 
//                "\nLa raiz cuadrada de " + num + " es: " + Math.sqrt(num));
//        }
//    
//    
//    
//        }
