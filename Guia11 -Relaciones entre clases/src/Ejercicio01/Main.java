package Ejercicio01;

import E1Servicios.E1Servicios;
import Ejercicios01Entidades.Perro;
import Ejercicios01Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 *
 * @author chuki
 */
public class Main {

  private static  Scanner leer = new Scanner(System.in);
    private static E1Servicios eSs = new E1Servicios();

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList();
        List<Perro> perrosa = new ArrayList();


        System.out.println("Se procedera a cargar dos personas en el sistema");
        for (int i = 0; i < 2; i++) {
          personas.add(eSs.CrearPersona());
        }
        
        System.out.println("");
        System.out.println("Se procede a cargar dos perros en el sistema");
        for (int i = 0; i < 2; i++) {
            perrosa.add(eSs.CrearPerro());
        }
        System.out.println("");
        for (Persona aux : personas) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido() + " \nseleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : perrosa) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            
               String adoptable = leer.nextLine();


             int ctrol = 0;
            for (int i = 0; i < perrosa.size(); i++) {
                if (adoptable.equalsIgnoreCase(perrosa.get(i).getNombre())) {
                    aux.setPerro(perrosa.get(i));
                    ctrol++;
                    perrosa.remove(i);
                }
        }
        if (ctrol == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }

        System.out.println("");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " a adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza());
            }

        }
    

    }
}