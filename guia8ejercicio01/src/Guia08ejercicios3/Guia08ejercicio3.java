package Guia08ejercicios3;

import java.util.*;
import personaEntidades.Persona;
import PersonaServicios.PersonaServicio;

/*
*
 * @author chuki
 */

// Instanciamos el servicio (creamos el servicio en el main)
/*
 * @author chuki
 */
// Instanciamos el servicio (creamos el servicio en el main)
public class Guia08ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonaServicio n1 = new PersonaServicio();

        // Creamos un array para almacenar los atributos de persona (array de tipo objeto)
        int cantidad = 2;
        int imc = 0;
        Persona p1[] = new Persona[cantidad];
        // Creamos un bucle for para asignar el valor a cada array
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1));
            p1[i] = n1.crearPersona();
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println(p1[i]);

        }
        System.out.println(" ");
        for (int i = 0; i < cantidad; i++) {
            if (n1.esMayorDeEdad(p1[i])) {
                System.out.println("La persona " + (i + 1) + " Es mayor de edad");
            } else {
                System.out.println("La persona " + (i + 1) + " Es menor de edad");
            }
            imc = n1.calcularPeso(p1[i]);

            switch (imc) {
                case -1:
                    System.out.println("Esta bajo de su peso ideal ");
                    System.out.println(" ──────────██──────────██──────────\n" +
"──────────██──────────██──────────\n" +
"──────────████▓▓▓▓▓▓████──────────\n" +
"──────────████▓▓▓▓▓▓████──────────\n" +
"──────────██▓▓▓▓▓▓▓▓▓▓██──────────\n" +
"──────────██████▓▓██████──────────\n" +
"──────────██▓▓▓▓▓▓▓▓▓▓██──────────\n" +
"──────────██▒▒▒▒▓▓▒▒▒▒██──────────\n" +
"──────▓▓▓▓██░░░░▒▒░░░░██▓▓▓▓──────\n" +
"────▓▓████████░░░░░░████████▓▓────\n" +
"──▓▓████▒▒▒▒██████████▒▒▒▒████▓▓──\n" +
"▓▓████▒▒░░░░▒▒██████▒▒░░░░▒▒████▓▓\n" +
"▓▓██▒▒░░░░░░░░▒▒▒▒▒▒░░░░░░░░▒▒██▓▓\n" +
"▓▓██░░░░░░░░░░██░░██░░░░░░░░░░██▓▓\n" +
"▓▓██░░░░▒▒░░██████████░░▒▒░░░░██▓▓\n" +
"▓▓██░░▒▒██▒▒░░░░██░░░░▒▒██▒▒░░██▓▓\n" +
"▓▓██░░▒▒██▒▒░░░░░░░░░░▒▒██▒▒░░██▓▓\n" +
"▓▓██░░▒▒██▒▒░░░░░░░░░░▒▒██▒▒░░██▓▓\n" +
"▓▓██▓▓▓▓██▐▌▐▌▐▌▐▌▐▌▐▌▐▌██▓▓▓▓██▓▓\n" +
"▓▓██▓▓▓▓██▐▌▐▌▐▌▐▌▐▌▐▌▐▌██▓▓▓▓██▓▓\n" +
"▓▓██▓▓▓▓██████████████████▓▓▓▓██▓▓\n" +
"▓▓██▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██▓▓\n" +
"▓▓██▓▓▓▓██░░░░▓▓▓▓▓▓░░░░██▓▓▓▓██▓▓\n" +
"▓▓██▓▓▓▓██░░░░▒▒██▒▒░░░░██▓▓▓▓██▓▓\n" +
"▓▓████████░░░░▒▒██▒▒░░░░████████▓▓\n" +
"▓▓████████░░░░▒▒██▒▒░░░░████████▓▓\n" +
"▓▓██████████░░▒▒██▒▒░░██████████▓▓\n" +
"▓▓██████████▓▓▒▒██▒▒▓▓██████████▓▓\n" +
"▓▓██──██████▓▓██████▓▓██████──██▓▓\n" +
"▓▓──────██──▓▓██████▓▓──██──────▓▓\n" +
"────────────▓▓██░░██▓▓────────────\n" +
"────────▓▓▓▓▓▓██░░██▓▓▓▓▓▓────────\n" +
"──────██████████░░██████████──────");
                    break;
                case 0:
                    System.out.println("Esta en su peso ideal ");
                    System.out.println("0\n" +
                                       "/|\n" +
                                      "/ |\n" +
                                     "/  |\n" +
                                      "| |");
                    break;
                case 1:
                    System.out.println("Esta por encima de su peso ideal");
                    System.out.println(" O \n"
                                   + "/(-|-)\\\n"
                                   + "/( | )\n"
                                     + "   \n"
                                    +  "/ \\");
            }

        }

    }

}

