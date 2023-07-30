package Funciones;

import java.util.Scanner;

public class ejercicioTres {

    /* Ejercicio 3
Escribir una función: boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
false, en caso de que coincidan.
     */
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        String txt1 = scanner.nextLine();
        System.out.println("Escribe otra palabra: ");
        String txt2 = scanner.nextLine();

        boolean resultado = cadenaDeTextoDistintas(txt1, txt2);
        if(resultado == false){
            System.out.println("Las dos palabras que ingresaste son iguales!");
        } else {
            System.out.println("Las dos palabras que ingresaste son distintas!");
        }

    }

    public static boolean cadenaDeTextoDistintas(String txtA, String txtB){

        if(txtA.equals(txtB)){
            return false;
        } else {
            return true;
        }

    }

}
