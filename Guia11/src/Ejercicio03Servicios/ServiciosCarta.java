/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.*/
package Ejercicio03Servicios;

import Ejercicio03Entidad.Carta;
import Ejercicio03Entidad.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class ServiciosCarta {

    Scanner leer = new Scanner(System.in);
    ArrayList<Palo> palos = new ArrayList();
    ArrayList<Carta> cartas = new ArrayList();
    ArrayList<Carta> Rc = new ArrayList();

    public void crearPalos() {
        palos.add(new Palo("Espada"));
        palos.add(new Palo("bastos"));
        palos.add(new Palo("oros"));
        palos.add(new Palo("copas"));
    }

    public void CrearMazo() {
        crearPalos();
        if (cartas.size() > 0) {
            System.out.println("El Mazo Se esta creando");
        } else {
            System.out.println("Generando Baraja"+"\n");
            String[] numero = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};
            for (int i = 0; i < palos.size(); i++) {
                for (int j = 0; j < numero.length; j++) {
                    cartas.add(new Carta(numero[j], palos.get(i)));
                }
            }
            System.out.println("Se creo el Mazo Perrito " + "\n" + "vamo a jugar"+"\t");
        }

    }

    public void Barajar() {
        System.out.println("!Barajando!");
        Collections.shuffle(cartas);
        System.out.println("Se mezclo Correctamente bebe ");
    }

    public Carta SiguienteCarta() {
        Carta c = new Carta();
        if (cartas.isEmpty()) {
            System.out.println("NO Hay Cartas en la Baraja");

        } else {
            c = cartas.get(0);
        }
        return c;
    }

    public void cartasDisponibles() {
        System.out.println("Cartas restantes " + cartas.size());

    }

    public void darCartas(int numCartas) {
        System.out.println("Cuantas cartas queres?");
        int cantidad = leer.nextInt();
        if (cantidad > cartas.size()) {
            System.out.println("no existen suficientes cantidad de cartas!");
        } else {
            int cont = 0;
            while (cont < cantidad) {
                System.out.println(" Te Toco El " + SiguienteCarta() + "");
                Rc.add(cartas.get(0));
                cartas.remove(0);
                cont++;
            }
        }
    }

    public void cartasMonton() {
        System.out.println("Cartas de la baraja" + Rc.size());
        for (Carta cartas : Rc) {
            System.out.println(cartas);
        }
    }

    public void mostrarBaraja() {
        System.out.println("Cartas de la baraja:");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }


    
    
}
