
/**
* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
* Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* 
*  * * * *
*  *     *
*  *     *
*  * * * *
*/

package javaintro13;

import java.util.Scanner;


public class Javaintro13 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Ingrese un número para determinar el tamaño del cuadrado a dibujar.");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("");
        
        int tamanio = leer.nextInt();
        
        System.out.println("");
        
        for (int i = 0; i < tamanio; i++) {
            
            for (int j = 0; j < tamanio; j++) {
                
                if ((i == 0) || (i == tamanio) || (j == 0) || (j == tamanio)) {
                    
                    System.out.print("* ");
                    
                } else {
                    
                    System.out.print("  ");
                    
                }
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println("");
        
    }
    
}
