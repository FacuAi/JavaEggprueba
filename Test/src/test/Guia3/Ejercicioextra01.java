package test.Guia3;

import java.util.*;
import javax.swing.JOptionPane;
//@author chuki

public class Ejercicioextra01 {

//  /*Dado un tiempo en minutos, calcular su equivalente en días y horas.
//    Por ejemplo,
//    si el usuario ingresa 1600 minutos,el sistema debe calcular su equivalente: 1 día, 2 horas.
//  */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dias, minutos, contadorDias, ContadorHoras;
        System.out.println("ingrese la cantidad de minutos");
        minutos = leer.nextInt();
        contadorDias = 0;
        ContadorHoras = 0;
        do {
            if (minutos >= 1440) {
                minutos = minutos - 1440;
            }
            contadorDias++;
        } while (minutos >= 1440);
        do {
            if (minutos >= 60) {
                minutos = minutos - 60;
            }
            ContadorHoras++;
        } while (minutos >= 60);
        System.out.println("Dias " + contadorDias + "\n" + "Las horas son: " + ContadorHoras);
        
    }
}


//  int tiempo ,dias ,horas , minutos;
//        System.out.println("Ingrese el tiempo en minutos");
//        dias=0;
//        horas=0;
//        minutos=0;
//        
//        do {
//            tiempo=leer.nextInt();
//            if (tiempo>=1600) {
//                dias=dias+1;
//                tiempo=tiempo-1600;
//            }if(tiempo<=60){
//                horas=horas+2;
//                tiempo=tiempo-60;  
//            }else{
//            minutos=minutos+1;
//            tiempo=tiempo-1;
//            }
//             
//        } while (tiempo>0);
//        
//        System.out.println("Dias: " + dias + "\n" + "Horas: " + horas);
//    }
//}
//
//
//String tiempo = JOptionPane.showInputDialog("Ingrese el tiempo en minutos");
//int dias = 0;
//int horas = 0;
//int minutos = 0;
//   int t1 = Integer.parseInt(tiempo);
//do {
// if (t1 >= 1600){
//   dias=dias+1;   
//   t1 = t1 - 1600;
//}
// if (t1 <= 60) {
//          horas = horas + 2;
//           t1 = t1 - 60;  
//}
// else { minutos=minutos+1;
// t1 = t1 -1;
// }
//} while(t1>0); {
//         JOptionPane.showMessageDialog(null,"Los Dias fueron : " + dias + "\n" + "Las Horas: " + horas);
//         JOptionPane.showMessageDialog(null," ! Muchas Gracias! ");
//     
//     }
//     
//    }
//
//}

