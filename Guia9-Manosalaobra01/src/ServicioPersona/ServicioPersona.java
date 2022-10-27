
package ServicioPersona;

import Entidades.DNI;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioPersona {
    
    Scanner leer = new Scanner (System.in);
    
    public DNI D (){
        
        DNI D = new DNI();
        System.out.println("Ingrese serie");
        D.setSerie(leer.next());
        System.out.println("Ingrese numero");
        D.setNumero(leer.nextInt());
        
        return D;
    }
    
    public Persona P (){
        
        Persona P = new Persona();
        
        System.out.println("Ingrese nombre");
        P.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        P.setApellido(leer.next());
        P.setDni(D());
        
        return P;
    }
    
    public void mostrarDatos(){
        System.out.println(P ());        
        
    }

}
