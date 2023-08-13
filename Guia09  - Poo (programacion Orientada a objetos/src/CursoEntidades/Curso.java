/*
 *Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar
 * la información de cada curso. Para ello, crearemos una clase entidad llamada Curso,
 * cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos.
 * Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno.
 */
package CursoEntidades;

/**A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.

 *
 * @author chuki
 */
public class Curso {
    
    private String nombreCurso;
    private int CantidadHorasporDia;
    private int CantidadDiasPorSemana;
    private String turno;
    private int PrecioPorHora;
    private String[] alumnos; 

    
    public Curso() {
    }

    public Curso(String nombreCurso, int CantidadHorasporDia, int CantidadDiasPorSemana, String turno, int PrecioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.CantidadHorasporDia = CantidadHorasporDia;
        this.CantidadDiasPorSemana = CantidadDiasPorSemana;
        this.turno = turno;
        this.PrecioPorHora = PrecioPorHora;
        this.alumnos = alumnos;
    }

    
    
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasporDia() {
        return CantidadHorasporDia;
    }

    public void setCantidadHorasporDia(int CantidadHorasporDia) {
        this.CantidadHorasporDia = CantidadHorasporDia;
    }

    public int getCantidadDiasPorSemana() {
        return CantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int CantidadDiasPorSemana) {
        this.CantidadDiasPorSemana = CantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return PrecioPorHora;
    }

    public void setPrecioPorHora(int PrecioPorHora) {
        this.PrecioPorHora = PrecioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", CantidadHorasporDia=" + CantidadHorasporDia + ", CantidadDiasPorSemana=" + CantidadDiasPorSemana + ", turno=" + turno + ", PrecioPorHora=" + PrecioPorHora + ", alumnos=" + alumnos + '}';
    }
  

    
    
}
