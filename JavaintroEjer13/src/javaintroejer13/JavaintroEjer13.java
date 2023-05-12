
package javaintroejer13;

import java.util.Scanner;


public class JavaintroEjer13 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de participantes: ");
        
        int canp = leer.nextInt();
       
        String[] nomp = new String[canp];
        
        for (int i = 0; (i < canp); i++) {
            
            System.out.println("Ingrese el nombre del participante: " + i);
            nomp[i] = leer.next();
            
        }
        
        System.out.println("El arreglo de personas es:");
        
        for (int i = 0; i < canp; i++) {
            
            System.out.print(" [ " + nomp[i] + " ]");
            
        }
        
        System.out.println("");

    }
    
}
