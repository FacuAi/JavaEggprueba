/*
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). 
 * Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde. 
 */
package NifEntidades;

/**
 *
 * @author chuki
 */
public class nifEntidades {

    private long Dni;
    private String Letra;

    public nifEntidades() {
    }

    public nifEntidades(long Dni, String Letra) {
        this.Dni = Dni;
        this.Letra = Letra;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    @Override //contrusctor extra
    public String toString() {
        return "nifEntidades{" + "Dni =" + Dni + ", Letra =" + Letra + '}';
    }
}
