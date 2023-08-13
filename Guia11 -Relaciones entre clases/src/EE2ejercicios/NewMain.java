package EE2ejercicios;

import EE2Entidades.Cine;
import EE2Entidades.Espectador;
import EE2Servicios.CineServicios;
import java.util.*;

/**
 *
 * @author chuki
 */
public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CineServicios cs = new CineServicios();

        Cine c = cs.abrirCine();
        ArrayList<Espectador> e = cs.crearPosiblesEspectadores();
         cs.modificarCine(c);
        
        cs.recibirPosiblesEspectadores(c, e);
        cs.verSala(c);
        cs.revisarEspectadores(c);
       
    }
}
