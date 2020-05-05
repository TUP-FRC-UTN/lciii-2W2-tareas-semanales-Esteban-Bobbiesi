
package veterinaria;

public class Mascota {
    
    private String nombre;
    private int edad;

    public Mascota() {
    }

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "***Mascota***\n" + '['+ "Nombre: " + nombre + "\nEdad:" + edad + ']';
    }
    
}
