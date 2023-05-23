
/**
 * Realizar un programa que solo permita introducir frases o palabras de 8 caracteres de largo.
 * Si el usuario ingresa una frase o palabra de 8 caracteres de largo se deberá de imprimir un mensaje
 * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 * Nota: investigar la funciónn Lenght() en Java.
 */

package javaintro08;

import java.util.Scanner;


public class Javaintro08 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Ingrese una palabra o frase de 8 caracteres de longitud:");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        
        String frase = leer.nextLine();
        
        System.out.println("");
        
        if (frase.length() == 8) {
            
            System.out.println("Correcto.");
            
        } else {
            System.out.println("Incorrecto");
        }
        
        System.out.println("");
        
    }
    
}
