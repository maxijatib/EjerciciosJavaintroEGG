
package javaintroejer09;

import java.util.Scanner;


public class JavaintroEjer09 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        int contador = 0;
        int suma = 0;
        
        do {
            
            System.out.println("Ingrese los números");
            num = leer.nextInt();
            
            
                
                if (num == 0) {
                   System.out.println("Hemos encontrado un 0");
                } else if (num > 0 ) {
                    
                    suma += num;
                } else if (num < 0) {
                    
                }
                
                contador += 1;
                
                
        } while (num != 0 && contador < 5);
                
        
        
        System.out.println(suma);
        
        
    }
    
}
