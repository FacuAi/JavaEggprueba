/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
    causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
    no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
    número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
      utilizando bloques try/catch para las distintas excepciones */

package com.mycompany.excepciones03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class Excepciones03 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         Scanner leer = new Scanner(System.in);
          try{
         System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
       int num2 = leer.nextInt();
     
        //int numero1 = Integer.parseInt(num1);
       // int numero2 = Integer.parseInt(num2);
        //double resultado =  numero1/numero2;
          //  System.out.println("El Resultado de la division es:  " + resultado);
        }catch(NumberFormatException e) {
            System.out.println("Error: Ingreso un double o  numeros invalidos!! Anda pa bobo!  ");
          }catch(ArithmeticException e){
            System.out.println("Error no puede dividir por cero Buuu");
            System.out.println("By fatu");
          }catch (InputMismatchException e){
            System.out.println("Error papuu : ingrese numeros enteros validos!! ");
          } finally{
             System.out.println("!! Adios querido buenas noches!! ");
       leer.close();
         
    }
  }
}
