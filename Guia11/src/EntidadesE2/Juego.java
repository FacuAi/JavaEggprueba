/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesE2;



import EntidadesE2.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chuki
 */
public class Juego {
    private Revolver r;
    private List<Jugador> jugadores;

    public Juego() {
    }

    public Juego(Revolver r, List<Jugador> jugadores) {
        this.r = r;
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    //Metodo
    
         public void llenarJuego(ArrayList<Jugador>js2,Revolver r2){
        jugadores=js2;
        r=r2;
    
    }
    
    
    public boolean ronda(int i){
    boolean juegoSigue = true;
    jugadores.get(i).disparo(r);
    if (jugadores.get(i).isMojado()) {
            juegoSigue=false;
        }
        return juegoSigue;
    }

    @Override
    public String toString() {
        return "juego{" + "r=" + r + ", jugadores=" + jugadores + '}';
    }

  //  public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
    }

    


    
    

