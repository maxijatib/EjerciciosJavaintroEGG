
package javaintroejer08;

import java.util.Scanner;


public class JavaintroEjer08 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-----------------------------");
        System.out.println("Ingrese una nota del 0 al 10.");
        System.out.println("-----------------------------");
        System.out.println("");
        
        int nota = leer.nextInt();
        
        while (nota <= 0 || nota >= 10) {
            System.out.println("Ingrese nuevamente la nota.");
           nota = leer.nextInt();
        }
        
    }
    
}
