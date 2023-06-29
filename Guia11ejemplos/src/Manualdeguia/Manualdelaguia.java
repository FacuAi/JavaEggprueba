package Manualdeguia;
import Entidades.Alumno;
import Entidades.Curso;
import Entidades.Profesor;

import java.util.*;
/**
 *
 * @author chuki
 */
public class Manualdelaguia {
    public static void main(String[] args) {
Profesor profesor = new Profesor();
//permite modificar la informacion(Set)
profesor.setNombre("Juan");
profesor.setApellido("Rivero");       

ArrayList <Alumno> alumno = new ArrayList();
Alumno newAlumno = new Alumno();

newAlumno.setAnio(2020);
newAlumno.setNombre("Gusty");
newAlumno.setApellido("Carlini");
alumno.add(newAlumno);

Alumno newAlumno1;

newAlumno.setAnio(2022);
newAlumno.setNombre("juan");
newAlumno.setApellido("licciardi");
alumno.add(newAlumno);
        

       

Curso curso = new Curso();
curso.setProfesor(profesor);
curso.setAlumno(alumno);

        System.out.println(curso.getProfesor().getNombre());
        System.out.println(curso.getProfesor().getApellido());
        //gusty
        System.out.println(curso.getAlumnos().get(0).getNombre());
         System.out.println(curso.getAlumnos().get(0).getApellido());
           System.out.println(curso.getAlumnos().get(0).getAnio());
           //juan
           System.out.println(curso.getAlumnos().get(1).getNombre());
         System.out.println(curso.getAlumnos().get(1).getApellido());
           System.out.println(curso.getAlumnos().get(1).getAnio());
        
    }

    public Manualdelaguia() {
    }
}