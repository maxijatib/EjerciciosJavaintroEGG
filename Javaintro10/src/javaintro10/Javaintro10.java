
/**
 * Escriba un programa en el cual se ingrese un valor límite positivo,
 * y a continuación solicite números al usuario hasta que la suma de los números introducidos
 * supere el límite inicial.
 */

package javaintro10;

import java.util.Scanner;


public class Javaintro10 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Ingrese un límite positivo a los números que desea ingresar y sumar...");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("");
        
        int limite = leer.nextInt();
        int num;
        int suma = 0;
        
        while (suma <= limite) {
            
                System.out.println("");
                System.out.println("------------------------------------");
                System.out.println("Ingrese los números que desea sumar:");
                System.out.println("------------------------------------");
                System.out.println("");
                
                num = leer.nextInt();
                
                suma += num;

        }
        
        System.out.println("");
        System.out.println("La suma total es: " + suma);
        System.out.println("");
        
    }
    
}
