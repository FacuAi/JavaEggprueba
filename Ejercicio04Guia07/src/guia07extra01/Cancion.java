/*Desarrollar una clase Cancion con los siguientes atributos:
título y autor. Se deberá definir además dos constructores:
uno vacío que inicializa el título y el autor a cadenas vacías 
y otro que reciba como parámetros el título y el autor de la canción.
Se deberán además definir los métodos getters y setters correspondientes.
 *
 */
package guia07extra01;

/**
 *
 * @author chuki
 */
public class Cancion {
  
  private String titulo;
   private String autor;
    public Cancion(){
    autor = "Spinetta";
    titulo = "Invisible";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    
    }

    void autor(String spinetta) {
        System.out.println("El autor de la cancion es: "+ autor);
    }

    void titulo(String durazno_sangrado) {
       System.out.println("El titulo del album es: " + titulo);
       
    }
}
