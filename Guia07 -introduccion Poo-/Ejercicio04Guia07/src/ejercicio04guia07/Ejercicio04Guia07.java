package ejercicio04guia07;
import Entidades.Rectangulo;
import java.util.Scanner;
/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
 * La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
 * Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.
 *  Superficie = base * altura / Perímetro = (base + altura) * 2.
 *
 * @author chuki
 */
public class Ejercicio04Guia07 {

 
   
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la base del rectángulo: ");
    int base = scanner.nextInt();
    System.out.print("Ingrese la altura del rectángulo: ");
    int altura = scanner.nextInt();
    
    Rectangulo rectangulo = new Rectangulo(base, altura);
    
    int superficie = rectangulo.calcularSuperficie();
    int perimetro = rectangulo.calcularPerimetro();
    
    System.out.println("El rectángulo tiene una superficie de " + superficie + " unidades cuadradas");
    System.out.println("El rectángulo tiene un perímetro de " + perimetro + " unidades");
    
    rectangulo.dibujarRectangulo();
}
  }
//        Rectangulo ro = new Rectangulo();
//        
//        ro.crearRectangulo();
//        ro.superficie();
//        ro.perimetro();
//        ro.dibujar();
//    }
//    }


