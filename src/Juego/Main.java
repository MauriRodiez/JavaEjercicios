package Juego;

public class Main {

    public static void main(String[] args) {

        Nave naveEnemiga = new Nave(10,6,'E', 125.0, 1);

       // naveEnemiga.girar('S');
        naveEnemiga.irA(3, 11, 'E');
        System.out.println(naveEnemiga);
    }


}
