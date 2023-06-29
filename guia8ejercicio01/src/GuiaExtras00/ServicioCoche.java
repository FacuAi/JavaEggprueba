/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiaExtras00;
import java.util.ArrayList;
/**
 *
 * @author chuki
 */
public class ServicioCoche {
    private ArrayList<Coche> listaCoches;
    
    public ServicioCoche(){
    listaCoches = new ArrayList<Coche>();
    
  }
    
    public void ingresarCoche (Coche coche){
    listaCoches.add(coche);
    }
    public void mostrarCoches() {
        for (Coche coche : listaCoches) {
            System.out.println("Marca: " + coche.getMarca() + ", Modelo: " + coche.getModelo() + ", Precio: " + coche.getPrecio());
        }
    }
}
