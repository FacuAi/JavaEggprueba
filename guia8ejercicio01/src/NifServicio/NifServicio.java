/*
 * IFService se dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. Una vez calculado
, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera: Para calcular 
la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe bu
 */
package NifServicio;

import NifEntidades.nifEntidades;
import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class NifServicio {

    public nifEntidades crearNif() {
        Scanner leer = new Scanner(System.in);
        nifEntidades nf = new nifEntidades();
        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        System.out.println("Ingrese el DNI");
        nf.setDni(leer.nextLong());
        int resto = (int) nf.getDni() % 23;
        System.out.println(resto);
        nf.setLetra(vector[resto]);
        return nf;
    }

    public void mostrar(nifEntidades nf) {
        System.out.println(nf.getDni() + "-" + nf.getLetra());

    }
}
