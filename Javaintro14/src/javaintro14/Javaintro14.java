
/**
 * Crea una aplicación que a través de una función nos convierta
 * una cantidad de euros introducida por teclado a otra moneda,
 * estas pueden ser a dólares, yenes o libras.
 * La función tendrá como parámetros, la cantidad de euros
 * y la moneda a convertir que será una cadena, este no devolverá ningún valor
 * y mostrará un mensaje indicando el cambio (void).
 * 
 *   El cambio de divisas es:
 * 
 *   0.86 libras es un 1 €
 *   1.28611 dolares es un 1 €
 *   129.852 yenes es un 1 €
 */

package javaintro14;

import java.util.Scanner;


public class Javaintro14 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Ingrese la cantidad de euros que desea hacer la conversion...");
        System.out.println("-------------------------------------------------------------");
        System.out.println("");
        
        float euro = leer.nextFloat();
        
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("¿A qué moneda desea hacer la conversión?:");
        System.out.println("");
        System.out.println("1) Dolar");
        System.out.println("2) Yenes");
        System.out.println("3) Libras");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("");
        
        int option = leer.nextInt();
        
        switch (option) {
            case 1:
                System.out.println(euro + " euros son: " + (euro * 1.28611) + " dolares.");
                break;
            case 2:
                System.out.println(euro + " euros son: " + (euro * 129.852) + " yenes.");
                break;
            case 3:
                System.out.println(euro + " euros son: " + (euro * 0.86) + " libras.");
                break;
            default:
                System.out.println("Lo sentimos. La opción ingresada no es correcta.");
        }
        
    }
    
}
