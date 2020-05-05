
package veterinaria;

import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) 
    {
        
         Cliente[] vCliente;
         Mascota[] vMascota;
         int cantRegistros=0; 
        
         Scanner scVeterinaria = new Scanner(System.in);
         System.out.println("Ingrese la cantidad de Clientes: ");
         cantRegistros = scVeterinaria.nextInt();
        
         vCliente = new Cliente[cantRegistros]; 
         vMascota = new Mascota[cantRegistros];
        

         for (int i = 0; i < vCliente.length; i++) 
         {
                  scVeterinaria.nextLine();
                  System.out.println("Ingrese el nombre del Cliente " + (i+1) + ":");
                  String nombre = scVeterinaria.nextLine();
                  System.out.println("Ingrese el apellido del Cliente " + (i+1) + ":");
                  String apellido = scVeterinaria.nextLine();
                  System.out.println("Ingrese la antigüedad del Cliente " + (i+1) + ":");
                  int antiguedad = scVeterinaria.nextInt();
                  scVeterinaria.nextLine();
           
                  System.out.println("Ingrese el nombre de la mascota del cliente " + (i+1) + ":");
                  String nombreMasc = scVeterinaria.nextLine();
                  System.out.println("Ingrese la edad de la mascota del cliente " + (i+1) + ":");
                  int edad = scVeterinaria.nextInt();
                   
                  vCliente[i]= new Cliente(i+1, antiguedad, nombre, apellido);
                  vMascota[i]=new Mascota(nombreMasc,edad);       
         }
               
                  //Promedio de edad de mascotas
                  int acumuladorEdad = 0;
                  double promEdad=0;
                   
                  for (int j = 0; j < vMascota.length; j++) 
                  {
                       
                           if (vMascota[j]!=null) 
                           {
                           acumuladorEdad+=vMascota[j].getEdad();
                           }  
                  }
                  promEdad=(acumuladorEdad/cantRegistros);
                   
                  //Cant clientes con antig mayor o igual a 5 anios
                  int contAntig=0;
                  for (int i = 0; i < vCliente.length; i++)
                  {
                     
                           if (vCliente[i]!=null && vCliente[i].getAntiguedad()>=5) 
                           {
                           contAntig++;
                           }
                  }

         //Muestras de Datos    
       
         System.out.println("Cantidad de Clientes: " + cantRegistros);
         System.out.println("El promedio de edad de las mascotas es: " + promEdad);
         System.out.println("Cantidad de clientes con antigüedad mayor o igual a 5 años: " + contAntig);
    }
    
}
