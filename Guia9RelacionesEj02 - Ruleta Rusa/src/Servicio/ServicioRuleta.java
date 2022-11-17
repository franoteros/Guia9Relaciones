
package Servicio;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioRuleta {
    
    Scanner leer = new Scanner(System.in);
    
    public Revolver crearRevolver(){
        Revolver R = new Revolver();
        return R;
    }
    
//    public Jugador crearJugador(){
//        Jugador J = new Jugador();
//        return J;
//    }
    
    public Juego crearJuego(){
        Juego P = new Juego();
        return P;
    }
    
    public void llenarJugador(Juego P){
        int j;
        
        ArrayList<Jugador> jugadores = new ArrayList();
        P.setJugadores(jugadores);
        System.out.println("Ingrese cantidad de jugadores");
        j = leer.nextInt();
        for(int i=1;i<j+1;i++){
            Jugador J = new Jugador();
            System.out.println("ID jugador numero " + i);
            J.setId(i);
            System.out.println("Nombre jugador numero " + i);
            J.setNombreJug("Jugador");
            jugadores.add(J);
        }
    }
    
    public void llenarRevolver(Revolver R){
        R.setPosAgua((int) Math.floor(Math.random()*(6-1+1)+1));
        R.setPosActual((int) Math.floor(Math.random()*(6-1+1)+1));
        
        if(R.getPosActual() == R.getPosAgua()){
            R.setPosActual(R.getPosActual()+1);
            if(R.getPosActual() == 7){
                R.setPosActual(R.getPosActual()-2);
            }
        }
               
//        System.out.println(R.getPosActual());
//        System.out.println(R.getPosAgua());
//        HashSet<Integer> tambor = new HashSet();
//        R.setPosAgua((int) Math.floor(Math.random()*6));
//        tambor.add(R.getPosAgua());
//        
//        for(int i = 0; i < 6; i++){
//            R.setPosActual((int) Math.floor(Math.random()*6));
//            // sino va éste para el rango de random: (int)(Math.random()*(6-1+1)+1);
//            if(R.getPosActual() == R.getPosAgua()){
//                R.setPosActual(R.getPosActual() + 1);
//                tambor.add(R.getPosActual());
//            }
//            tambor.add(R.getPosActual());
//        }
//        while(tambor.size() < 6){
//            R.setPosActual((int) Math.floor(Math.random()*6));
//            tambor.add(R.getPosActual());
//        }
//        System.out.println(tambor);
//        System.out.println(R.getPosAgua());
//        for(Integer aux : tambor){
//            System.out.println(aux);
//        }
    }

    public boolean mojar(Revolver R){
        boolean mojado = false;
        if(R.getPosActual() == R.getPosAgua()){
            mojado = true;
        }
        return mojado;
    }
    
    public void siguienteChorro(Revolver R){
        
        if(R.getPosActual()==6){
            R.setPosActual(1);
        }else
            R.setPosActual(R.getPosActual()+1);
    }
    
    public boolean disparo(Revolver R, Jugador J){
        boolean vof = false;
        if(mojar(R)){
            J.setMojado(true);
            vof = true;            
        }
        siguienteChorro(R);
        return vof;
    }
    
    
    
    public void llenarJuego(ArrayList<Jugador>J, Revolver R, Juego P){
        P.setJugadores(J);
        P.setRevolver(R);
    }
    
    public void ronda(int i){
        
    }
    
    
    
    
    
    
    
}
