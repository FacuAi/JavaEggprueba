/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Entidades.Profesor;
import java.util.List;

/**
 *
 * @author chuki
 */
public class Curso {
    
private int anio;
private char division;
private Profesor profesor;

 private List<Alumno> alumnos;

    public List<Alumno>getAlumnos(){
     return alumnos;  
}
    public void setAlumno(List<Alumno> alumnos){
    this.alumnos = alumnos;
}
public Curso(){
}

    public Curso(int anio, char division, Profesor profesor) {
        this.anio = anio;
        this.division = division;
        this.profesor = profesor;
    }

    public int getanio() {
        return anio;
    }

    public void setanio(int anio) {
        this.anio = anio;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
}
