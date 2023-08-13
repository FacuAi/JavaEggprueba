package excepciones02;

import Entidades.Entidades;
import java.util.*;

/**
 * Definir una Clase que contenga algún tipo de dato de tipo 
 * array y agregue el código para generar y 
 * capturar una excepción ArrayIndexOutOfBoundsException
 * (índice de arreglo fuera de rango).
 *
 * @author chuki
 */
public class Excepciones02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Entidades enti = new Entidades();
        //accede a los elementos del arreglo

        enti.accessArrayElement(2); // indice valido ! 
        enti.accessArrayElement(3); // indice valido ! 
        enti.accessArrayElement(4); // indice valido ! 
        enti.accessArrayElement(7); //entidades fuera de rango ! 
    }

}
