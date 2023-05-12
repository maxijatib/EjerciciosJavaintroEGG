
package javaintroejer01y02;

import java.util.Scanner;


public class JavaintroEjer01y02 {

    public static void main(String[] args) {
        
        System.out.println("------------------");
        System.out.println("Datos del usuario:");
        System.out.println("------------------");
        System.out.println("");
        
        String nombre = "Maximiliano";
        System.out.println("Nombre: " + nombre);
        
        String apellido = "Jatib";
        System.out.println("Apellido: " + apellido);
        
        int edad = 27;
        System.out.println("Edad: " + edad);
        
        double estatura = 1.71;
        System.out.println("Estatura: " + estatura + " mt");
        
        String nacionalidad = "Argentina";
        System.out.println("Nacionalidad: " + nacionalidad);
        
        int numCelular = 1122546576;
        System.out.println("Número de celular: " + numCelular);
        
        String email = "mjatib@gmail.com";
        System.out.println("Email: " + email);
        
        System.out.println("Ingrese su estado civil: ");
        Scanner estadoCivil = new Scanner(System.in); //Ingreso de datos por teclado
        String estCivil; estCivil = estadoCivil.nextLine();
        
        System.out.println("");
        
        System.out.println("-------------------------");
        System.out.println("Han finalizado sus datos.");
        System.out.println("-------------------------");
        
    }
    
}
