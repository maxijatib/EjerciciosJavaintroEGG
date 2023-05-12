package javaintroejer11;

import java.util.Scanner;

public class JavaintroEjer11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String frase;

        do {

            System.out.println("Ingrese una secuencia de caracteres terminada en punto");
            frase = leer.next();

        } while (!frase.endsWith("."));

        frase = cambiarVocal(frase);

        System.out.println("La frase modificada es: " + frase);

    }

    public static String cambiarVocal(String frase) {

        String vocal = "";

        for (int i = 0; i < frase.length(); i++) {

            switch (frase.substring(i, i + 1)) {
                case "a":
                case "A":
                    //Metodo completo con la funcion CONCAT
                    //vocal = vocal.concat("@");
                    //Metodo utilizando el signo "+" como la funcion CONCAT
                    //vocal = vocal + "@";
                    //Metodo abreviado para CONCAT
                    vocal += "@";
                    break;
                case "e":
                case "E":
                    vocal += "#";
                    break;
                case "i":
                case "I":
                    vocal += "$";
                    break;
                case "o":
                case "O":
                    vocal += "%";
                    break; 
                case "u":
                case "U":
                    vocal += "*";
                    break;
                default:
                    vocal += frase.substring(i, i + 1);

            }

        }

        return vocal;
    }

}
