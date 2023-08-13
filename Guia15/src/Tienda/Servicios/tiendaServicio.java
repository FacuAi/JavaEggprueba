/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.Servicios;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import principal.Tienda;
import principal.entidades.Fabricante;
import principal.entidades.Producto;
import principal.persistencia.DAO;
import principal.persistencia.DAOPRODUCTO;

/**
 *
 * @author chuki
 */
public class tiendaServicio {

    Tienda t = new Tienda();
    DAOPRODUCTO tDAO = new DAOPRODUCTO();
    private String nombre;
    Producto p = new Producto();

    public void Menu() {
        Scanner leer = new Scanner(System.in);
        int opc;
        try {
            do {
                mostrarMenu();
                opc = leer.nextInt();

                switch (opc) {
                    case 1:

                    case 2:

                    case 3:
             
                    case 4:

                    case 5:
                            listar(opc);
                            break;
                    case 6:
                        ingresarProducto();
                        break;
                    case 7:
                            ingresarFabricante();
                        break;
                    case 8:
                        modificarProducto();
                        break;
                    case 9:
                        System.out.println("Nos vemos...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } while (opc != 9);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("ERROR Menu");
        }
    }

    private static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Listar el nombre de todos los productos");
        System.out.println("2. Listar los nombres y precios de todos los productos");
        System.out.println("3. Listar productos cuyo precio esté entre 120 y 202");
        System.out.println("4. Buscar y listar todos los Portátiles");
        System.out.println("5. Listar el nombre y precio del producto más barato");
        System.out.println("6. Ingresar un producto a la base de datos");
        System.out.println("7. Ingresar un fabricante a la base de datos");
        System.out.println("8. Editar un producto con datos a elección.");
        System.out.println("9. Salir");
        System.out.println("Ingrese el número de la opción deseada:");
    }

    public void listar(int opc) {
        try {

            ArrayList<Producto> producto = new ArrayList();

            switch (opc) {
                case 1:
                    // a) Lista el nombre de todos los productos que hay en la tabla producto.
                    producto = tDAO.mostrarProducto();

                    for (Producto p : producto) {
                        System.out.println("Nombres: " + p.getNombre());
                    }
                    break;
                case 2:
                    // b) Lista los nombres y los precios de todos los productos de la tabla producto.
                    producto = tDAO.mostrarProducto();
                    for (Producto p : producto) {
                        System.out.println("Nombres: " + p.getNombre() + ", Precios: " + p.getPrecio());
                    }
                    break;
                case 3:
                    // c) Listar aquellos productos que su precio esté entre 120 y 202.
                    producto = tDAO.mostrarProducto2(120, 202);
                    for (Producto p : producto) {
                        System.out.println("Nombres: " + p.getNombre() + ", Precios: " + p.getPrecio());
                    }
                    break;
                case 4:
                    // d) Buscar y listar todos los Portátiles de la tabla producto.
                    producto = tDAO.buscarProductos("Portatil");
                    for (Producto p : producto) {
                        System.out.println("Nombres: " + p.getNombre() + ", Precios: " + p.getPrecio());
                    }
                    break;
                case 5:
                    // e) Listar el nombre y el precio del producto más barato.
                    Producto productoMasBarato = tDAO.buscarProductosMasBaratos();
                    System.out.println("Nombres: " + productoMasBarato.getNombre() + ", Precios: " + productoMasBarato.getPrecio());
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } catch (Exception e) {
            System.out.println("ERROR tiendaServicio");
        }
    }

    public void ingresarProducto() {
        // f) Ingresar un producto a la base de datos.
        Scanner leer = new Scanner(System.in);
        try {
            Tienda t = new Tienda();
            DAOPRODUCTO tDAO = new DAOPRODUCTO();
            Producto p = new Producto();
            System.out.println("Ingrese el nombre del producto : ");
            String nombre = leer.nextLine();
            System.out.println("Ingrese precio del producto : ");
            double precio = leer.nextDouble();
            System.out.println("Ingrese codigo Fabricante : ");
            int codigoFabricante = leer.nextInt();

            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setCodigoFabricante(codigoFabricante);

            tDAO.inProducto(p);
            System.out.println("Producto ingresado correctamente.");
        } catch (Exception e) {
            System.out.println("ERROR tiendaServicio");
        }
    }

    public void ingresarFabricante() {
        // g) Ingresar un fabricante a la base de datos
        Scanner leer = new Scanner(System.in);
        try {
            Tienda t = new Tienda();
            DAOPRODUCTO tDAO = new DAOPRODUCTO();
            Fabricante f = new Fabricante();
            System.out.println("Ingrese el nombre del Fabricante : ");
            String nombre = leer.nextLine();
            f.setNombre(nombre);
            tDAO.inFabricante(f);
            System.out.println("Fabricante ingresado correctamente.");
        } catch (Exception e) {
            System.out.println("ERROR tiendaServicio");
        }
    }

    public void modificarProducto() {
        // h) Editar un producto con datos a elección.
        Scanner leer = new Scanner(System.in);
        try {
            Tienda t = new Tienda();
            DAOPRODUCTO tDAO = new DAOPRODUCTO();

            System.out.println("Ingrese el codigo del producto para EDITAR : ");
            int codigo = leer.nextInt();
            leer.nextLine(); // Consumir el salto de línea
            System.out.println("Ingrese el nombre del producto : ");
            String nombre = leer.nextLine();
            System.out.println("Ingrese precio del producto : ");
            double precio = leer.nextDouble();
            System.out.println("Ingrese codigo Fabricante : ");
            int codigoFabricante = leer.nextInt();

            p.setCodigo(codigo);
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setCodigoFabricante(codigoFabricante);

            tDAO.editProducto(p);
            System.out.println("Producto editado correctamente.");
        } catch (Exception e) {
            System.out.println("ERROR tiendaServicio");
        }
    }

}
/*
    a) Lista el nombre de todos los productos que hay en la tabla producto. 
    b) Lista los nombres y los precios de todos los productos de la tabla producto. 
    c) Listar aquellos productos que su precio esté entre 120 y 202. 
    d) Buscar y listar todos los Portátiles de la tabla producto. 
    e) Listar el nombre y el precio del producto más barato. 
    f) Ingresar un producto a la base de datos.
    g) Ingresar un fabricante a la base de datos
    h) Editar un producto con datos a elección.*/
