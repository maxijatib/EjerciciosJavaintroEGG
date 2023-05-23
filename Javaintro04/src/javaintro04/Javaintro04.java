
/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package javaintro04;

import java.util.Scanner;


public class Javaintro04 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("Ingrese los grados Celcius que desea pasar a grados Fahrenheit.");
        System.out.println("---------------------------------------------------------------");
        System.out.println("");
        
        double gradosC = leer.nextDouble();
        
        double gradosF = 32 + (9 * gradosC / 5);
        
        System.out.println("");
        System.out.println("El equivalente de " + gradosC + "° celcius " + "en Fahrenheit es " + gradosF + "° Fahrenheit.");
        System.out.println("");
        
    }
    
}
