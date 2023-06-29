package Guia5vectores.extras;
import java.text.DecimalFormat;
import java.util.*;
/**Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas 
por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 *
 * @author chuki
 */
public class EjercicioExtra04 {

//   
//    public static void main(String[] args) {
//     Scanner leer = new Scanner(System.in);
//        DecimalFormat df = new DecimalFormat("#.00");
//        double[][] matriz = new double[11][6];
//        String[] vectornotas = new String[5];
//        vectornotas[0] = "";
//        vectornotas[1] = "1° trabajo practico";
//        vectornotas[2] = "2° trabajo practico";
//        vectornotas[3] = "1° integrador";
//        vectornotas[4] = "2° integrador";
//
//        //llena primer fila y columna
//        int k = 0, l = 0;
//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j < 6; j++) {
//                if (i == 0) {
//                    matriz[i][j] = k;
//                    k++;
//                }
//                if (j == 0) {
//                    matriz[i][j] = l;
//                    l++;
//                }
//            }
//        }
//        //llena con notas 
//
//        imprimematriz(matriz);
//
//        for (int i = 1; i < 11; i++) {
//            System.out.println("-----------------");
//            System.out.println(i + "° alumno:");
//            for (int j = 1; j < 5; j++) {
//                System.out.println("ingrese nota " + vectornotas[j]);
//                matriz[i][j] = leer.nextInt();
//            }
//        }
////pasa calificaciones segun %
//        for (int i = 1; i < 11; i++) {
//            for (int j = 1; j < 5; j++) {
//                if (j == 1) {
//                    matriz[i][j] = (matriz[i][j] * 10) / 100;
//                }
//                if (j == 2) {
//                    matriz[i][j] = (matriz[i][j] * 15) / 100;
//                }
//                if (j == 3) {
//                    matriz[i][j] = (matriz[i][j] * 25) / 100;
//                }
//                if (j == 4) {
//                    matriz[i][j] = (matriz[i][j] * 50) / 100;
//                }
//            }
//        }
//
//        //llena nota final
//        for (int i = 1; i < 11; i++) {
//            for (int j = 1; j < 5; j++) {
//                matriz[i][5] = matriz[i][5] + matriz[i][j];
//            }
//        }
//        imprimematriz(matriz);
//        //cuenta aprobados y desaprobados
//        int contaprobados = 0, contadesaprobados = 0;
//        for (int i = 1; i < 11; i++) {
//            if (matriz[i][5] >= 7) {
//                contaprobados++;
//            } else {
//                contadesaprobados++;
//            }
//        }
//        System.out.println("hay "+contaprobados+ " alumnos aprobados");
//         System.out.println("hay "+contadesaprobados+ " alumnos desaprobados");
//    }
//
//    private static void imprimematriz(double matriz[][]) {
//        DecimalFormat df = new DecimalFormat("#.00");
//        for (int i = 0; i < 11; i++) {
//            for (int j = 0; j < 6; j++) {
//                if ((matriz[i][j] < 1) && (matriz[i][j] >= 0)) {
//                    System.out.printf("[ " + df.format(matriz[i][j]) + " ]");
//                }
//                if ((matriz[i][j] < 10) && (matriz[i][j] >= 1)) {
//                    System.out.printf("[ " + df.format(matriz[i][j]) + "]");
//                }
//                if ((matriz[i][j] < 100) && (matriz[i][j] > 9)) {
//                    System.out.printf("[" + df.format(matriz[i][j]) + "]");
//                }
//            }
//            System.out.println(" ");

//      
    
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);// \ = alt + 92

        double[] vec = new double[5];
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < vec.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingresa la nota " + (j + 1) + " del alumno " + (i + 1));
                vec[i] += leer.nextDouble();
            }
            vec[i] /= 4;
            System.out.print("El promedio del alumno " + (i + 1) + " es de " + String.format("[%.3f]", vec[i]) + " ");
            if (vec[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);
    }

}


