package guia07extra02;
import java.util.*;

/**Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos
    , sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
    Generar un objeto puntos usando un método crearPuntos() que le pide
    al usuario los dos números y los ingresa en los atributos del objeto.
    Después, a través de otro método calcular y devolver la distancia que
    existe entre los dos puntos que existen en la clase Puntos. 
 *
 * @author chuki
 */
public class extra02 {
 Scanner leer = new Scanner(System.in);
   
    public static void main(String[] args) {
        puntos ps = new puntos();
        ps.crearPuntos();
        ps.calcularDistancia();
    }

}
