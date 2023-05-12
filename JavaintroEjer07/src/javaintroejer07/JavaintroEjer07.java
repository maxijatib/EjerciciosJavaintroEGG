
package javaintroejer07;

import java.util.Scanner;


public class JavaintroEjer07 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Por favor, ingrese el número 1, 2, 3, o 4 para saber la característica del motor.");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("");
        
        int tipoMotor = leer.nextInt();
        
        System.out.println("");
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón.");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba.");
        }
        
        System.out.println("");
        
    }
    
}
