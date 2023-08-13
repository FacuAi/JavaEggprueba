/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej02_electrodomestico;

import Clases.Electrodomestico;
import Clases.Lavadora;
import Clases.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class HerenciaEj02_Electrodomestico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        ArrayList<Electrodomestico> listaelectros = new ArrayList();
        // Creo el ArrayList 

        //Televisor televisor = new Televisor();
        int opcion = 0;

        while (opcion != 5) {
            // Crear una lavadora y un televisor
            Televisor televisor = new Televisor();
            Lavadora lavadora = new Lavadora();
            System.out.println("--------- Menú ---------1");
            System.out.println("1. Crear Lavadora");
            System.out.println("2. Crear Televisor");
            System.out.println("3. Suma de Precios Finales");
            System.out.println("4. Ver productos cargados");
            System.out.println("5. Salir");
            System.out.println("-------------------------");
            System.out.print("Ingrese una opción: ");
            opcion = Leer.nextInt();

            switch (opcion) {
                case 1: // Llamar a los métodos necesarios para llenar los electrodomésticos
                    System.out.println("");
                    System.out.println(" **** CREANDO LAVADORA ****");
                    lavadora.mostrarlavadora();
                    lavadora.crearLavadora();
                    lavadora.setPrecio(lavadora.precioFinal());
                    listaelectros.add(lavadora);
                    mostrarArray(listaelectros);
                    break;
                case 2:        // Llamar a los métodos necesarios para llenar los electrodomésticos
                    System.out.println("");
                    System.out.println(" **** CREANDO TELEVISOR ****");
                    // Televisor tele = new Televisor();
                    televisor.mostrartelevisor();  // UN DIbujo
                    televisor.crearTelevisor(); // Metodo dentro de la entidad Televisor
                    televisor.setPrecio(televisor.precioFinal());
                    listaelectros.add(televisor);
                    mostrarArray(listaelectros);

                    break;
                /*case 3:  // Mostrar el precio final de los electrodomésticos
                    System.out.println("");
                    System.out.println(" **** PRECIO FINAL LAVADORA ****");
                    System.out.println("");
                    System.out.println("Precio final de la lavadora: $" + lavadora.precioFinal());
                    System.out.println("Viene en Color: " + lavadora.getColor() + " y de categoria Energetica: " + lavadora.getConsumoEnergetico());
                    lavadora.mostrarlavadora();
                    break;
                case 4:   // Mostrar el precio final de los electrodomésticos
                    System.out.println("");
                    System.out.println(" **** PRECIO FINAL TELEVISOR ****");
                    System.out.println("");
                    System.out.println("Precio final del televisor: $" + televisor.precioFinal());
                    System.out.println("Viene en Color: " + televisor.getColor() + " y de categoria Energetica: " + televisor.getConsumoEnergetico());
                    televisor.mostrartelevisor();
                    break;*/
                case 3:
                    // mostrar el array list con todo los preciofinal

                    double total = 0;
                    for (Electrodomestico listaelectro : listaelectros) {
                        total = total + listaelectro.precioFinal();

                    }
                    System.out.println(" LA SUMA DE TODOS LOS ELCTRODOMESTRICOS ES: " + total);
                    break;
                case 4:
                    // ver lista de productos cargados
                    mostrarArray(listaelectros);
                    break;
                case 5:
                    System.out.println("Saliendo....Gracias");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println();
        }

    }

    public static void mostrarArray(ArrayList<Electrodomestico> listaelectros) {

        for (Electrodomestico listaelectro : listaelectros) {
            System.out.println(listaelectro);
        }
    }
}
