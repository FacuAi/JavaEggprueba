/*
 * 4) Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
    Crea un constructor para inicializar los valores de las propiedades.
    Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual" si aún no se ha alcanzado el "maximoPisos".
    Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" si no se ha alcanzado el piso "0".
    Crea un método "irA" que reciba como parámetro el número de piso al que se desea ir y que modifique la propiedad "pisoActual" para que tenga ese valor.
    Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. Simula el comportamiento del ascensor moviéndolo hacia arriba y hacia abajo, yendo a un piso específico, y mostrando en pantalla el piso actual después de cada movimiento.
**
 */
package Guia07extra10;

/**
 *
 * @author chuki
 */
public class ascensor {
    
  private int pisoActual;
    private final int maximoPisos;

    public ascensor(int maximoPisos) {
        this.pisoActual = 0;
        this.maximoPisos = maximoPisos;
    }

    public int getPisoActual() {
        return this.pisoActual;
    }

    public void subir() {
        if (this.pisoActual < this.maximoPisos) {
            this.pisoActual++;
        }
    }

    public void bajar() {
        if (pisoActual > -2) {
            pisoActual--;
        }
    }

    public void irA(int piso) {
        if (piso >= 0 && piso <= this.maximoPisos) {
            this.pisoActual = piso;
        }
    }
}