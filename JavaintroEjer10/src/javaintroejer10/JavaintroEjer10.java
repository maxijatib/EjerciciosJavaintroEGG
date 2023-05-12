package javaintroejer10;

import java.util.Scanner;

public class JavaintroEjer10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese 4 numeros entre 1 y 20");

        for (int i = 0; i < 4; i++) {

            int num = leer.nextInt();

            while (num < 1 || num > 20) {
                System.out.println("Ingrese un número correcto");
                num = leer.nextInt();
            }
            
            System.out.print(num);
            
            for (int j = 0; j < num; j++) {
                System.out.print(" *");
            }

            System.out.println("");

        }

    }

}
