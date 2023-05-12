
package javaintroejer03;


public class JavaintroEjer03 {

    public static void main (String[] args) {
        
        System.out.println("----------------------");
        System.out.println("Operadores aritmeticos");
        System.out.println("----------------------");
        System.out.println("");
        
        int num1 = 5;
        int num2 = 2;
        
        //Operadores aritmeticos
        
        int suma = num1 + num2;
        System.out.println("La suma entre " + num1 + " y " + num2 + " es = " + suma);
        
        int resta = num1 - num2;
        System.out.println("La resta entre " + num1 + " y " + num2 + " es = " + resta);
        
        int multiplicacion = num1 * num2;
        System.out.println("La multiplicacion entre " + num1 + " y " + num2 + " es = " + multiplicacion);
        
        float division = num1 / num2;
        System.out.println("La division entre " + num1 + " y " + num2 + " es = " + division); //Me da 2.0 (?
        
        System.out.println("");
        
        System.out.println("------------------");
        System.out.println("Operadores unarios");
        System.out.println("------------------");
        System.out.println("");
        
        //Operadores unarios
        
        int incremento1 = ++num1;
        int incremento2 = ++num2;
        System.out.println("El incremento de la variable 1 es = " + incremento1);
        System.out.println("El incremento de la variable 2 es = " + incremento2);
        
        int decremento1 = --num1; //Acá la variable ya cambia porque se guardo el nuevo numero de incremento
        int decremento2 = --num2; //Idem
        System.out.println("El decremento de la variable 1 es = " + decremento1);
        System.out.println("El decremento de la variable 2 es = " + decremento2);
        
        System.out.println("");
        
        System.out.println("---------------------------------");
        System.out.println("Operadores de Igualdad o Relacion");
        System.out.println("---------------------------------");
        System.out.println("");
        
        //Operadores de Igualdad o Relacion
        
        boolean opcion1 = num1 < num2;
        System.out.println(num1 + " es menor que " + num2 + " = " + opcion1);
        boolean opcion2 = num1 > num2;
        System.out.println(num1 + " es mayor que " + num2 + " = " + opcion2);
        
        boolean opc1 = num1 != num2;
        System.out.println(num1 + " es distinto de " + num2 + " = " + opc1);
        boolean opc2 = num1 == num2;
        System.out.println(num1 + " es igual a " + num2 + " = " + opc2);
        
        System.out.println("");
    }
    
}
