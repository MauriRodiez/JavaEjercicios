package Funciones;

import java.util.Scanner;

public class ejercicioUno {

    /*  Ejercicio 1
Hacer una función que dado un número indica si es un número primo o no. Un número
primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por
17.
Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
divisor)
    * */

    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.printf("Ingresa un numero para validar si es primo o no: ");
        int numero = scanner.nextInt();
        if(esPrimo(numero)){
            System.out.printf("El numero " + numero + " es primo.");
        } else {
            System.out.printf("El numero " + numero + " no es primo.");
        }

    }

    public static boolean esPrimo(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i < num; i++){
            if(esDivisible(num, i)){
                return false;
            }
        }
        return true;
    }

    public static boolean esDivisible(int numero1,int numero2) {
        return numero1 % numero2== 0;
    }

}
