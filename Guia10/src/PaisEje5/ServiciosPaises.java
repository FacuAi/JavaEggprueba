/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
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
 */
package PaisEje5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author chuki
 */
public class ServiciosPaises {

    private Set<String> conjuntoPaises;

    public ServiciosPaises() {
        conjuntoPaises = new HashSet<>();
     
    }

    public void agregarPaises(String pais) {
        conjuntoPaises.add(pais);
    }

    public void mostrarPaises() {
        System.out.println("Paises Guardados");
        for (String pais : conjuntoPaises) {
            System.out.println(pais);
        }
    }

    public void mostrarPaisesOrdenados() {
        Set<String> conjuntoOrdenado = new TreeSet<>(conjuntoPaises);
        System.out.println("ordene los paises alfabeticamente");
        for (String pais : conjuntoOrdenado) {
            System.out.println(pais);
        }
    }

    public void eliminarPaises(String pais) {
        if (conjuntoPaises.contains(pais)) {
            conjuntoPaises.remove(pais);
            System.out.println("El pais" + "\n" + pais + "ha sido Sacado del mapa!");
        } else {
            System.out.println("El pais" + "\n" + pais + "no se encuentra el pais en el mapa!.");

        }
    }

}
