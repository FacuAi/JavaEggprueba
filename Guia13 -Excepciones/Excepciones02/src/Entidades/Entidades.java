/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author chuki
 */
public class Entidades {
    private int[] array;

    public Entidades() {
        array = new int[5]; // Crear un arreglo de tamaño 5
    }

    public void accessArrayElement(int index) {
        try {
            // Acceder al elemento del arreglo en el índice especificado
            int element = array[index];
            System.out.println("Elemento en el índice " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("¡Error: Índice de arreglo fuera de rango!");
        }
    }

}
