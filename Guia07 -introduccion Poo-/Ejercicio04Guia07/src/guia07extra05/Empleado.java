/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario"
. Luego,
crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario 
actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o
del 5% si tiene menos de 30 años.

 */
package guia07extra05;

/**
 *
 * @author chuki
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void calcular_aumento() {
        double aumento;
        if (edad > 30) {
            aumento = salario * 0.1;
        } else {
            aumento = salario * 0.05;
        }
        salario += aumento;
        System.out.println(nombre + " ha recibido un aumento salarial de " + aumento + " y ahora su salario es " + salario);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getSalario() {
        return salario;
    }

    
}
