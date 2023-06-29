package herencias04_pi;
import Entidades.Circulo;
import Entidades.Rectangulo;
import java.util.*;
/**
 * Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, 
* en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.  
* 
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 *
 * @author chuki
 */
public class Herencias04_Pi {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  Circulo circulo = new Circulo(6.0d);
  Rectangulo rectangulo = new Rectangulo(4.0d , 6.0d);
        System.out.println(" ~===  Referencia del Circulo es ===~ ");
        System.out.println( "~Area del Circulo " + circulo.CalcularArea() + " ~~~ Perimetro ~~~~  " + circulo.CalcularPerimetro());
        
        System.out.println("\n" + " ~===  Referencia del Rectangulo es  ===~ ");
        System.out.println("~Area del Rectangulo " + rectangulo.CalcularArea() + " ~~~ Perimetro ~~~ " + rectangulo.CalcularPerimetro() + "\n");
        
    }

}
