/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class Circunferencia {
                                                                 /* Declarar una clase llamada Circunferencia que tenga como atributo */
    public Circunferencia(){
    
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
      public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        radio = leer.nextDouble();
      }
      public void area(){
     double area = Math.PI*(Math.pow(this.radio, 2));
          System.out.println("el area de la circunferencia es: " + area);
      }
      public void Perimetro(){
      double Perimetro = Math.PI*2*radio;
          System.out.println("el perimetro de la cirfunfencia es: "+ Perimetro);
      }
}
