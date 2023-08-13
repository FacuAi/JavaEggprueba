/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.persistencia;

import java.sql.*;
import principal.entidades.Fabricante;

/**
 *
 * @author chuki
 */
public class DAOFABRICANTE extends DAO {

    /*public void ingresarFabri(String nombre) throws Exception {
        try {
            String sql = "insert into fabricante (nombre) values(" + nombre + ") ";
            conectarBase();
            sentencia = (Statement) conexion.createStatement();
            insertarModificarEliminar(sql);
            System.out.println("se ingreso un fabricante");
        } catch (Exception e) {
            System.out.println("Error papito te equivocaste bobo");
            desconectarBase();

            throw e;
        }
    }*/
}
