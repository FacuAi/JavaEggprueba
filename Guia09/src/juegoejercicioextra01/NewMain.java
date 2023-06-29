package juegoejercicioextra01;
import juegoejercicioextra01.mes;
import java.util.*;

/**
 *
 * @author chuki
 */
public class NewMain {

    public static void main(String[] args) {
//            mesServicios juego = new mesServicios();
//            mes nombre = new mes();
//        juego.jugar();
//        System.out.println("mostrar el mes a adivinar" + nombre.getNombre());
//    }
//}
    
//        
//        
        Scanner leer = new Scanner(System.in);
       String[] mes = new String[12];
       mes[0] = "enero";
        mes[1] = "febrero";
       mes[2] = "marzo";
      mes[3] = "abril";
       mes[4] = "mayo";
        mes[5] = "junio";
        mes[6] = "julio";
        mes[7] = "agosto";
       mes[8] = "septiembre";
       mes[9] = "octubre";
       mes[10] = "noviembre";
       mes[11] = "diciembre";

       int mesAleatorio = (int) Math.random() * 11 + 1;
        String mesElegido;
        String mesSecreto = mes[mesAleatorio];
        do {
            System.out.println("=======Adivine el mes secreto=======");
            System.out.println("Introduzca el nombre del mes en minúsculas: ");
            mesElegido = leer.nextLine();

            if (mesElegido.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes.");
           }
       } while (true);

        leer.close();
    }
}
