/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.util.Scanner;

/**
 *   **
     * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
     * privado base y un atributo privado altura. 
     * La clase incluirá un método para crear el rectángulo con los datos del 
     * Rectángulo dados por el usuario. 
     * También incluirá un método para calcular la superficie del rectángulo y 
     * un método para calcular el perímetro del rectángulo.
     * Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando 
     * la base y la altura. Se deberán además definir los métodos getters, setters y 
     * constructores correspondientes.
      Superficie = base * altura / Perímetro = (base + altura) * 2.
     *
 * @author chuki
 */
public class Rectangulo {
        private int base;
    private int altura;
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase() {
        return base;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int calcularSuperficie() {
        return base * altura;
    }
    
    public int calcularPerimetro() {
        return 2 * (base + altura);
    }
    
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    
}

    

//    private int base;
//    private int altura;
//
//    public Rectangulo(int base, int altura) {
//        this.base = base;
//        this.altura = altura;
//    }
//
//    public Rectangulo() {
//       
//    }
//
//    public int getBase() {
//        return base;
//    }
//
//    public void setBase(int base) {
//        this.base = base;
//    }
//
//    public int getAltura() {
//        return altura;
//    }
//
//    public void setAltura(int altura) {
//        this.altura = altura;
//    }
//    public void crearRectangulo(){
//    Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese la base del rectangulo:"); 
//        this.base=leer.nextInt();
//        System.out.println("Ingrese la altura del rectangulo: ");
//        this.altura= leer.nextInt();
//    }
//    public void perimetro(){
//    int Perimetro = (this.base+ this.altura)*2;
//        System.out.println("el perimetro es: " + Perimetro);
//    }
//    public void dibujar(){
//        for (int i = 0; i < this.altura; i++) {
//            for (int j = 0; j < this.base; j++) {
//                if (i==0|| i== this.altura-1||j==0||j==this.base-1) {
//                    System.out.println("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
//    }
//
//    public void superficie() {
//       
//    }
//  
//    }
//
