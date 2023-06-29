/*
 * Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar 
los siguientes métodos:

Método mostrarValores que muestra cuáles son los dos números guardados.

Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor

Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
Previamente se deben redondear ambos valores.

Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
package PardenumServicios;

import ParDenumEntidades.ParDeNumeros;

/**
 *
 * @author chuki
 */
public class ParDeNumerosService {

    public ParDeNumeros crear() {
        ParDeNumeros par1 = new ParDeNumeros();
        return par1;

    }

    public void mostrarValores(ParDeNumeros par1) {

        System.out.println(par1.getNum1() + "\t" + par1.getNum2());
    }

    public double devolverMayor(ParDeNumeros par1) {
        return Math.max(par1.getNum1(), par1.getNum2());
//        par1.getNum1();
//        par1.getNum2();
//        if (par1.getNum1() > par1.getNum2()) {
//
//            return par1.getNum1();
//
//        } else if (par1.getNum1() == par1.getNum2()) {
//            System.out.println("Error los numeros son iguales");
//            return 0;
//
//        } else {
//            return par1.getNum2();
    //}

    }

    public double calcularPotencia(ParDeNumeros par1) {//pow(double a, double b)//floor(double a)
//max(double a, double b)//min(double a, double b)
        double max = Math.max(par1.getNum1(), par1.getNum2());//Maximo
        double min = Math.min(par1.getNum1(), par1.getNum2());//minimo
        max = Math.floor(max);
        min = Math.floor(min);

        double Potencia = Math.pow(max, min);

        return Potencia;
    }

    public double calculaRaiz(ParDeNumeros par1){ //sqrt(double a)//abs(double a)
      double min = Math.min(par1.getNum1(), par1.getNum2());//minimo
      min = Math.abs(min);// Devuelve el entero del positivo (numero absoluto)
     
       return Math.sqrt(min); // devuelve la raiz Cuadrada!
    
    }
}
