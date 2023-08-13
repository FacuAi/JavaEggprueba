package guia11ejemplos;
import java.util.*;
/**
 *
 * @author chuki
 */
public class Guia11ejemplos {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  
        double valor = 21479;
        double tasaAumento = 0.06;
        
        for (int mes = 1; mes <= 12
                ; mes++) {
            System.out.println("Mes " + mes + ": " + valor);
            valor = valor + (valor * tasaAumento);
        }
    }
}
    



