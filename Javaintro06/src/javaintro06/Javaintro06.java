
/**
 * Crear un programa que dado un numero determine si es par o impar.
 */

package javaintro06;

import java.util.Scanner;


public class Javaintro06 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("----------------------------------------------------------");
        System.out.println("Ingrese un número entero y le diremos si es par o impar...");
        System.out.println("----------------------------------------------------------");
        System.out.println("");
        
        int num = leer.nextInt();
        
        System.out.println("");
        
        if (num % 2 == 0) {
            
            System.out.println("El número ingresado es par.");
            
        } else {
            
            System.out.println("El número ingresado es impar.");
            
        }
        
        System.out.println("");
        
    }
    
}
