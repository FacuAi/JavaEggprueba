package guia07extra03;
import java.util.*;
/**Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
 * jugar un juego de adivinanza de números.
 * El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
 * El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
 * después de cada intento.
 * El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

 *
 * @author chuki
 */
public class extra03 {

  Scanner leer = new Scanner(System.in); 
    public static void main(String[] args) {
          juego juego = new juego();
        juego.iniciarJuego();
         juego.reiniciarJuego();
 
    }

}