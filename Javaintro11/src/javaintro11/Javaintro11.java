/**
 * Realizar un programa que pida dos números enteros positivos por teclado
 * y muestre por pantalla el siguiente menú:
 *
 *       MENU
 *       1. Sumar
 *       2. Restar
 *       3. Multiplicar
 *       4. Dividir
 *       5. Salir
 *       Elija opción:
 *
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
 * y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
 * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente,
 * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
 * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package javaintro11;

import java.util.Scanner;

public class Javaintro11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Ingrese dos números enteros para poder hacer la operación que desee...");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("");

        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String option = "";
        int operacion;

        do {

            do {

                System.out.println("");
                System.out.println("Elija en el siguiente menú qué operación desea hacer con los números ingresados.");
                System.out.println("");

                System.out.println("**************");
                System.out.println("[Menú]");
                System.out.println("");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("");
                System.out.println("**************");
                System.out.println("");

                operacion = leer.nextInt();

                System.out.println("");

                switch (operacion) {

                    case 1:

                        int suma = num1 + num2;
                        System.out.println("La suma de ambos números es: " + suma);
                        System.out.println("");
                        break;

                    case 2:

                        int resta = num1 - num2;
                        System.out.println("La resta de ambos números es: " + resta);
                        System.out.println("");
                        break;

                    case 3:

                        int mult = num1 * num2;
                        System.out.println("La multiplicación de ambos números es: " + mult);
                        System.out.println("");
                        break;

                    case 4:

                        double div = num1 / num2;
                        System.out.println("La división entre ambos números es: " + div);
                        System.out.println("");
                        break;

                    case 5:

                        System.out.println("¿Está seguro de salir del programa? (Escriba S/N)");
                        System.out.println("");

                        option = leer.next();

                        if (option.equalsIgnoreCase("s")) {

                            System.out.println("");
                            System.out.println("Hasta la próxima!");
                            System.out.println("");

                        } else if (option.equalsIgnoreCase("n")) {

                            System.out.println("");
                            System.out.println("Vamos con otra opción!");
                            System.out.println("");

                        } else {

                            System.out.println("");
                            System.out.println("Error :( Se esperaba una opción correcta.");
                            System.out.println("");

                        }

                    default:

                        if (operacion < 0 || operacion > 5) {

                            System.out.println("");
                            System.out.println("Error :( Se esperaba una opción correcta.");
                            System.out.println("");

                        }

                }

            } while (option.equalsIgnoreCase("n"));

        } while (operacion > 0 || operacion < 6);


    }

}
