
package javaintroejer12;

import java.util.Scanner;


public class JavaintroEjer12 {

    
    public static void main(String[] args) {
        
        esMultiplo(0,0);
                
    }
    
    public static void esMultiplo (int num1, int num2){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese dos números para saber si el primer número ingresado es multiplo del segundo número ingresado.");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("");
        
        System.out.println("Ingrese el primer número: ");
        System.out.println("");
        
        num1 = leer.nextInt();
        
        System.out.println("");
        
        System.out.println("Ingrese el segundo número: ");
        System.out.println("");
        
        num2 = leer.nextInt();
        
        System.out.println("");
        
        if (num1 % num2 == 0) {
            
            System.out.println("*** El primer número es multiplo del segundo número. ***");
            
        } else {
            
            System.out.println("*** El primer número no es multiplo del segundo número. ***");
            
        }
        
        System.out.println("");
        
    }
    
    
}
