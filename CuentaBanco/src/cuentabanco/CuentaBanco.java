package CuentaBanco;
import entidades.CuentaBancaria;
import java.util.*;
import servicios.CuentaBancariaServicio;
/**
 *
 * @author chuki
 */
public class CuentaBanco {

   
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio nv =  new CuentaBancariaServicio(); // servicio
        CuentaBancaria cb = nv.crearcuenta(); // entidades

        int opcion = 0;

        do {
            System.out.println("===========================================" +"\n");
            System.out.println("|           - MENÚ PRINCIPAL -             |");
            System.out.println("|       -  Bienvenido a tu Cuenta -        |"+"\n");
            System.out.println("===========================================");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Realizar extracción rápida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos de la cuenta");
            System.out.println("0. Salir");
            System.out.println("===========================================");
            System.out.print("Seleccione una opción: ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de dinero a ingresar: ");
                    double cantidadIngresar = leer.nextDouble();
                    nv.ingresar(cb, cantidadIngresar);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de dinero a retirar: ");
                    double cantidadRetirar = leer.nextDouble();
                    nv.retirar(cb, cantidadRetirar);
                    break;
                case 3:
                    nv.extraccionRapida(cb);
                    break;
                case 4:
                    nv.consultarSaldo(cb);
                    break;
                case 5:
                    nv.consultarDatos(cb);
                    break;
                case 0:
                    System.out.println("¡Gracias por utilizar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

            System.out.println();
        } while (opcion != 0);
    }
}