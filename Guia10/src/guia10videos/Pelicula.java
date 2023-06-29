/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10videos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author chuki
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracion() {
        return duracion;
    }
    
    
}
