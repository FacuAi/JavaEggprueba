/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoejercicioextra01;

import java.util.Scanner;

/**
 *
 * @author chuki
 */import java.util.Random;
import java.util.Scanner;

public class mesServicios {
    private String[] meses;
    private String mesSecreto;

    public mesServicios() {
        meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        mesSecreto = generarMesSecreto();
    }

    private String generarMesSecreto() {
        Random random = new Random();
        int indiceMesSecreto = random.nextInt(meses.length);
        System.out.println("el mes secreto: " + meses[indiceMesSecreto]);
        return meses[indiceMesSecreto];
    }

    public void jugar() {
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");

        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();

        while (!respuesta.equals(mesSecreto)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            respuesta = scanner.nextLine();
        }

        System.out.println("¡Ha acertado!");
    }
}
