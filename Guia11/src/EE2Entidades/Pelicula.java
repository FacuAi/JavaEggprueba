/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EE2Entidades;

/**
 *
 * @author chuki
 */
public class Pelicula {

    private String titulo;
    private Integer duracionEnMinutos;
    private Integer edadMinima;
    private String Director;

    public Pelicula() {
    }

    public Pelicula(String titulo, Integer duracionEnMinutos, Integer edadMinima, String Director) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.edadMinima = edadMinima;
        this.Director = Director;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public String getDirector() {
        return Director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracionEnMinutos(Integer duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracionEnMinutos=" + duracionEnMinutos + ", edadMinima=" + edadMinima + ", Director=" + Director + '}';
    }

}
