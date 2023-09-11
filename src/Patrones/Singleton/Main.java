package Patrones.Singleton;

public class Main {
    public static void main(String[] args) {

        Single elUno = Single.getInstance();
        elUno.setNombre("Mauricio");

        System.out.println(elUno.getNombre());

    }

}
