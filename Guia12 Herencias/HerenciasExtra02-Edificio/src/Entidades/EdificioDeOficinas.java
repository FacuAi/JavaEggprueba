/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author chuki
 */
public class EdificioDeOficinas  extends Edificio{
private int numOficinas;
private int personasPorOficinas;
private int numPisos;

    public EdificioDeOficinas(int numOficinas, int personasPorOficinas, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasPorOficinas = personasPorOficinas;
        this.numPisos = numPisos;
    }
   // Implementación del método calcularSuperficie para EdificioDeOficinas
    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    // Implementación del método calcularVolumen para EdificioDeOficinas
    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }

    // Método para calcular la cantidad de personas en el edificio de oficinas
    public int cantPersonas() {
        return numOficinas * personasPorOficinas * numPisos;
    }
}

