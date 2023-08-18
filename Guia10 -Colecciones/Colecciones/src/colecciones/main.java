package colecciones;

import Entidades.Perro;
import PerroServicios.PerroServicio;

import java.util.*;
/**
 *
 * @author chuki
 */
public class main {

   
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        Perro p1 = new Perro();
        PerroServicio ps = new PerroServicio();
        
        ps.perrito();
        ps.mostrarRazas();
        ps.buscarPerro(p1);
        ps.mostrarOrdenar();
    }
    
}

