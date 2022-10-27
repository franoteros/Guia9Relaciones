
package guia9.manosalaobra02;

 //* @author Franoteros
import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;
import java.util.Scanner;


public class Guia9Manosalaobra02 {
    
    Scanner leer = new Scanner(System.in);
    

    public static void main(String[] args) {
        
        ArrayList<Jugador> listaJugad = new ArrayList();
        
        Jugador J1 = new Jugador();
        Jugador J2 = new Jugador();
        Jugador J3 = new Jugador();
        Jugador J4 = new Jugador();
        Jugador J5 = new Jugador();
        Equipo Eq1 = new Equipo();
        
        J1.setNombre("Beto");
        J1.setApellido("Marcico");
        J1.setPosicion("Enganche");
        J1.setNumero(10);
        J2.setNombre("Guille");
        J2.setApellido("Barros Schellotto");
        J2.setPosicion("Delantero");
        J2.setNumero(7);
        J3.setNombre("Pampa");
        J3.setApellido("Sosa");
        J3.setPosicion("Delantero");
        J3.setNumero(9);
        J4.setNombre("Topo");
        J4.setApellido("Sanguinetti");
        J4.setPosicion("Defensor");
        J4.setNumero(4);
        J5.setNombre("Enzo");
        J5.setApellido("Noce");
        J5.setPosicion("Arquero");
        J5.setNumero(1);
        
        listaJugad.add(J1);
        listaJugad.add(J2);
        listaJugad.add(J3);
        listaJugad.add(J4);
        listaJugad.add(J5);
        
        Eq1.setNomEquip("Gimnasia y Esgrima de La Plata");
        Eq1.setListaJugad(listaJugad);
        
        System.out.println(Eq1);
        
        System.out.println(Eq1.getNomEquip());
        
        for(Jugador aux : listaJugad){
            System.out.println(aux);
        }
        

        
        
        
        
    }

}
