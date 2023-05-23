
/**
 * Crear un programa que pida una palabra y si esa palabra es igual a “eureka”
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
 * Nota: investigar la función equals() en Java.
 */

package javaintro07;

import java.util.Scanner;


public class Javaintro07 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("--------------------------------------");
        System.out.println("Ingrese una palabra y la analizaremos...");
        System.out.println("--------------------------------------");
        System.out.println("");
        
        String palabra = leer.nextLine();
        
        System.out.println("");
        
        if (palabra.equals("eureka")) {
            
            System.out.println("Correcto");
            
        } else {
            
            System.out.println("Incorrecto");
            
        }
        
        System.out.println("");
        
    }
    
}
