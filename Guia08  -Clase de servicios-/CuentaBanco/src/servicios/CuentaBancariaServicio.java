/*
 *  Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
    Método para crear cuenta pidiéndole los datos al usuario.
    Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
    * Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.

Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package servicios;
import entidades.CuentaBancaria;

import java.util.Scanner;
/**
 *
 * @author chuki
 */

public class CuentaBancariaServicio {
private Scanner leer = new Scanner(System.in);
public CuentaBancaria crearcuenta(){
    System.out.println("ingrese al numero de cuenta: ");
    int numeroCuenta = leer.nextInt();  
    System.out.println("Ingrese el DNI del cliente: ");
    long dniCliente = leer.nextLong();
    System.out.println("ingrese una cantidad de Saldo: ");
    double saldoActual = leer.nextInt();
   
    CuentaBancaria cb = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
   return cb;
}
  public double retirar(CuentaBancaria cuenta) {
    System.out.print("Ingrese la cantidad de dinero a retirar: ");
    double cantidad = leer.nextDouble();

    if (cantidad <= 0) {
        System.out.println("¡Error! La cantidad a retirar debe ser mayor a cero.");
    } else if (cantidad > cuenta.getSaldoActual()) {
        System.out.println("¡Error! La cantidad a retirar supera el saldo disponible.");
    } else {
        cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
        System.out.printf("Se ha retirado %.2f de la cuenta.%n", cantidad);
    }

    return cuenta.getSaldoActual();

    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
      double cantidad = cuenta.getSaldoActual() * 0.2;
        cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
        System.out.println("Se ha retirado " + cantidad + " de la cuenta");
        
    }
    public void consultarSaldo(CuentaBancaria nuevosaldo){
        System.out.printf("Mostra el saldo actual : %.2f %n", nuevosaldo.getSaldoActual());
       
    }
    public void consultarDatos(CuentaBancaria datos) {
        System.out.println("Se muestran todos los datos del usuario :");
        System.out.println("el dni es: " + datos.getDniCliente() + "\n"
                + "numero de cuenta es: "+ datos.getNumeroCuenta() + "\n"
                + "el saldo actual es: " + datos.getSaldoActual() + "\n" );
        
    }

    public void ingresar(CuentaBancaria cb, double cantidadIngresar) {
        cb.setSaldoActual(cb.getSaldoActual()+cantidadIngresar);
    }

    public void retirar(CuentaBancaria cb, double cantidadRetirar) {
    double cantidad = leer.nextDouble();

    if (cantidad <= 0) {
        System.out.println("¡Error! La cantidad a retirar debe ser mayor a cero.");
    } else if (cantidad > cb.getSaldoActual()) {
        System.out.println("¡Error! La cantidad a retirar supera el saldo disponible.");
    } else {
        cb.setSaldoActual(cb.getSaldoActual() - cantidad);
        System.out.printf("Se ha retirado %.2f de la cuenta.%n", cantidad);
    }
    }

    
    
       
    

    public class vicio {

        public vicio() {
        }
    }
    
}
