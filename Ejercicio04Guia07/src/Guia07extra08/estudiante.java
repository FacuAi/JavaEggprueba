/*
 * Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
    Crea un método para calcular la nota media de un grupo de estudiantes y 
*   otro para mostrar por pantalla los estudiantes que tienen una nota media superior.
 *
 */
package Guia07extra08;

/**
 *
 * @author chuki
 */

public class estudiante {
 private String nombre;
    private int edad;
    private double notaMedia;
    private double notaMediaGrupo;

    public estudiante(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
        
    }
public double getNotaMedia(){
    return notaMedia;
}    
public String getnombre(){
return nombre;
}

public void calcularNotaMedia(estudiante[] estudiante) {
double sumaNota = 0 ;
int cantidadEstudiantes=estudiante.length;
    for (int i = 0; i < cantidadEstudiantes; i++) {
        sumaNota += estudiante[i].getNotaMedia();
        
    }
    this.notaMediaGrupo = sumaNota/cantidadEstudiantes;

}
 
public  void mostrarEstudiantesmejornota(estudiante[] estudiante){
    calcularNotaMedia(estudiante);
    int cantidadEstudiantes = estudiante.length;
    for (int i = 0; i < cantidadEstudiantes; i++) {
    if(estudiante[i].getNotaMedia() > this.notaMediaGrupo) {
        System.out.println(estudiante[i].nombre + "-"+ estudiante[i].getNotaMedia());
    } 
    
    }
}
}