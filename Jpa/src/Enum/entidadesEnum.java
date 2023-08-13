/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;



/**
 *
 * @author chuki
 */public enum entidadesEnum {
    LIBRO,      // Enumeration constant representing 'LIBRO'
    EDITORIAL,  // Enumeration constant representing 'EDITORIAL'
    AUTOR;      // Enumeration constant representing 'AUTOR'
    
    // Each enumeration constant is followed by optional additional methods or properties.

    public static entidadesEnum getLIBRO() {
        return LIBRO;
    }

    public static entidadesEnum getEDITORIAL() {
        return EDITORIAL;
    }

    public static entidadesEnum getAUTOR() {
        return AUTOR;
    }
}