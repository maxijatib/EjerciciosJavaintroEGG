
// Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

package javaintro02;

import java.util.Scanner;


public class Javaintro02 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-------------------------------");
        System.out.println("Ingrese su nombre, por favor...");
        System.out.println("-------------------------------");
        System.out.println("");
        
        String nombre = leer.nextLine();
        
        System.out.println("");
        System.out.println("Bienvenido, " + nombre);
        System.out.println("");
        
    }
    
}
