package Funciones;

import java.util.Scanner;

public class ejercicioUno {

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
