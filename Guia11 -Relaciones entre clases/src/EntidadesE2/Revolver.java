/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesE2;

/**
 *
 * @author chuki
 */
public class Revolver {
    private Integer posicionActual;
    private Integer posicionAgua;

    public Revolver() {
    }

    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    //metodos
    
    public void llenarRevolver() {
        posicionActual = (int) (Math.random() * 6 );
        posicionAgua = (int) (Math.random() * 6 );
    }

    public boolean mojar(){
        boolean vof = false;
        if (posicionActual==posicionAgua) {
            vof=true;
        }
        return vof;
    }
    
    public void nextChorro(){
        if (posicionActual==6) {
            posicionActual=1;
        }else
            posicionActual++;
    }
    
    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }


}
