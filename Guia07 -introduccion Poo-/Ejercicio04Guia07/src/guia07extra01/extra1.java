package guia07extra01;

import java.util.*;

/**
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor.
 * Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 *
 * @author chuki
 */
public class extra1 {

    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        Cancion c1 = new Cancion();

        c1.autor("");
        c1.titulo("");
        System.out.println("año 1974 - - ♪-" + "-- \t --" + "- - ♫-" + " Genero: Rock progresivo , Jazz fusión");

    }
}
