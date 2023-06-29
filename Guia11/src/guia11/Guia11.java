package guia11;
import java.util.*;
/**
 *
 * @author chuki
 */
public class Guia11 {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
        double valor = 18000.0;
        double tasaAumento = 0.09;
        
        for (int mes = 1; mes <= 12; mes++) {
            System.out.println("Mes " + mes + ": " + valor);
            valor = valor + (valor * tasaAumento);
        }
    }
}


