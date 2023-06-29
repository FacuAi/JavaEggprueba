package Eje6;

import java.util.*;

/**
 *
 * @author chuki
 */
public class TiendaApp {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ServiciosProductos tiendaService = new ServiciosProductos();
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("arroz", 10.0);
        productos.put("leche", 5.0);
        productos.put("pan", 2.0);
        int menu = 0;
        do {
            System.out.println("Max Menu:");
            System.out.println("1. Agregar  Mercaderia");
            System.out.println("2. Modificar Mercaderia");
            System.out.println("3. Eliminar Mercaderia");
            System.out.println("4. Mostrar Mercaderia");
            System.out.println("5. Promedio de Mercaderia");
            System.out.println("6. Salir");

            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    tiendaService.agregarProducto(productos);
                    break;
                case 2:
                    tiendaService.modificarProducto(productos);
                    break;
                case 3:
                    tiendaService.eliminarProducto(productos);
                    break;
                case 4:
                    tiendaService.mostrarProductos(productos);
                    break;
                case 5:
                    tiendaService.promedioProductos(productos);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (menu != 6);
    }
}
