/*
        * Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
       Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
       Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     
        Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar 
        cuántas veces se repite el carácter en la frase, por ejemplo:
        Entrada: frase = "casa blanca". 
        Salida: El carácter 'a' se repite 4 veces.

       Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase
        con otra nueva frase ingresada por el usuario.

       Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva 
       frase ingresada por el usuario y mostrar la frase resultante.

       Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase,
        por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.

       Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y 
    devuelve verdadero si la contiene y falso si no.

 */
package CadenaServicios;

import Cadena.CadenaEntidades;
import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class CadenaServicios {

   
    
    Scanner leer = new Scanner(System.in);

    public CadenaEntidades CrearCadena() {
        String aux;
        System.out.println("Ingrese una frase: ");
        aux = leer.nextLine();
        CadenaEntidades c1;
        c1 = new CadenaEntidades(aux);
      
        return CrearCadena();
    }

    public int mostrarVocales(CadenaEntidades c1) {
        int aux = 0;
        for (int i = 0; i < c1.getLon(); i++) {
            switch (c1.getCad().toLowerCase().substring(i, i + 1)) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    aux++;
                    break;

            }
        }
        return aux;
    }

    public void invertirFrase(CadenaEntidades c1 ) {

        int aux = 0;
        for (int i = c1.getLon(); i > 0; i--) {

            System.out.print(c1.getCad().substring(i - 1, i));

        }
    }

    public void vecesRepetido(CadenaEntidades c1) {
        String letra;
        int c = 0 ;
        letra = leer.nextLine();
        for (int i = 0; i < c1.getLon(); i++) {
            if (letra.equals(c1.getCad().toLowerCase().substring(i, i + 1)));
            {
                c++;   
            }
        }
            System.out.println(" ! las veces que se repitio Letra!! : " + c);
    }

    public void compararLongitud(CadenaEntidades c1) {
        System.out.println("");
        String aux = leer.nextLine();

        switch (c1.getCad().compareTo(aux)) {
            case 0:
                System.out.println("las cadenas son iguales");
                break;
            case 1:
                System.out.println(" la primer cadena es mayor ");
                break;
            case -1:
                System.out.println(" la segunda cadena es mayor");
                break;
        }

    }

    public void unirFrases(CadenaEntidades c1) {
        System.out.println("ingrese una nueva frase");
        String aux1 = leer.nextLine();
        System.out.println(aux1.concat(c1.getCad()));
    }

    public CadenaEntidades Remplazar(CadenaEntidades c1) {
        System.out.println("ingrese un caracter para remplazar la letra A");
        String letra = leer.next();
        c1.getCad().replace("A", letra);
        c1.getCad().replace("a", letra);
        return c1;

    }

    public void contiene(CadenaEntidades c1) {
        String frase;
        boolean aux = false;
        System.out.println("\n"+"Ingrese un caracter");
        frase = leer.next();
        String toLowerCase = frase.toLowerCase();
        for (int i = 0; i < c1.getLon(); i++) {
            if (c1.getCad().substring(i, i + 1).equalsIgnoreCase(frase)) {
                aux = true;
                System.out.println(aux);
                break;
            }
        }
        if (!aux) {
            System.out.println(aux);
        }
    }

    public void mostrarVocales() {
    
    }

}
