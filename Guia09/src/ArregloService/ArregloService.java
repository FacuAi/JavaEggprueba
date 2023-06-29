/*
 * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
 * Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B..
 */
package ArregloService;

import java.util.Arrays;

/**
 *
 * @author chuki
 */
public class ArregloService {
    
//     public void inicializarA(double[] arreglo) {
//        for (int i = 0; i < arreglo.length; i++) {
//            arreglo[i] = (int) (Math.random() * 100);
//        }
//    }
//
//    public void mostrar(double[] arreglo) {
//        for (int i = 0; i < arreglo.length; i++) {
//            System.out.println(arreglo[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public void ordenar(double[] arreglo) {
//        Arrays.sort(arreglo);
//    }
//
//    public void inicializarB(double[] arregloA, double[] arregloB) {
////        for (int i = 0; i < 10; i++) {
////            arregloB[i] = arregloA[i];
//        System.arraycopy(arregloA, 0, arregloB, 0, 10);
//        Arrays.fill(arregloB,10, 20, 0.5);
//        }
//    }
//
public void inicilizarA(double[] arrayA) {
        for (int i = 0; i < 50; i++) {
            arrayA[i] = (double) (Math.random() * 100);

        }
    }

        public void mostrar(double [] array){
            System.out.println(Arrays.toString(array));
            
        }
//    public void mostrarA(double[] arrayA) {
//        System.out.println("Esto son los valores de A:");
//        for (int i = 0; i < 50; i++) {
//            System.out.println("[" + arrayA[i] + "]");
//        }
//    }
//
//    public void mostrarB(double[] arrayB) {
//        System.out.println("Esto son los valores de B:");
//        for (int i = 0; i < 20; i++) {
//            System.out.println("[" + arrayB[i] + "]");
//        }
//    }
    public void ordenar(double[] arrayA) {
        Arrays.sort(arrayA);

    }

    public void inicilizarB(double[] arrayA, double[] arrayB) {
//        for (int i = 0; i < 10; i++) {
//            arrayB[i] = arrayA[i];
//        }
//        for (int i = 10; i < 20; i++) {
//            arrayB[i] = 0.5;
//           
            System.arraycopy(arrayA, 0, arrayB, 0, 10);
            Arrays.fill(arrayB,10, 20, 0.5);
        }
    }