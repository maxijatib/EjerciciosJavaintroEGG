
/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo:
 * tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X
 * y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&”
 * marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE,
 * que no respete el formato se considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas
 * recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 */

package javaintro12;

import java.util.Scanner;


public class Javaintro12 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        String fde = "&&&&&";
        int correctas = 0;
        int incorrectas = 0;
        
        
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ingrese una cadena con una longitud de 5 caracteres, su primer letra debe ser una 'x' y la última letra debe ser una 'y'.");
        System.out.println("Para finalizar ingrese la cadena especial '&&&&&' (FDE).");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");
        
        cadena = leer.nextLine();
        
        while (!cadena.equals(fde)) {
            
            int longitud = cadena.length();
            
            if (cadena.substring(0, 1).equalsIgnoreCase("x") & cadena.endsWith("y") & longitud == 5) {
                
                correctas ++;
                
            } else {
                
                incorrectas ++;
                
            }
            
            System.out.println("");
            System.out.println("Ingrese la siguiente cadena o finalice con la cadena especial (FDE)");
            System.out.println("");
                
            cadena = leer.nextLine();
        
        }
        
        System.out.println("");
        System.out.println("La cantidad de cadenas correctas fueron: " + correctas);
        System.out.println("");
        System.out.println("La cantidad de cadenas incorrrectas fueron: " + incorrectas);
        System.out.println("");
        
    }
    
}
