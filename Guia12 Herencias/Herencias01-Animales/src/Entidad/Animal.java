/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author chuki
 */
public class Animal {
    protected String nombre, alimento,raza;
    protected Integer Edad;

    public Animal() {
    }

    public Animal(String nombre, String alimento, String raza, Integer Edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", raza=" + raza + ", Edad=" + Edad + '}';
    }
    public void Alimentar(){
        System.out.println(" El " + raza +" "+ nombre + " se alimenta de: " + alimento );
    }
}
