/*
 Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package Servicios;



import Cafeterapp.Cafetera;

        
/**
 *
 * @author chuki
 */
public class CafeteraServicio {
    
  public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("\nLa cafetera ha sido llenada.");
    }
    
    public void servirTaza(Cafetera cafetera, int tamanoTaza) {
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
            System.out.println("\nSe ha servido una taza de " + tamanoTaza + " ml de café.");
        } else {
            System.out.println("\nNo hay suficiente café en la cafetera para llenar la taza de " + tamanoTaza + " ml.");
            System.out.println("Se sirvió una taza de " + cafetera.getCantidadActual() + " ml de café.");
           cafetera.setCantidadActual(0);
       }    }
   
   public void vaciarCafetera(Cafetera cafetera) {
       cafetera.setCantidadActual(0);
       System.out.println("\nLa cafetera ha sido vaciada.");
   }    
    public void agregarCafe(Cafetera cafetera, int cantidad) {
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
        System.out.println("\nSe han agregado " + cantidad + " ml de café a la cafetera.");
    }
        public void mostrarCantidadActual(Cafetera cafetera) {
       System.out.println("\nLa cantidad actual de café en la cafetera es: " + cafetera.getCantidadActual() + " ml.");
   }
   
   public void mostrarCapacidadMaxima(Cafetera cafetera) {       System.out.println("\nLa capacidad máxima de la cafetera es: " + cafetera.getCapacidadMaxima() + " ml.");
  }
    
    public void mostrarInformacionCafetera(Cafetera cafetera) {
        System.out.println("\nInformación de la cafetera:");
       System.out.println("- Capacidad máxima: " + cafetera.getCapacidadMaxima() + " ml");
        System.out.println("- Cantidad actual: " + cafetera.getCantidadActual() + " ml");
        
        if (cafetera.getCantidadActual() == 0) {
            System.out.println("- La cafetera está vacía.");
        } else if (cafetera.getCantidadActual() == cafetera.getCapacidadMaxima()) {
           System.out.println("- La cafetera está llena.");
        } else {
            System.out.println("- La cafetera no está completamente llena.");
        }
    }
}
//
//    private Cafetera cafetera;
//
//    public CafeteraServicio(Cafetera cafetera) {
//      this.cafetera = cafetera;
// 
//}
//
//   public CafeteraServicio() {
//        
//   }
//  public void llenarCafetera() {
//      cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
//    }
//
//   public void servirTaza(int tamanoTaza) {
///        if (cafetera.getCantidadActual() >= tamanoTaza) {
//////            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
////            System.out.println("Se ha llenado la taza.");
//        } else {
//            int cantidadServida = cafetera.getCantidadActual();
//            cafetera.setCantidadActual(0);
//            System.out.println("No se ha llenado la taza completamente. Se ha servido " + cantidadServida + " ml de café.");
//        }
//    }
//
//    public void vaciarCafetera() {
//        cafetera.setCantidadActual(0);
//    }
//
//    public void agregarCafe(int cantidad) {
//        if (cafetera.getCantidadActual() + cantidad <= cafetera.getCapacidadMaxima()) {
//            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
//        } else {
//            System.out.println("La cafetera no puede contener más café.");
//        }
//    }
//
//    public void llenarCafetera(Cafetera cafetera) {
//        
//    }
//
//    public boolean servirTaza(Cafetera cafetera, int tamanoTaza) {
//       
//    }
//
//    public void agregarCafe(Cafetera cafetera, int cantidad) {
//         if (cafetera.getCantidadActual() + cantidad <= cafetera.getCapacidadMaxima()) {
//            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidad);
//        } else {
//            System.out.println("La cafetera no puede contener más café.");
//    }
//
//    
//     
//    }
//}
