
package guia9relacionesej02.ruleta.rusa;

 //* @author Franoteros
import Entidades.Revolver;
import Servicio.ServicioRuleta;


public class Guia9RelacionesEj02RuletaRusa {

    public static void main(String[] args) {
        
        ServicioRuleta sr = new ServicioRuleta();
        Revolver R1 = new Revolver();
        sr.crearRevolver();
        sr.llenarRevolver(R1);
        
    }

}
