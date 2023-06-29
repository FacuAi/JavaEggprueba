/*
 * Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
* Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, 
* solicitando en cada repetición que se ingrese el nombre de cada alumno.
* 
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y
* después se le asignan a sus respectivos atributos para llenar el objeto Curso.En este método 
* invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
* Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la canti
 */
package CursoServicios;
import java.util.Scanner;
import CursoEntidades.Curso;
/**
 *
 * @author chuki
 */
public class CursoServicios {
    Curso c;
    private Scanner leer = new Scanner(System.in);
    
    public String[] CargarAlumnos(){
    String[] nombre = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del Alumno = " + (i+1));
            
            nombre[i] = leer.next();
        }
        return nombre; 
    }
    public Curso CrearCurso(){
        System.out.println("ingrese el nombre del curso: ");
        String nombreCurso =leer.next();
        System.out.println("ingrese el turno del curso: ");
        String turno = leer.next();
        System.out.println("ingrese la cantidad horas por dia que cursan");
        int CantidadHorasporDia = leer.nextInt();
        System.out.println("Ingrese los dias de la semana del curso: ");
        int CantidadDiasPorSemana =leer.nextInt();
        System.out.println("Ingrese el precio por hora del curso: ");
        int PrecioPorHora = leer.nextInt();
        
           
        return c = new Curso(nombreCurso,CantidadHorasporDia,CantidadDiasPorSemana, turno, PrecioPorHora, CargarAlumnos());
    }
    public int calcularGananciasSemanal(){
    return (c.getCantidadHorasporDia()*c.getPrecioPorHora()*5*c.getCantidadDiasPorSemana());
    }
}
