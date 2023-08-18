
package principal.persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import principal.entidades.Fabricante;
import principal.entidades.Producto;

/**
 *
 * @author chuki
 */
public class DAOPRODUCTO extends DAO {

    public ArrayList<Producto> mostrarProducto() throws Exception {
        try {
            ArrayList<Producto> producto = new ArrayList();
            String jdbc = "SELECT * FROM  Producto";
            //        sentencia = (Statement) conexion.createStatement();
            //      resultado = sentencia.executeQuery(sql);
            consultarBase(jdbc);
            while (resultado.next()) {
                Producto p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigoFabricante(resultado.getInt(4));
                // System.out.println("nombre del producto " + resultado.getString(jdbc));
                producto.add(p);
            }
            return producto;

        } catch (Exception e) {
            System.out.println("Error papito te equivocaste bobo");
            desconectarBase();
            System.out.println(e);
            throw e;
        } finally {
            desconectarBase();
        }

    }
    // Lista los nombres y los precios de todos los productos de la tabla producto

    public ArrayList<Producto> buscarProductos(String nombre) throws Exception {
        try {
            Producto p = new Producto();
            String sql = "SELECT * FROM tienda.producto";
            ArrayList<Producto> producto = new ArrayList();
            conectarBase();
            sentencia = (Statement) conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                p = new Producto();
                int i = resultado.getInt(0);
                System.out.println("Resultado = " + i);
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getInt(3));
                p.setCodigoFabricante(resultado.getInt(4));
                //    System.out.println("nombre del producto " + resultado.getNString(sql) + "precio del producto" + resultado.getDouble(0) + "codigo del producto" + resultado.getInt(0));
                producto.add(p);
            }
            return producto;

        } catch (Exception e) {
            System.out.println("Error papito te equivocaste bobo2");
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
    }

    // c) Listar aquellos productos que su precio esté entre 120 y 202.
    public ArrayList<Producto> mostrarProducto2(int a, int b) throws Exception {
        try {
            Producto p = new Producto();
            ArrayList<Producto> producto = new ArrayList();
            String sql = "SELECT * FROM producto where precio between " + a + " and " + b;
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                p = new Producto();
                //  System.out.println("mostrar el producto del producto entre 120 y 202" + resultado.getNString("precio") + "nombre producto" + resultado.getNString("nombre"));
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getInt(3));
                p.setCodigoFabricante(resultado.getInt(4));
                producto.add(p);

            }
            return producto;
        } catch (Exception e) {
            System.out.println("Error papito te equivocaste bobo3");
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }

    }
    // d) Buscar y listar todos los Portátiles de la tabla producto.

    public void buscarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portatil%'";
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            while (resultado.next()) {
                //  System.out.println("mostrar los productos " + resultado.getNString(" nombre ") + " " + "precio " + resultado.getDouble("precio"));

            }
        } catch (Exception e) {
            System.out.println("Error papito te equivocaste anda pa lla");
            desconectarBase();
            throw e;
        }
    }

    // e) Listar el nombre y el precio del producto más barato.
    public Producto buscarProductosMasBaratos() throws Exception {
        try {
            Producto p = new Producto();
            ArrayList<Producto> producto = new ArrayList();
            String sql = "SELECT * FROM producto where nombre order by precio asc limit 1";
            conectarBase();

            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);

            while (resultado.next()) {
                //    System.out.println("mostrar los productos " + resultado.getNString(" nombre ") + " " + "precio " + resultado.getDouble("precio"));
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getInt(3));
                p.setCodigoFabricante(resultado.getInt(4));
                producto.add(p);
            }
            return p;
        } catch (Exception e) {
            System.out.println("Error MaricaAa");
            desconectarBase();
            throw e;
        }
    }
//f) Ingresar un producto a la base de datos.

    public void inProducto(Producto p) throws Exception {
        try {
        String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES (?, ?, ?);";
        conectarBase();
        PreparedStatement preparedStatement = conexion.prepareStatement(sql);
        preparedStatement.setString(1, p.getNombre());
        preparedStatement.setDouble(2, p.getPrecio());
        preparedStatement.setInt(3, p.getCodigoFabricante());
        preparedStatement.executeUpdate();
        conexion.commit();
        System.out.println("Producto ingresado correctamente.");
        System.out.println("Producto ingresado correctamente.");
             
        } catch (Exception e) {
            System.out.println("Error Marica");
            desconectarBase();
            throw e;
        }
    }

    //g) Ingresar un fabricante a la base de datos
    public void inFabricante(Fabricante f) throws Exception {
        try {
        String sql = "INSERT INTO producto (nombre, codigo_fabricante) VALUES ('" + f.getNombre() + "', " + f.getCodigo() + ");";
        conectarBase();
        sentencia = conexion.createStatement();
        sentencia.executeUpdate(sql);
        System.out.println("Fabricante ingresado correctamente.");
        } catch (Exception e) {
            System.out.println("Error Marica");
            desconectarBase();
            throw e;
        }
    }

    // h) Editar un producto con datos a elección.
    public void editProducto(Producto p) throws Exception {
        try {
            if (p == null) {
                throw new Exception("Error al editar el producto");
            }
            String sql = "UPDATE producto set nombre = '" + p.getNombre() + "', precio = " + p.getPrecio() + ", codigo_fabricante = " + p.getCodigoFabricante()
                    + " where codigo = " + p.getCodigo() + " ";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            System.out.println("ERROR tiendaServicio");
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
    }
}

/*public void modificarProducto()throws Exception {

    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try {
            DAO TDAO = new DAO() {};
            Producto p = new Producto();

            System.out.println("Ingrese el codigo del producto para EDITAR : ");
            int codigo = leer.nextInt();
            System.out.println("Ingrese el nombre del producto : ");
            String nombre = leer.next();
            System.out.println("Ingrese precio del producto : ");
            double precio = leer.nextDouble();
            System.out.println("Ingrese codigo Fabricante : ");
            int codigofabri = leer.nextInt();

            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setCodigoFabricante(codigofabri);
            p.setCodigo(codigo);

            TDAO.editarProducto(p);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("ERROR tiendaServicio");
        }
       }
       }*/
