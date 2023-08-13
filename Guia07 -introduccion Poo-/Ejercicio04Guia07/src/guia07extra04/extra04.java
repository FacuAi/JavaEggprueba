package guia07extra04;
import java.util.*;
/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.

 * @author chuki
 */
public class extra04 {

   
    public static void main(String[] args) {
   Cuenta miCuenta = new Cuenta(" Facundo ", 1000.0);
        System.out.printf("Cuenta de %s con saldo inicial de %.2f€\n", miCuenta.getTitular(), miCuenta.getSaldo());
        miCuenta.retirarDinero(100.0);
      miCuenta.ingresarDinero(400.0);
       miCuenta.retirarDinero(900.0);
        miCuenta.cantidad();
       
    
    }

}
