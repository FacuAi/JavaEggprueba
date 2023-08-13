package herenciasextra02.edificio;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.*;

/**
 *
 * @author chuki
 */
public class HerenciasExtra02Edificio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
// Crear ArrayList de tipo Edificio
        ArrayList<Edificio> edificio = new ArrayList<>();
        Polideportivo p = new Polideportivo();
 // Agregar dos polideportivos
        edificio.add(new Polideportivo(50, 30, 20, "Egg", "Techado"));
        edificio.add(new Polideportivo(40, 25, 18, "Herencias", "Abierto"));
        
// Agregar dos edificios de oficinas

        edificio.add(new EdificioDeOficinas(30, 20, 15, 5, 10, 4));
        edificio.add(new EdificioDeOficinas(35, 25, 20, 8, 12, 6));
      



// Recorrer el ArrayList de edificios y mostrar información
        for (Edificio aux : edificio) {
            
           

            // Verificar si el edificio es de tipo Polideportivo
            if (aux  instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) aux  ;
                
                System.out.println("Tipo de instalación del polideportivo: " + polideportivo.getTipoInstalacion() +"\n" + "nombre del polideportivo " +polideportivo.getNombre());
            }

            // Verificar si el edificio es de tipo EdificioDeOficinas
            if (aux  instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) aux ;
                System.out.println("Cantidad de personas en el edificio de oficinas: " + edificioDeOficinas.cantPersonas());
            }

            System.out.println("------------------");
        }
         double superficieTotal= 0;
         double volumenTotal = 0;
        for (Edificio aux1 : edificio) {
           superficieTotal += aux1.calcularSuperficie();
       volumenTotal += aux1.calcularVolumen();
        }
           System.out.println("Superficie del edificio: " + superficieTotal);
            System.out.println("Volumen del edificio: " + volumenTotal);
    }
}
    


