package CafeteraMain;
import Cafeterapp.Cafetera;
import java.util.*;
import Servicios.CafeteraServicio;


/**
 *
 * @author chuki
 */
public class ejerciocio02 {

   
    public static void main(String[] args) {
           // Creamos una cafetera con capacidad máxima de 1000 ml y cantidad actual de 500 ml
        Cafetera cafetera = new Cafetera(1000, 500);
        CafeteraServicio servicio = new CafeteraServicio();

        // Mostramos la información de la cafetera
        servicio.mostrarInformacionCafetera(cafetera);

        // Llenamos la cafetera
        servicio.llenarCafetera(cafetera);
        servicio.mostrarInformacionCafetera(cafetera);

        // Servimos una taza de café de tamaño 200 ml
        servicio.servirTaza(cafetera, 200);
        servicio.mostrarInformacionCafetera(cafetera);

        // Servimos otra taza de café de tamaño 400 ml
        servicio.servirTaza(cafetera, 400);
        servicio.mostrarInformacionCafetera(cafetera);

        // Agregamos 300 ml de café a la cafetera
        servicio.agregarCafe(cafetera, 300);
        servicio.mostrarInformacionCafetera(cafetera);

        // Vaciamos la cafetera
        servicio.vaciarCafetera(cafetera);
        servicio.mostrarInformacionCafetera(cafetera);
    }
}
     
     
     
     
     
//     
//        
//        // Creamos una cafetera con capacidad máxima de 1000 ml y cantidad actual de 500 ml
//        Cafetera cafetera = new Cafetera(1000, 500);
//        CafeteraServicio servicio = new CafeteraServicio();
//        
//        // Mostramos la información de la cafetera
//        System.out.println("Información de la cafetera:");
//        
//        // Llenamos la cafetera
//        servicio.llenarCafetera(cafetera);
//        System.out.println("\nCafetera llena. Información actualizada:");
//      
//        
//        // Servimos una taza de café de tamaño 200 ml
//        servicio.servirTaza(cafetera, 200);
//        System.out.println("\nSirviendo una taza de café de 200 ml:");
//        
//        
//        // Servimos otra taza de café de tamaño 400 ml
//        servicio.servirTaza(cafetera, 400);
//        System.out.println("\nSirviendo una taza de café de 400 ml:");
//        
//        
//        // Agregamos 300 ml de café a la cafetera
//        servicio.agregarCafe(cafetera, 300);
//        System.out.println("\nAgregando 300 ml de café. Información actualizada:");
//        
//        
//        // Vaciamos la cafetera
//        servicio.vaciarCafetera(cafetera);
//        System.out.println("\nCafetera vaciada. Información actualizada:");
//      
//        
//        scanner.close();
//    }
//}
//        CafeteraServicio cafeteraServicio = new CafeteraServicio();
//        Cafetera cafetera = new Cafetera(1000, 500); // Creamos la cafetera con capacidad máxima de 1000 ml y cantidad actual de 500 ml
//        
//
//          
//        boolean salir = false;
//        
//        while (!salir) {
//            System.out.println("Bienvenido a la cafetera virtual");
//            System.out.println("--------------------------------");
//            System.out.println("1. Llenar cafetera");
//            System.out.println("2. Servir taza");
//            System.out.println("3. Agregar café");
//            System.out.println("4. Vaciar cafetera");
//            System.out.println("5. Salir");
//            
//            int opcion = scanner.nextInt();
//            
//            switch(opcion) {
//                case 1:
//                    cafeteraServicio.llenarCafetera(cafetera);
//                    System.out.println("La cafetera ha sido llenada");
//                    break;
//                    
//                case 2:
//                    System.out.println("Ingrese el tamaño de la taza (ml):");
//                    int tamanoTaza = scanner.nextInt();
//                    boolean seSirvioTaza = cafeteraServicio.servirTaza(cafetera, tamanoTaza);
//                    
//                    if (seSirvioTaza) {
//                        System.out.println("Se sirvió la taza con éxito");
//                    } else {
//                        System.out.println("No se pudo servir la taza. Quedaron " + cafetera.getCantidadActual() + " ml de café en la cafetera");
//                    }
//                    break;
//                    
//                case 3:
//                    System.out.println("Ingrese la cantidad de café a agregar (ml):");
//                    int cantidadAgregar = scanner.nextInt();
//                    cafeteraServicio.agregarCafe(cafetera, cantidadAgregar);
//                    System.out.println("Se agregaron " + cantidadAgregar + " ml de café a la cafetera");
//                    break;
//                    
//                case 4:
//                    cafeteraServicio.vaciarCafetera(cafetera);
//                    System.out.println("La cafetera ha sido vaciada");
//                    break;
//                    
//                case 5:
//                    salir = true;
//                    break;
//                    
//                default:
//                    System.out.println("Opción inválida. Por favor, ingrese una opción válida");
//            }
//            
//            System.out.println("--------------------------------");
//        }
//        
//        System.out.println("Gracias por usar la cafetera virtual. Hasta pronto!");
//    }
//}