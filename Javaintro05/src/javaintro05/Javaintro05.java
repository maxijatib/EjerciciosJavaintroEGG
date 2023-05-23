
/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
 * el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */

package javaintro05;

import java.util.Scanner;


public class Javaintro05 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese un número entero y le devolveremos el doble, el triple y la raíz cuadrada del número ingresado.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("");
        
        int num = leer.nextInt();
        
        int doble = num * 2;
        
        int triple = num * 3;
        
        double raizC = Math.sqrt(num);
        
        System.out.println("");
        System.out.println("El número ingresado es: " + num);
        System.out.println("El doble del número ingresado es: " + doble);
        System.out.println("El triple del número ingresado es: " + triple);
        System.out.println("La raíz cuadrada del número ingresado es: " + raizC);
        System.out.println("");
        
    }
    
}
