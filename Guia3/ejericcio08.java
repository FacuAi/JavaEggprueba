package test.Guia3;
import java.util.*;
/**
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:|
    * * * *
    *     *
    *     *
    * * * *
 *
 * @author chuki
 */
public class ejericcio08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num-1 || j == 0 || j == num-1) {
                    System.out.print(" * ");
                }else if (i==j) {
                    for (int k=0;k<(num-2);k++){
                    System.out.print("   ");
                }
                }    
            }
            System.out.println(" ");
        }
    }

}
 


