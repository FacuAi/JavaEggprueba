package Guia07extra07;
import java.util.*;
/* 1)Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
            Crea tres objetos de la clase "Coche" y muéstralos por pantalla.

*2) Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y otro para mostrar por pantalla los estudiantes que tienen una nota media superior.

3) Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
Crea un constructor para inicializar los valores de las propiedades y un método para mostrar por pantalla la información de la mascota.
Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.

4) Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
Crea un constructor para inicializar los valores de las propiedades.
Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y que modifique la propiedad "pisoActual" para que tenga ese valor.
Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el comportamiento del ascensor moviéndolo hacia arriba y hacia abajo, yendo a un piso específico, y mostrando en pantalla el piso actual después de cada movimiento.

5) Crear una clase "Equipaje" que tendrá los atributos color, contenido, si tiene objetos de metal(boolean) y aprobada(boolean). Se deben crear 3 objetos de tipo Equipaje, por defecto el atributo "aprobada" debe ser falso. Se debe crear un método que simule un detector de metales, en el cual debe informar si se detectan o no objetos de metal y modificar el atributo de aprobación e informar al usuario la situación de su equipaje.

6) Crear una clase "Estudiante" con los atributos nombre, nota1, nota2, nota3, promedio y promocionado(boolean). Se deben crear 5 objetos de tipo estudiante, en el cual se le solicitará al usuario que ingrese el nombre del estudiante y sus respectivas notas. Luego se debe crear un método para el cálculo del promedio y su respectivo análisis, si el promedio es mayor o igual a 6 la condición del estudiante es promocionado. Luego, evaluar cuántos estudiantes han promocionado y cuántos no han alcanzado esa condición.

7) Crear una clase "Encriptador" que tendrá como atributos una cadena a encriptar y una cadena con caracteres para encriptar. Se deben establecer como cadena de encriptación la siguiente secuencia (AAAAAA) y se debe solicitar al usuario la cadena a encriptar (la misma debe tener una longitud máxima de 6).
Luego se debe crear un método que permita encriptar la palabra intercalando un carácter de la cadena a encriptar con un carácter de la secuencia, el método devolverá la cadena encriptada. 
Ejemplo : 
- cadena ingresada por el usuario: "cadena"
- cadena encriptada que devuelve el método: "cAaAdAeAnAaA"
(recuerden el método concat() y substring())
 *
 * @author chuki
 */
public class extra07 {
  Scanner leer = new Scanner(System.in);
   
    public static void main(String[] args) {

    coche  M1 = new coche  ("Honda","Civic" , 200000);
    coche M2 = new coche ("Toyota" , "Corola" , 20000);
    coche M3 = new coche  ("Suzuki" ,"fun" , 100000);
    
        System.out.println("coche 1:"+ M1.getMarcas()+ "\t"+ M1.getModelo() + "\t"+ M1.getPrecio());
        System.out.println("coche 2 :"+ M2.getMarcas() + "\t"+ M2.getModelo() + "\t"+ M2.getPrecio());
        System.out.println("coche 3 :"+ M3.getMarcas() +  "\t"+ M3.getModelo() + "\t"+ M3.getPrecio());
      
    }

}
