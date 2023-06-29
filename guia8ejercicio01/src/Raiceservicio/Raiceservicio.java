/*
 *RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double).
* El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra,
el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra,
el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́  true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́  true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.

 */
package Raiceservicio;

import Raices.Raices;
import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class Raiceservicio {

    private Scanner leer = new Scanner(System.in);

    public Raices CrearRaices() {
        Raices rs = new Raices();
        System.out.println("Ingrese el valor de A");
        rs.setA(leer.nextInt());
        System.out.println("Ingrese el valor de B");
        rs.setB(leer.nextInt());
        System.out.println("Ingrese el valor de C");
        rs.setC(leer.nextInt());
        return rs;
    }

    public double getDiscriminante(Raices rs) {
        return (Math.pow(rs.getB(), 2)) - 4 * rs.getA() * rs.getC();
        //(b^2)-4*a*c formula

    }

    public boolean tieneRaices(Raices rs) {
        return getDiscriminante(rs) > 0;
    }

    public boolean tieneRaiz(Raices rs) {
        return getDiscriminante(rs) == 0;
    }

    public void obtenerRaices(Raices rs) {
        if (tieneRaices(rs)) {
            double x1 = (-rs.getB() + Math.sqrt(getDiscriminante(rs)) / 2 * rs.getA());
            System.out.println("Mostrar solucion de Obtener Raices : " + x1);
            double x2 = (-rs.getB() - Math.sqrt(getDiscriminante(rs)) / 2 * rs.getA());
            System.out.println("Solucion Obtener Raices : " + x2);
        }
    }

    public void obtenerRaiz(Raices rs) {
        if (tieneRaiz(rs)) {
            double x1 = (-rs.getB() + Math.sqrt(getDiscriminante(rs)) / 2 * rs.getA());
            System.out.println("Mostrar solucion obtener Raiz: " + x1);
        }
    }

    public void calcular(Raices rs) {
        if (tieneRaices(rs)) {
            obtenerRaices(rs);
        } else if (tieneRaiz(rs)) {
            obtenerRaiz(rs);
        } else {
            System.out.println("!No existe posible solucion!\n Error" + "\u001B[40m");

        }
    }
}
