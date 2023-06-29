package Ejercicio02;

import EntidadesE2.Jugador;
import EntidadesE2.Juego;
import EntidadesE2.Revolver;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author chuki
 */
public class E2 {

   
    public static void main(String[] args) {/*
  Scanner leer = new Scanner(System.in);
   ArrayList<jugador>jugadores = new ArrayList();
        System.out.println("Cargando el Arma");
        System.out.println("Se va a iniciar el juego.-----\n"+"Seleccione la cantidad de jugadores");
        int cantidadJugadores = leer.nextInt();
        if (cantidadJugadores<1||cantidadJugadores>6) {
            cantidadJugadores=6;
        }
        for (int i = 0; i < cantidadJugadores; i++) {
            jugador a = new jugador(i + 1);
            jugadores.add(a);
        }

        System.out.println("Se va a preparar el revolver para el juego");
        Revolver r = new Revolver();
        r.llenarRevolver();

        System.out.println("Revolver cargado. Se da inicio al juego"+"\n"
+  "+--^----------,--------,-----,--------^-,\n" +
" | |||||||||   `--------'     |          O\n" +
" `+---------------------------^----------|\n" +
"   `\\_,---------,---------,--------------'\n" +
"     / XXXXXX /'|       /'\n" +
"    / XXXXXX /  `\\    /'\n" +
"   / XXXXXX /`-------'\n" +
"  / XXXXXX /\n" +
" / XXXXXX /\n" +
"(________(                \n" +
"             "  );
        juego j = new juego();
        j.llenarJuego(jugadores, r);
    
        boolean juegoSigue = true;
        int turno = 1;
        while (juegoSigue) {
            if (turno == (cantidadJugadores)){
                turno = 0;
            }
            System.out.println("El " + j.getJugadores().get(turno).getNombre() + " procede a disparar");
            juegoSigue = j.ronda(turno);
            if (juegoSigue) {
                System.out.println("El " + j.getJugadores().get(turno).getNombre() + " se salva");
            } else {
                System.out.println("El " + j.getJugadores().get(turno).getNombre() + " ha sido mojado");
                System.out.println("Juego finalizado");
            }
            turno++;
        }
        System.out.println("");
    } */
        
        
          Scanner leer = new Scanner(System.in);
ArrayList<Jugador> jugadores = new ArrayList<>();
System.out.println("Cargando el Arma");
System.out.println("Se va a iniciar el juego.\nSeleccione la cantidad de jugadores");
int cantidadJugadores = leer.nextInt();
if (cantidadJugadores < 1 || cantidadJugadores > 6) {
    cantidadJugadores = 6;
}
leer.nextLine(); // Consumir el salto de línea después de leer un entero

for (int i = 0; i < cantidadJugadores; i++) {
    System.out.print("Introduzca el nombre del jugador " + (i + 1) + ": ");
 
  
    Jugador jugador = new Jugador();
    jugador.setNombre(leer.nextLine());
    jugador.setId(i+1);
   jugadores.add(jugador);
}

System.out.println("Se va a preparar el revolver para el juego");
Revolver r = new Revolver();
r.llenarRevolver();

System.out.println("Revolver cargado. Se da inicio al juego");
System.out.println("+--^----------,--------,-----,--------^-,\n" +
        " | |||||||||   `--------'     |          O\n" +
        " `+---------------------------^----------|\n" +
        "   `\\_,---------,---------,--------------'\n" +
        "     / XXXXXX /'|       /'\n" +
        "    / XXXXXX /  `\\    /'\n" +
        "   / XXXXXX /`-------'\n" +
        "  / XXXXXX /\n" +
        " / XXXXXX /\n" +
        "(________(                \n" +
        "             ");

Juego j = new Juego();
j.llenarJuego(jugadores, r);

boolean juegoSigue = true;
int turno = 0; // Inicializar turno en 0
while (juegoSigue) {
            if (turno == (cantidadJugadores)){
                turno = 0;
            }
            System.out.println(" → " + j.getJugadores().get(turno).getNombre()+ " procede a disparar");
            juegoSigue = j.ronda(turno);
            if (juegoSigue) {
                System.out.println(" → " + j.getJugadores().get(turno).getNombre() + " se salva");
            } else {
                System.out.println(" → " + j.getJugadores().get(turno).getNombre() + " ha sido mojado");
                System.out.println("Juego finalizado");
            }
            turno++;
        }
        System.out.println("");
    }
}