
package guia9relacionesej01.persona.y.perro;

 //* @author Franoteros
import Entidad.Perro;
import Entidad.Persona;
import Servicios.ServicioPersonaPerro;


public class Guia9RelacionesEj01PersonaYPerro {

    public static void main(String[] args) {
        
        ServicioPersonaPerro spp = new ServicioPersonaPerro();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Perro d1 = new Perro();
        Perro d2 = new Perro();
        
        d1 = spp.crearPerro();
        d2 = spp.crearPerro();
        p1 = spp.crearPersona(d1);
        p2 = spp.crearPersona(d2);
        
        System.out.println(p1);
        System.out.println(p2);
        
        
//        d1.setNombre("Matilde");
//        d1.setEdad(9);
//        d1.setRaza("Callejero");
//        d1.setTamaño("S");
//        
//        d2.setNombre("Orion");
//        d2.setEdad(8);
//        d2.setRaza("Ovejero");
//        d2.setTamaño("L");
//        
//        p1.setNombre("Fran");
//        p1.setApellido("Otero");
//        p1.setEdad(37);
//        p1.setDni(31381429);
//        p1.setPerro(d1);
//        
//        p2.setNombre("Pau");
//        p2.setApellido("Bernatene");
//        p2.setEdad(31);
//        p2.setDni(36655321);
//        p2.setPerro(d2);
//        
//        System.out.println(p1);
//        System.out.println("---------------------------------------------------");
//        System.out.println(p2);
        
        
        
    }

}
