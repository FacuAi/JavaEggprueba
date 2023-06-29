package guia10videos;
import java.util.*;
/**Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
 *
 * @author chuki
 */
public class Videos {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
  ServicioCine servicio = new ServicioCine();
  
  String respuesta;
  do{
      System.out.println("Ingrese El titulo del Film: ");
      String titulo = leer.nextLine();
      
      System.out.println("Ingrese el nombre del director: ");
      String director = leer.nextLine();
      
      System.out.println("Ingrese la duracion del Film (Por hora)");
      Double duracion = leer.nextDouble();
      leer.nextLine();
      Pelicula pelicula = new Pelicula(titulo, director, duracion);
            servicio.agregarPelicula(pelicula);

            System.out.print("¿Desea agregar otra película? (S/N): ");
            respuesta = leer.nextLine();
             } while (respuesta.equalsIgnoreCase("S"));

        // Mostrar todas las películas
        servicio.mostrarPeliculas();

        // Mostrar películas con duración mayor a 1 hora
        servicio.mostrarPeliculasDuracionMayorAUnaHora();

        // Ordenar películas por duración (de mayor a menor)
        servicio.ordenarPeliculasPorDuracionDeMayorAMenor();

        // Ordenar películas por duración (de menor a mayor)
        servicio.ordenarPeliculasPorDuracionDeMenorAMayor();

        // Ordenar películas por título
        servicio.ordenarPeliculasPorTitulo();

        // Ordenar películas por director
        servicio.ordenarPeliculasPorDirector();
    }
}
  
   
  
    

