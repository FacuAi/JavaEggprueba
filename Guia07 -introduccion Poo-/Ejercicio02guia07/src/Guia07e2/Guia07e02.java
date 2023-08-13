/*
  Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
    A continuación, se deben crear los siguientes métodos:
    Método constructor que inicialice el radio pasado como parámetro.
        Métodos get y set para el atributo radio de la clase Circunferencia.
        Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
    Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
    Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package Guia07e2;

import entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class Guia07e02 {

    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Circunferencia cf = new Circunferencia();

        cf.crearCircunferencia();
        cf.Perimetro();
        cf.area();

    }
}
