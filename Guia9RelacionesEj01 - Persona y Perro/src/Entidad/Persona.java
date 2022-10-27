
package Entidad;

/**
 *
 * @author Franoteros
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "\n Nombre = " + nombre + ",\n Apellido = " + apellido + ",\n Edad = " + edad + ",\n Dni = " + dni + ",\n Perro = " + perro + '}';
    }
    
    
    

}
