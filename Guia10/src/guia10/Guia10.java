package guia10;
import java.util.*;
/**
 *
 * @author chuki
 */
public class Guia10 {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  
//   listas // ArrayList<Integer> numeroA = new ArrayList();
//  conjuntos //  TreeSet<String> numero= new TreeSet();                    Ejemplo1
//   mapas //  HashMap<Integer,String> personas = new HashMap();
    

//listas:
ArrayList<String> numerosA = new ArrayList();
String nombreAlumnoA[] = {"Facu","Richard","Guido","Sofia","Sergio"};
for (int i = 0; i < 5; i++) {
           numerosA.add(nombreAlumnoA[i]);
       } 
//     numerosA.remove(0);          //borra el numero de indice y elemento del arraylist
//       numerosA.clear();            // borra todo el indice 
    numerosA.remove("Guido");
      for (String integer : numerosA) {
   System.out.println(integer);      
    }

        

//conjunto
HashSet<Integer> numero = new HashSet();
        for (int i = 0; i < 5; i++) {
          numero.add(i);  
        }
        numero.remove(4);
        for (Integer integer : numero) {
            System.out.println(integer);
        }
        

//mapas
HashMap<Integer,String> alumnos = new HashMap();
int dni = 38940140;
String nombreAlumno[] = {"Facu","Richard","Guido","Sofia","Sergio"};

       for (int i = 0; i < 5; i++) {
        alumnos.put(i , nombreAlumno[i]); //put para editar un dato 
        }
        alumnos.remove(6);
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            Integer key = entry.getKey();
           String value = entry.getValue();
           System.out.println(key + value);
        }
    
      ArrayList<String> bebidas = new ArrayList();
bebidas.add("café");
bebidas.add("té");
Iterator<String> it =bebidas.iterator();
while(it.hasNext())
    
{
    
if (it.next().equals("Chocolatada")){
it.remove();
for (String bebida : bebidas) {
        System.out.println("mostrame las bebidas" + bebidas); 
}
    
    }
}
    
    }
}
