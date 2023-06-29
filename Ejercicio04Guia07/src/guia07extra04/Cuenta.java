/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
*/
package guia07extra04;

import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class Cuenta {
   
     private double saldo;
    private String titular;
Cuenta() {
        
}
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    Cuenta(String string) {
        
    }
    void titular() {
        System.out.println("Ingrese el nombre de usuario");
    }
    public void retirarDinero(double cantidad) {
    if (cantidad > saldo) {
        System.out.println("No hay suficiente saldo en la cuenta.");
    } else {
        saldo -= cantidad;
        System.out.printf("Se ha retirado %.2f€ de la cuenta de %s. Nuevo saldo: %.2f€\n", cantidad, titular, saldo);
    }
    if (saldo < 0) {
        saldo = 0;
        System.out.println("El saldo no puede ser negativo. Se ha establecido el saldo en cero.");
    }
}

     public void ingresarDinero(double cantidad) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a ingresar: ");
        double Cantidad = scanner.nextDouble();
    if (cantidad > 0) {
        saldo += cantidad;
   System.out.println("la cantidad actual es: €" + Cantidad);
    } else {
        System.out.println("La cantidad ingresada debe ser mayor a 0.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    void saldo() {
       
    }

    void cantidad() {
       
    }

   
   



}
