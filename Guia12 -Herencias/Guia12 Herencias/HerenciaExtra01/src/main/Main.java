package main;
import Entidad.Alquiler;
import Entidad.BarcoMotor;

import Entidad.Velero;
import Entidad.Yate;
import java.time.LocalDate;
import java.util.*;
/**
 *
 * @author chuki
 */
public class Main {

    public static void Main(String[] args) {
     Scanner leer = new Scanner(System.in);
 
  LocalDate fechaAlquiler = LocalDate.of(2023, 2, 1);
        LocalDate fechaDevolucion = LocalDate.of(2023, 6, 28);
        
        Velero velero = new Velero("Facu123", 12.5, 2015, 3);
        BarcoMotor barcoMotor = new BarcoMotor("Max456", 10.2, 2018, 150);
        Yate yate = new Yate("Tripa789", 15.0, 2020, 300, 4);

        Alquiler alquilerVelero = new Alquiler("Juan", "12345678", fechaAlquiler, fechaDevolucion, 1, velero);
        Alquiler alquilerBarcoMotor = new Alquiler("Pedro", "87654321", fechaAlquiler, fechaDevolucion, 2, barcoMotor);
        Alquiler alquilerYate = new Alquiler("María", "56789012", fechaAlquiler, fechaDevolucion, 3, yate);

        System.out.println("Precio final del alquiler del velero: " + alquilerVelero.CalcularPrecioFinal());
        System.out.println("Precio final del alquiler del barco a motor: " + alquilerBarcoMotor.CalcularPrecioFinal());
        System.out.println("Precio final del alquiler del yate: " + alquilerYate.CalcularPrecioFinal());
    }
}
       



