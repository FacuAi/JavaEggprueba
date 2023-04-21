package Guia5vectores;
import java.util.*;
/**
 *Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
 * define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

 * @author chuki
 */
public class Ejercicio13y14practico {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  String vector[] = new String[6];
  String aux = "";
        System.out.println("Pedir nombres de equipo");
  
  for(int i = 0 ; i < 6; i++){
  vector[i] = leer.next();
   }
 for (String elemento: vector){
     aux += "\n"+ elemento;
     
    }
        System.out.println(aux);
    }
}
