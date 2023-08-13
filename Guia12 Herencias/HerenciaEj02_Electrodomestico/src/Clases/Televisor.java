/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
// Subclase Televisor que hereda de Electrodomestico
public class Televisor extends Electrodomestico {
    // Atributos adicionales de la clase Televisor
    private int resolucion;
    private String sintonizadorTDT;

    // Constructor vacío
    public Televisor() {
        // Llamar al constructor vacío de la clase padre (Electrodomestico)
        super();
        this.resolucion = 0;
        //this.sintonizadorTDT = false;
    }

    // Constructor con la resolución, sintonizador TDT y el resto de los atributos heredados
    public Televisor(int resolucion, String sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        // Llamar al constructor de la clase padre (Electrodomestico)
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Getters y setters de los atributos resolución y sintonizador TDT
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public String isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(String sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Método para crear un televisor
    public void crearTelevisor() {
        
        // Llamar al método crearElectrodomestico() de la clase padre para llenar los atributos heredados
        crearElectrodomestico();

        Scanner scanner = new Scanner(System.in);
        

        // Solicitar información adicional al usuario y asignarla a los atributos resolución y sintonizador TDT
        System.out.print("Ingrese la resolución del televisor en pulgadas: ");
        int resolucion = scanner.nextInt();
        setResolucion(resolucion);

        System.out.print("¿Tiene sintonizador TDT incorporado? (Si/No): ");
        String sintonizadorTDT = scanner.next().toUpperCase();
        setSintonizadorTDT(sintonizadorTDT);
        
      
        //scanner.close();
    }
    
    public void mostrartelevisor(){
        System.out.println("");
                    System.out.println("               //   ");
                    System.out.println("       _______//________ ");
                    System.out.println("      |  ___________  O |");
                    System.out.println("      | |           | O |");
                    System.out.println("      | |           |   |");
                    System.out.println("      | |           |   |");
                    System.out.println("      | |___________|   |");
                    System.out.println("      |_________________|");
                    System.out.println("                    Puma");
                    System.out.println("");
    }
    

    // Método para calcular el precio final del televisor
    @Override
    public double precioFinal() {
        // Calcular el precio final según la resolución, sintonizador TDT y aplicar las condiciones de la clase Electrodomestico
        double precioFinal = super.precioFinal();
        
        if (precioFinal == 0) {
            System.out.println("******************************");
            System.out.println("NO CARGO NINGUN TELEVISOR");
            System.out.println("******************************");
        }

        if (resolucion > 40) {
            precioFinal += precioFinal * 0.3; // Incrementar el precio en un 30%
        }

        if (sintonizadorTDT == "SI") {
            precioFinal += 500;
        }

        return precioFinal;
    }
}