//public class Persona {
//
//   
//   
//       
//         // Instanciamos el servicio (creamos el servicio en el main)
//        PersonaServicio n1 = new PersonaServicio();
//
//        // Creamos un array para almacenar los atributos de persona (array de tipo objeto)
//        int cantidad = 2;
//        int imc = 0;
//        Persona p1[] = new Persona[cantidad];
//        // Creamos un bucle for para asignar el valor a cada array
//        for (int i = 0; i < cantidad; i++) {
//            System.out.println("Ingrese los datos de la persona " + (i + 1));
//            p1[i] = n1.crearPersona();
//        }
//        for (int i = 0; i < cantidad; i++) {
//            System.out.println(p1[i]);
//            
//        }
//        System.out.println(" ");
//       for (int i = 0 ; i < cantidad; i++){
//           if(n1.esMayorDeEdad(p1[i])){
//           System.out.println("La persona " + (i+1) + " Es mayor de edad" );
//           }else{
//               System.out.println("La persona " + (i+1) + " Es menor de edad");
//           }
//                 imc=n1.calcularPeso(p1[i]);
//                
//           
//           switch (imc) {
//               case -1:
//                   System.out.println("Esta bajo de su peso ideal ");
//                   System.out.println("");
//                   break;
//               case 0:
//                   System.out.println("Esta en su peso ideal ");
//                   break;
//               case 1:
//                   System.out.println("Esta por encima de su peso ideal");
//           }
//         
//       }
//   
//       }
//       
//    }
//         
//         
//         
//         
////
//        // Crear 4 objetos de tipo Persona con distintos valores
//        personapp persona1 = new personapp();
//        System.out.println("Ingrese el nombre de la primera persona:");
//        persona1.setNombre(scanner.nextLine());
//        System.out.println("Ingrese la edad de " + persona1.getEdad() + ":");
//        persona1.setEdad(scanner.nextInt());
//        System.out.println("Ingrese el sexo de " + persona1.getSexo() + " (H, M, O):");
//        persona1.setSexo(scanner.next().charAt(0));
//        System.out.println("Ingrese el peso de " + persona1.getPeso() + " en kg:");
//        persona1.setPeso(scanner.nextDouble());
//        System.out.println("Ingrese la altura de " + persona1.getAltura() + " en m:");
//        persona1.setAltura(scanner.nextDouble());
//
//        scanner.nextLine();
//
//        personapp persona2 = new personapp();
//        System.out.println("\nIngrese el nombre de la segunda persona:");
//        persona2.setNombre(scanner.nextLine());
//        System.out.println("Ingrese la edad de " + persona2.getEdad() + ":");
//        persona2.setEdad(scanner.nextInt());
//        System.out.println("Ingrese el sexo de " + persona2.getSexo() + " (H, M, O):");
//        persona2.setSexo(scanner.next().charAt(0));
//        System.out.println("Ingrese el peso de " + persona2.getPeso() + " en kg:");
//        persona2.setPeso(scanner.nextDouble());
//        System.out.println("Ingrese la altura de " + persona2.getAltura() + " en m:");
//        persona2.setAltura(scanner.nextDouble());
//
//        scanner.nextLine();
//
//        personapp persona3 = new personapp();
//        System.out.println("\nIngrese el nombre de la tercera persona:");
//        persona3.setNombre(scanner.nextLine());
//        System.out.println("Ingrese la edad de " + persona3.getEdad() + ":");
//        persona3.setEdad(scanner.nextInt());
//        System.out.println("Ingrese el sexo de " + persona3.getSexo() + " (H, M, O):");
//        persona3.setSexo(scanner.next().charAt(0));
//        System.out.println("Ingrese el peso de " + persona3.getPeso() + " en kg:");
//        persona3.setPeso(scanner.nextDouble());
//        System.out.println("Ingrese la altura de " + persona3.getAltura() + " en m:");
//        persona3.setAltura(scanner.nextDouble());
//
//        scanner.nextLine();
//
//        personapp persona4 = new personapp();
//        System.out.println("\nIngrese el nombre de la cuarta persona:");
//        persona4.setNombre(scanner.nextLine());
//        System.out.println("Ingrese la edad de " + persona4.getEdad() + ":");
//        persona4.setEdad(scanner.nextInt());
//        System.out.println("Ingrese el sexo de " + persona4.getSexo() + " (H, M, O):");
//        persona4.setSexo(scanner.next().charAt(0));
//        System.out.println("Ingrese el peso de " + persona4.getPeso() + " en kg:");
//        persona4.setPeso(scanner.nextDouble());
//        System.out.println("Ingrese la altura de " + persona4.getAltura() + " en m:");
//        persona4.setAltura(scanner.nextDouble());
//
//        System.out.println("mostrar los calculos"+"\n"
//        +"persona1 datos" + persona1 +"\n"
//         +" persona2 datos "  + persona2 +"\n"      
//         +"persona3 datos" + persona3 +"\n"
//         +" persona4 datos "  + persona4 +"\n"
//                );   
//        
//        
//    }
//    
//    }
//    System.out.println("Ingrese el nombre de la persona: ");
//    String nombre = leer.nextLine();
//
//System.out.println("Ingrese la edad de la persona: ");
//int edad = leer.nextInt();
//
//System.out.println("Ingrese el sexo de la persona (H/M): ");
//char sexo = leer.next().charAt(0);
//
//System.out.println("Ingrese el peso de la persona en kg: ");
//double peso = leer.nextDouble();
//
//System.out.println("Ingrese la altura de la persona en metros: ");
//double altura = leer.nextDouble();
//
//  personaServicios personaServicio = new personaServicios();
//          personapp ps = new personapp();
//        // Crear 4 objetos de tipo Persona con distintos valores
//        personapp persona1 = new personapp(ps.getNombre(), ps.getEdad(), ps.getSexo(), ps.getPeso(),ps.getAltura());
//        ps.persona1 = leer.nextInt(); 
//        System.out.println("ingresar los datos de persona : "+ ps.persona1);
//        personapp persona2 = new personapp(ps.getNombre(), ps.getEdad(), ps.getSexo(), ps.getPeso(),ps.getAltura());
//        ps.persona2 = leer.nextInt(); 
//           System.out.println("ingresar los datos de persona : "+ ps.persona2);
//        personapp persona3 = new personapp(ps.getNombre(), ps.getEdad(), ps.getSexo(), ps.getPeso(),ps.getAltura());
//        ps.persona3 = leer.nextInt(); 
//           System.out.println("ingresar los datos de persona : "+ ps.persona3);
//        personapp persona4 = new personapp(ps.getNombre(), ps.getEdad(), ps.getSexo(), ps.getPeso(),ps.getAltura());
//        ps.persona4 = leer.nextInt(); 
//           System.out.println("ingresar los datos de persona : "+ ps.persona4);
//        // Llamar los métodos para cada objeto
//        personaServicio.mostrarInfoPersona(persona1);
//        personaServicio.mostrarInfoPersona(persona2);
//        personaServicio.mostrarInfoPersona(persona3);
//        personaServicio.mostrarInfoPersona(persona4);
//        
//        // Guardar los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays)
//        double[] imcArray = {personaServicio.calcularIMC(persona1), personaServicio.calcularIMC(persona2), personaServicio.calcularIMC(persona3), personaServicio.calcularIMC(persona4)};
//        boolean[] esMayorArray = {personaServicio.esMayorDeEdad(persona1), personaServicio.esMayorDeEdad(persona2), personaServicio.esMayorDeEdad(persona3), personaServicio.esMayorDeEdad(persona4)};
//        
//        // Calcular un porcentaje de cuantas personas están por debajo de su peso, cuantas en su peso ideal y cuantas por encima
//        int porDebajo = 0, pesoIdeal = 0, porEncima = 0;
//        for (double imc : imcArray) {
//            if (porDebajo < 20) {
//                porDebajo++;
//            } else if (imc == 0) {
//                pesoIdeal++;
//            } else if (imc == 1) {
//                porEncima++;
//            }
//        }
//        double porcentajeDebajo = (porDebajo * 100.0) / imcArray.length;
//        double porcentajeIdeal = (pesoIdeal * 100.0) / imcArray.length;
//        double porcentajeEncima = (porEncima * 100.0) / imcArray.length;
//        
//        // Calcular un porcentaje de cuantos son mayores de edad y cuantos menores
//        int mayores = 0, menores = 0;
//        for (boolean esMayor : esMayorArray) {
//            if (esMayor) {
//                mayores++;
//            } else {
//                menores++;
//            }
//        }
//        double porcentajeMayores = (mayores * 100.0) / esMayorArray.length;
//        double porcentajeMenores = (menores * 100.0) / esMayorArray.length;
//        
//        // Imprimir resultados
//        System.out.println("\nResultados:");
//        System.out.println("Porcentaje de personas por debajo de su peso ideal: " + porcentajeDebajo + "%");
//        System.out.println("Porcentaje de personas en su peso ideal: " + porcentajeIdeal + "%");
//        System.out.println("Porcentaje de personas por encima de su peso ideal: " + porcentajeEncima + "%");
//        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayores + "%");
//            String porcentajeMenoresEdad = null;
//        System.out.println("Porcentaje de personas menores de edad: "+ porcentajeMenoresEdad + "%");
//    }
//
//
//    }
//}
