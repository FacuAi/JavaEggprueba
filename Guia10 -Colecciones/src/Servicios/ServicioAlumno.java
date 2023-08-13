/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import guia10.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chuki
 */
public class ServicioAlumno {
       private List<Alumno> listaAlumnos;

    public ServicioAlumno() {
        listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    public double notaFinal(String nombreAlumno) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equals(nombreAlumno)) {
                List<Integer> notas = alumno.getNotas();
                int suma = 0;
                for (int nota : notas) {
                    suma += nota;
                }
                return (double) suma / notas.size();
            }
        }
        return -1; // Si el alumno no se encuentra en la lista, devuelve -1
       
    }
  
}

