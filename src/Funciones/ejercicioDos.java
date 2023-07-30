package Funciones;

import java.util.Scanner;

public class ejercicioDos {

    /* Ejercicio 2
Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
unNumeroC)
Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
el resultado.
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int uno = scanner.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int dos = scanner.nextInt();
        System.out.println("Ingresa el tercer numero: ");
        int tres = scanner.nextInt();

        int resultado = maximoEntreTresNumeros(uno, dos, tres);

        System.out.println("El numero mayor de los tres ingresados es: " + resultado);

    }

    public static int maximoEntreTresNumeros(int a, int b, int c){
        int comodin;
        if (a > b && a > c){
            comodin = a;
        } else if (b > c && b > a) {
            comodin = b;
        }else {
            comodin = c;
        }

        return  comodin;
    }
}
