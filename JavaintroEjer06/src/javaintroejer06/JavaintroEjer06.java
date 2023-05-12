
package javaintroejer06;

import java.util.Scanner;


public class JavaintroEjer06 {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número a evaluar: ");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número a evaluar: ");
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {
            
            System.out.println("Ambos números ingresados son mayores a 25.");
        
        } else if (num1 > 25 || num2 > 25) {
            
            System.out.println("Uno de los números ingresados es mayor a 25.");
            
        } else {
            System.out.println("Lo sentimos, ningun número ingresado es mayor a 25.");
        }
        
        System.out.println("");
        
    }
    
}
