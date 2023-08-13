/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1Servicios;

import Ejercicios01Entidades.Perro;
import Ejercicios01Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class E1Servicios {

  Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
  public Persona CrearPersona(){
    Persona a = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        a.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        a.setApellido(leer.next());
        // de la misma forma se ingresan los demas datos
        return a;
  }
  public Perro CrearPerro() {
        Perro b = new Perro();
        System.out.println("Ingrese el nombre del perro");
        b.setNombre(leer.next());
        System.out.println("Ingrese raza");
        b.setRaza(leer.next());
        // de la misma forma se ingresan los demas datos
        return b;
  }

  
}
