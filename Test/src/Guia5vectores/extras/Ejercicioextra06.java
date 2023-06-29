package Guia5vectores.extras;
import java.util.*;
/**
 *
 * @author chuki
 */
public class Ejercicioextra06 {

   
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in); 
  boolean verificador=false;
        
        String palabra = "GATOS";
        int longitud = 0,longitudprim=0, m = 0;
        String[] vector = new String[5];
       int[] repetidos = new int[5];
             // vector[0]= "PER";
            //  vector[1]= "GATS";
             // vector[2]= "VAS";
            //  vector[3]= "AUT";
            //  vector[4]= "TNE";
        String[][] matriz = new String[20][20];
        int ip = 0, jp = 0,a=0; //lleno con espacios

        llenarmatriz(matriz);
       

                                                                                        // caragar las 5 palabras a un vector
       do {
            System.out.println("ingrese palabra de entre 3 y 5 caracteres");
            palabra = leer.next();
            longitud = palabra.length();
            if ((longitud >= 3) && (longitud <= 5)) {
                vector[m] = palabra;
                System.out.println(m);
                m++;
            } else {
                System.out.println("sos tonto vo? de 3 a 5 caracteres debe ser");
            }
        } while ((m != 5));
        for (int i = 0; i < 5; i++) {
            System.out.println(vector[i]);
        }

        //posiciones aleatorias
        for (int i = 0; i < 5; i++) {
            repetidos[i] = (int) (Math.random() * 20);
            for (int j = 0; j < i; j++) {
                if (repetidos[i] == repetidos[j]) {
                    i--;
                }
            }
        }

        // llenar matriz
        for (int i = 0; i <(5); i++) {
            longitudprim=vector[i].length();
            
            switch(longitudprim){
                case 3:
                        a=2;break;
                case 4:
                    a=1;break;
                case 5:
                    a=0;break;
            }
          
            jp = (int) (Math.random() *(16+(a)));
            System.out.println(jp);
          ip= repetidos[i];
           
            for (int j = 0; j < (5-a); j++) {
                matriz[(ip)][(jp+j)] = vector[i].substring((j), (j + 1));
        }
      }
          llenarmatrizceros(matriz);
        //verificadores
       // System.out.println("-----------");
       // System.out.println(ip);
      //  System.out.println(jp);
        
   imprimematriz(matriz);

 //verificadores
  for(int i= 0; i <5; i++) {
       System.out.println(repetidos[i]);
}

    }
    public static void llenarmatrizceros(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if((matriz[i][j]).equals(" ")){
               (matriz[i][j])=Integer.toString((int)(Math.random()*10));
            }
            }
        }
    }
    
    public static void llenarmatriz(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = " ";
            }
        }
    }

    public static void imprimematriz(String[][] matriz) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[ " + matriz[i][j] + " ] ");
            }
            System.out.println(" ");
        }
    }
    
}
  
   


