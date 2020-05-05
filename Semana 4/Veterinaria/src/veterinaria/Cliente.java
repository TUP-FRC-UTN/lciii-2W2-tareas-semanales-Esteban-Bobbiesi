
package veterinaria;

public class Cliente {
    
    private int nroCliente, antiguedad;
    private String nombre,apellido;
    Mascota masc;
    
    public Cliente() {
    }

    public Cliente(int nroCliente, int antiguedad, String nombre, String apellido) {
        this.nroCliente = nroCliente;
        this.antiguedad = antiguedad;
        this.nombre = nombre;
        this.apellido = apellido;
      
        
    }
    
    public int getNroCliente() {
        return nroCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
      @Override
    public String toString() {
        return "***Cliente*** \n" + "Nombre: " + nombre +"Apellido: " + apellido + "\n" + "Numero de Cliente: " + nroCliente + "\n"+ "Antigüedad: " + antiguedad;
    }


   
}
