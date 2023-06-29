/*
 * Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
 * jugar un juego de adivinanza de números.
 * El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
 * El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
 * después de cada intento.
 * El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar
el número y el número de veces que cadajugador ha ganado.

 *
 */
package guia07extra03;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author chuki
 */
public class juego {
    private String jugador1;
    private String jugador2;
    private int numeroSecreto;
    private int intentosMaximos = 10;
    private int intentosJugador2 = 0;
    private int ganadosJugador1 = 0;
    private int ganadosJugador2 = 0;

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenidos al juego de adivinanza de números!");
        System.out.print("Jugador 1, por favor introduce tu nombre: ");
        jugador1 = scanner.nextLine();
        System.out.print("Jugador 2, por favor introduce tu nombre: ");
        jugador2 = scanner.nextLine();
        System.out.printf("%s, elige un número entre 1 y 100. %s, tienes %d intentos para adivinarlo.\n", jugador1, jugador2, intentosMaximos);
        Random random = new Random();
        numeroSecreto = random.nextInt(100) + 1;
        boolean adivinado = false;
        while (intentosJugador2 < intentosMaximos && !adivinado) {
            System.out.printf("%s, introduce tu intento (intento %d/%d): ", jugador2, intentosJugador2+1, intentosMaximos);
            int intento = scanner.nextInt();
            if (intento == numeroSecreto) {
                System.out.printf("¡Felicidades %s! Adivinaste el número en %d intentos.\n", jugador2, intentosJugador2+1);
                adivinado = true;
                ganadosJugador2++;
            } else {
                intentosJugador2++;
                if (intento > numeroSecreto) {
                    System.out.println("El número secreto es más bajo.");
                } else {
                    System.out.println("El número secreto es más alto.");
                }
            }
        }
        if (!adivinado) {
            System.out.printf("Lo siento %s, no lograste adivinar el número. El número secreto era %d.\n", jugador2, numeroSecreto);
            ganadosJugador1++;
            
        }
        
        System.out.printf("%s ha ganado %d veces y %s ha ganado %d veces.\n", jugador1, ganadosJugador1, jugador2, ganadosJugador2);
    }
    

    void reiniciarJuego() {
       iniciarJuego(); //To change body of generated methods, choose Tools | Templates.
    }

}
    

/*System.out.println("Jugador 2: Ingrese un numero");
            numb = leer.nextInt();
            for (int i = 1; i <= 5; i++) {
                System.out.println("Intento " + i + " Jugador 1: Ingrese un numero");
                numa = leer.nextInt();

                if (numb == numa) {
                    System.out.println("Felicidades adivinaste el numero");
                    System.out.println("Lo adivinaste en el intento numero" + i);
                    ganado1 = ganado1 + 1;
                    vueltasa = vueltasa + i;
                    break;
                } else {
                    if (numb > numa) {
                        System.out.println("Ingresaste un numero más pequeño");
                    } else {
                        System.out.println("Ingresaste un numero mas alto");
                    }
                }
            }

            System.out.println("Desea Continuar? Si/No");
            continuar = leer.next();

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("Jugador 1 ganó " + ganado1 + " veces" + " En " + vueltasa + " Intentos");
        System.out.println("Jugador 2 ganó " + ganado2 + " veces" + " En " + vueltasb + " Intentos");

    }
}*/