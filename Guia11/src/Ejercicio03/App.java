package Ejercicio03;

import Ejercicio03Servicios.ServiciosCarta;
import java.util.*;

/**
 * barajar(): • siguienteCarta(): • cartasDisponibles(): • darCartas(): cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario. • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y luego se llama al método, este no mostrara esa primera carta.
 *
 * @author chuki
 */
public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("!!Bienvenido Al juego de Cartas!!" + "\n" + " tu mama");
        ServiciosCarta sc = new ServiciosCarta();
        int menu = 0;
        do {
            System.out.println("Menu de Cartas");
            System.out.println("1- Crear Baraja");
            System.out.println("2- Mezclar Baraja");
            System.out.println("3- Dar Cartas");
            System.out.println("4- mostrar Cartas Baraja");
            System.out.println("5- Cartas disponibles");
            System.out.println("6- Mostrar Baraja");
            System.out.println("7- Exit");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("------------");
                    sc.CrearMazo();
                    break;
                case 2:
                    System.out.println("------------");
                    sc.Barajar();
                    break;
                case 3:
                    System.out.println("------------");
                    sc.darCartas(menu);
                    break;
                case 4:
                    System.out.println("-------------");
                    sc.mostrarBaraja();
                    break;
                case 5:
                    System.out.println("-------------");
                    sc.cartasDisponibles();
                    
                    break;
                case 6:
                    System.out.println("-------------");
                    sc.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("---------------");
                    System.out.println("Saliendo del juego Puto");
                    break;
                default:

                    System.out.println("Opcion no valida son 7 nomas boludo");
            }
        } while (menu != 7);

    }
}
