/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author u180448
 */
// Superclase Electrodomestico
public class Electrodomestico {
    // Atributos de la clase Electrodomestico
    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    // Constructor vacío
    public Electrodomestico() {
        // Asignar valores por defecto a los atributos
        /*this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 1;*/
    }

    // Constructor con todos los atributos pasados por parámetro
    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    // Getters y setters de los atributos
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para comprobar el consumo energético
    private void comprobarConsumoEnergetico(char letra) {
        // Verificar si la letra está entre A y F, de lo contrario, se asigna 'F' por defecto
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    // Método para comprobar el color
    private void comprobarColor(String color) {
        // Convertir el color a minúsculas y compararlo con los colores disponibles
        color = color.toLowerCase();
        switch (color) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                this.color = color;
                break;
            default:
                this.color = "BLANCO"; // Si el color no es válido, se asigna "blanco" por defecto
                break;
        }
    }

    // Método para crear un electrodoméstico
    public void crearElectrodomestico() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario y asignarla a los atributos
        System.out.print("Ingrese el precio del electrodoméstico: ");
        double precio = scanner.nextDouble();
        setPrecio(precio);

        System.out.print("Ingrese el color del electrodoméstico: ");
        String color = scanner.next().toUpperCase();
        comprobarColor(color);

        System.out.print("Ingrese el consumo energético del electrodoméstico: (A-F) ");
        char consumo = scanner.next().toUpperCase().charAt(0);
        comprobarConsumoEnergetico(consumo);

        System.out.print("Ingrese el peso del electrodoméstico: ");
        double peso = scanner.nextDouble();
        setPeso(peso);

        //scanner.close();
    }

    // Método para calcular el precio final
    public double precioFinal() {
        // Calcular el precio final según el consumo energético y el peso
        double precioFinal = getPrecio();

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
        
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
}