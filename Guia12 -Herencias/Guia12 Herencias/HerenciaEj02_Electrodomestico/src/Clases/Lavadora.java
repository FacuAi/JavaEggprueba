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
// Subclase Lavadora que hereda de Electrodomestico
public class Lavadora extends Electrodomestico {
     Scanner scanner = new Scanner(System.in);
    // Atributo adicional de la clase Lavadora
    private double carga;

    // Constructor vacío
    public Lavadora() {
        // Llamar al constructor vacío de la clase padre (Electrodomestico)
        super();
        this.carga = 0;
    }

    // Constructor con la carga y el resto de los atributos heredados
    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        // Llamar al constructor de la clase padre (Electrodomestico)
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // Getter y setter del atributo carga
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    // Método para crear una lavadora
    public void crearLavadora() {
        // Llamar al método crearElectrodomestico() de la clase padre para llenar los atributos heredados
        crearElectrodomestico();

        // Solicitar información adicional al usuario y asignarla al atributo carga
        System.out.print("Ingrese la carga de la lavadora: ");
        double carga = scanner.nextDouble();
        setCarga(carga);

        //scanner.close();
    }

    // Metodo para imprimir la imagen del Lavarropas
    public void mostrarlavadora(){
        System.out.println("");
                    System.out.println("       ______________ ");
                    System.out.println("      |___|______O_O_|");
                    System.out.println("      |              |");
                    System.out.println("      |    ******    |");
                    System.out.println("      |    *    *    |");
                    System.out.println("      |    *    *    |");
                    System.out.println("      |    ******    |");
                    System.out.println("      |______________|");
                    System.out.println("                         ");
                    System.out.println("");
    }
    // Método para calcular el precio final de la lavadora
    @Override
    public double precioFinal() {
        // Calcular el precio final según la carga y aplicar las condiciones de la clase Electrodomestico
        double precioFinal = super.precioFinal();
        if (precioFinal == 0) {
            System.out.println("******************************");
            System.out.println("NO CARGO NINGUN LAVADORA");
            System.out.println("******************************");
        }
 
        if (carga > 30) {
            precioFinal += 500;
        }

        return precioFinal;
    }
}