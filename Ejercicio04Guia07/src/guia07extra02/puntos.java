/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia07extra02;

import java.util.Scanner;

/**
 *
 * @author chuki
 */
public class puntos {
        Scanner leer = new Scanner(System.in);
private int x1, y1, x2, y2;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
   public void crearPuntos(){
        System.out.println("Ingrese los 2 primeros puntos x1 , y1");
        this.x1=leer.nextInt();
        this.y1=leer.nextInt();
        System.out.println("Ingrese los 2 segundos de numeros  puntos " + x1 + "--" +y1 + " primer ingreso de puntos" );
        this.x2=leer.nextInt();
        this.y2=leer.nextInt();
    }
    public void calcularDistancia(){
   // d(P1,p2)=√(x2−x1)^2+(y2−y1)^2}
      int distancia = (int) Math.sqrt(Math.pow(this.x2-this.x1, 2) + Math.pow(this.y2-this.y1, 2));
        System.out.println("La distancia entre los puntos es: " + distancia);
     
    }
}

