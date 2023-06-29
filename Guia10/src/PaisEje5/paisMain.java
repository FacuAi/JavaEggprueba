package PaisEje5;

import java.util.*;
import PaisEje5.ServiciosPaises;

/** Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 *
 * @author chuki
 */
public class paisMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosPaises servicio = new ServiciosPaises();
        String respuesta;
        do {
            System.out.println("ingrese un pais");
            String pais = leer.nextLine();
            servicio.agregarPaises(pais);
            System.out.println("¿desea agregar otro pais? (S/N):");
            respuesta = leer.nextLine();
            
        } while (respuesta.equalsIgnoreCase("S"));
        //mostrar todos los paises guardados
        servicio.mostrarPaises();
        //Mostrar los paises ordenadosAlfabeticamente
        servicio.mostrarPaisesOrdenados();
        System.out.println("ingrese un pais para Sacarlo del mapa");
        String paisEliminar = leer.nextLine();
        servicio.eliminarPaises(paisEliminar);
    }

}
