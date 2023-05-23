/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas
 * y después toda en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package javaintro03;

import java.util.Scanner;


public class Javaintro03 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-------------------------------");
        System.out.println("Ingrese una frase, por favor...");
        System.out.println("-------------------------------");
        System.out.println("");
        
        String frase = leer.nextLine();
        
        System.out.println("");
        System.out.println("Mayusculas: " + frase.toUpperCase());
        System.out.println("");
        System.out.println("Minusculas: " + frase.toLowerCase());
        System.out.println("");
        
    }
    
}
