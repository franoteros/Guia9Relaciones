
package Servicios;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Franoteros
 */
public class ServicioPersonaPerro {
    
    Scanner leer = new Scanner(System.in);
    
    public Perro crearPerro(){

        Perro D = new Perro();            
        
        System.out.println("Nombre perro");
        D.setNombre(leer.next());
        System.out.println("Edad perro");
        D.setEdad(leer.nextInt());
        System.out.println("Raza perro");
        D.setRaza(leer.next());
        System.out.println("Tamaño perro");
        D.setTamaño(leer.next());
        
        return D;
    }
    
        
    public Persona crearPersona(Perro D){
        
        Persona P = new Persona();
        
        System.out.println("Nombre persona");
        P.setNombre(leer.next());
        System.out.println("Apellido persona");
        P.setApellido(leer.next());
        System.out.println("Edad persona");
        P.setEdad(leer.nextInt());
        System.out.println("Dni persona");
        P.setDni(leer.nextInt());
        P.setPerro(D);
        
        return P;
    }
    


}
