/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadena;

/**
 *
 * @author chuki
 */
public class CadenaEntidades {
    
    private String cad;
    private int lon;

    public CadenaEntidades() {
    }

    public CadenaEntidades(String cad) {
        this.cad = cad;
        this.lon = this.cad.length();
    }

    public String getCad() {
        return cad;
    }

    @Override
    public String toString() {
        return "CadenaEntidades{" + "cad=" + cad + ", lon=" + lon + '}';
    }

    public void setCad(String cad) {
        this.cad = cad;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }
    
}
