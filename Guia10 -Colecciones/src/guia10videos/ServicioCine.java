/*
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package guia10videos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author chuki
 */
public class ServicioCine {
    private List<Pelicula> listaPeliculas;
    public ServicioCine(){
    listaPeliculas = new ArrayList<>();
    }
     public void agregarPelicula(Pelicula pelicula) {
        listaPeliculas.add(pelicula);
    }

    public List<Pelicula> getListaPeliculas() {
        return listaPeliculas;
        
    }
    public void mostrarPeliculas() {
        System.out.println("Todas las películas:");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("-----------------------");
        }
}
    
    public void mostrarPeliculasDuracionMayorAUnaHora() {
        System.out.println("Películas con duración mayor a 1 hora:");
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println("Título: " + pelicula.getTitulo());
                System.out.println("Director: " + pelicula.getDirector());
                System.out.println("Duración: " + pelicula.getDuracion() + " horas");
                System.out.println("-----------------------");
            }
        }
}
     public void ordenarPeliculasPorDuracionDeMayorAMenor() {
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p2.getDuracion(), p1.getDuracion());
            }
        });
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("-----------------------");
        }
    }

    public void ordenarPeliculasPorDuracionDeMenorAMayor() {
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p1.getDuracion(), p2.getDuracion());
            }
        });
        System.out.println("Películas ordenadas por duración (de menor a mayor):");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("-----------------------");
        }
    }

    public void ordenarPeliculasPorTitulo() {
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });
        System.out.println("Películas ordenadas por título:");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("-----------------------");
        }
    }

    public void ordenarPeliculasPorDirector() {
        Collections.sort(listaPeliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareTo(p2.getDirector());
            }
        });
        System.out.println("Películas ordenadas por director:");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println("-----------------------");
        }
    }
}


