package Guia07extra10;
import java.util.*;
/**4) Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
    Crea un constructor para inicializar los valores de las propiedades.
    Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
    Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
    Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y que modifique la propiedad "pisoActual" para que tenga ese valor.
    Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el comportamiento del ascensor moviéndolo hacia arriba y hacia abajo, yendo a un piso específico, y mostrando en pantalla el piso actual después de cada movimiento.

 *
 * @author chuki
 */
public class extra10 {

    Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        // Creamos un objeto Ascensor con un máximo de 10 pisos
        ascensor ascensor = new ascensor(10);

        // Mostramos el piso actual del ascensor
        System.out.println("El ascensor se encuentra en el piso " + ascensor.getPisoActual());

        // Pedimos al usuario que ingrese el piso al que quiere ir
        System.out.print("Ingrese el número de piso al que desea ir (0-10): ");
        int piso = sc.nextInt();

        // Movemos el ascensor al piso ingresado por el usuario
        ascensor.irA(piso);

        // Mostramos el piso actual del ascensor después de moverlo
        System.out.println("El ascensor se encuentra en el piso " + ascensor.getPisoActual());

        // Pedimos al usuario que ingrese si quiere subir o bajar
        System.out.print("¿Desea subir o bajar? (s/b): ");
        String opcion = sc.next();

        // Si el usuario quiere subir, movemos el ascensor hacia arriba
        if (opcion.equalsIgnoreCase("s")) {
            ascensor.subir();
        }

        // Si el usuario quiere bajar, movemos el ascensor hacia abajo
        if (opcion.equalsIgnoreCase("b")) {
            ascensor.bajar();
        }

        // Mostramos el piso actual del ascensor después de moverlo
        System.out.println("El ascensor se encuentra en el piso " + ascensor.getPisoActual());

        sc.close();
    }
}
    


