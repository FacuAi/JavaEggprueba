/*
 *Definir los siguientes métodos en AhorcadoService:
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.

 */
package Ahorcado_AhorcadoService;
import Ahorcado_AhorcadoService.Ahorcado;
import java.util.Scanner;


/**
 *
 * @author chuki
 */
public class AhorcadoService { 

        private char[] palabra;
    private boolean[] letrasEncontradas;
    private int intentosMaximos;
    private int intentosRealizados;

    public AhorcadoService() {
        palabra = null;
        letrasEncontradas = null;
        intentosMaximos = 0;
        intentosRealizados = 0;
    }

    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la palabra a buscar: ");
        String palabraUsuario = scanner.nextLine();

        System.out.print("Ingresa la cantidad de intentos máximos: ");
        intentosMaximos = scanner.nextInt();

        palabra = palabraUsuario.toCharArray();
        letrasEncontradas = new boolean[palabra.length];
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + palabra.length);
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                letrasEncontradas[i] = true;
                encontrada = true;
            }
        }

        if (!encontrada) {
            intentosRealizados++;
        }

        return encontrada;
    }

    public void encontradas() {
        int encontradas = 0;
        int faltan = 0;

        for (boolean encontrada : letrasEncontradas) {
            if (encontrada) {
                encontradas++;
            } 
        }

        System.out.println("Letras encontradas: " + encontradas);
       System.out.println("Letras que faltan: "+(palabra.length  -encontradas));
    }

    public int intentos() {
        return intentosMaximos - intentosRealizados;
       
    }

    public void juego() {
        Scanner scanner = new Scanner(System.in);
        crearJuego();
        while (intentos() > 0) {
            
            System.out.print("Ingresa una letra: ");
            char letra = scanner.nextLine().charAt(0);

            boolean encontrada = buscar(letra);

            if (encontrada) {
                System.out.println("La letra está en la palabra.");
            } else {
                System.out.println("La letra no está en la palabra.");
            }

            encontradas();
            System.out.println("Cantidad intentos: " + intentos());
            if (intentos() == 0) {
                System.out.println("Se te acabaron los intentos. La palabra correcta era: " + new String(palabra));
            } else if (letrasEncontradas()) {
                System.out.println("¡Felicidades! Has descubierto la palabra.");
                break;
            }
        }
        
    }

    private boolean letrasEncontradas() {
        for (boolean encontrada : letrasEncontradas) {
            if (!encontrada) {
                return false;
            }
        }

        return true;
    }
}