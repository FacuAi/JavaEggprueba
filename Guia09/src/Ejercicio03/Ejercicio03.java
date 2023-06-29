package Ejercicio03;
import java.util.*;
import ArregloService.ArregloService;
/**Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
 * Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 *
 * @author chuki
 */
public class Ejercicio03 {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
     double [] arrayA = new double [50];
        double [] arrayB = new double [20];
        
        ArregloService as = new ArregloService();
        as.inicilizarA(arrayA);
        System.out.println("Esto son los valores de A sin ordenar:");
        as.mostrar(arrayA);
        
        as.inicilizarB(arrayA, arrayB);
       
        as.ordenar(arrayA);  
        System.out.println("Esto son los valores de A sin ordenados:");
        as.mostrar(arrayA);
        System.out.println("Esto son los valores de B:");
        as.mostrar(arrayB);
    }
  
}
  
  
  
  
  
//  // Crear arreglos A y B
//        double[] arregloA = new double[50];
//        double[] arregloB = new double[20];
//
//        // Inicializar la clase ArregloService
//        ArregloService servicio = new ArregloService();
//
//        // Inicializar el arreglo A con números aleatorios usando Math.random()
//        for (int i = 0; i < arregloA.length; i++) {
//            arregloA[i] = (int) (Math.random() * 100);
//        }
//        
//        // Mostrar el arreglo A
//        servicio.mostrar(arregloA);
//        System.out.println("Estos son los valores del arreglo A");
//        // Ordenar el arreglo A de mayor a menor
//        servicio.ordenar(arregloA);
//
//        // Inicializar el arreglo B copiando los primeros 10 números del arreglo A
//        servicio.inicializarB(arregloA, arregloB);
//        System.out.println("el arreglo B copiando los primeros 10 números del arreglo A");
//        // Llenar las últimas 10 posiciones del arreglo B con 0.5
//        for (int i = 10; i < arregloB.length; i++) {
//            arregloB[i] = (int) 0.5;
//        }
//
//        // Mostrar el arreglo A y B
//        servicio.mostrar(arregloA);
//           System.out.println("el arreglo B copiando los primeros 10 números del arreglo A"+ Arrays.toString(arregloA)+ "\n");
//        servicio.mostrar(arregloB);
//         System.out.println("el arreglo B copiando los primeros 10 números del arreglo b"+ "\n"+Arrays.toString(arregloB)+"\n");
//    }
//}
//
//   
   

