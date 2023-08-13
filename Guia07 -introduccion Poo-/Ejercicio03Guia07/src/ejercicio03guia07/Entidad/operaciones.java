/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03guia07.Entidad;

import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class operaciones {

    private int num1;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    private int num2;

    public operaciones() {

    }

    public void crearOperaciones() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 2 numeros: ");
        setNum1(leer.nextInt());
        setNum2(leer.nextInt());
    }

    public int sumar() {
        int suma = this.getNum1() + this.getNum2();
        System.out.println("La suma de los num es: \n" +  suma);
        return suma;
    }

    public int restar() {
        int resta = this.getNum1() - this.getNum2();
        System.out.println("la resta de los num es:\n " +  resta);
        return resta;
    }

    public int multi() {
        int multi = 0;
        if (this.getNum1() == 0 || this.getNum2() == 0) {
            System.out.println("Uno de los dos valores es :0");
        } else {
            multi = this.num1 * this.num2;
            System.out.println("la multiplicacion de los num es: \n" + multi);
        }

        return multi;
    }

    public double dividir() {
        double dividir = 0;
        if (this.num1 == 0 || this.num2 == 0) {
            System.out.println("Uno de los dos numeros es: 0");

        } else {
            dividir = num1 / num2;
            System.out.println("la divicion de los num es: %.2f \n" + num1 + num2 + dividir);
        }
        return dividir;
    }
}
