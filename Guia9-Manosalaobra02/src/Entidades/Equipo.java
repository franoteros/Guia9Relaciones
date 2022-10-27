
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Franoteros
 */
public class Equipo {
    
    private ArrayList<Jugador> listaJugad;
    private String nomEquip;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> listaJugad, String nomEquip) {
        this.listaJugad = listaJugad;
        this.nomEquip = nomEquip;
    }

    public ArrayList<Jugador> getListaJugad() {
        return listaJugad;
    }

    public void setListaJugad(ArrayList<Jugador> listaJugad) {
        this.listaJugad = listaJugad;
    }

    public String getNomEquip() {
        return nomEquip;
    }

    public void setNomEquip(String nomEquip) {
        this.nomEquip = nomEquip;
    }

    @Override
    public String toString() {
        return "Equipo{" + " Nombre Equipo = " + nomEquip + ", Jugadores = " + listaJugad + '}';
    }
    
    

}
