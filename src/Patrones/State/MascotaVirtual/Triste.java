package Patrones.State.MascotaVirtual;

public class Triste implements EstadoMascota{
    @Override
    public void darBebida() {
        System.out.println("Beep, Beep, Beep!! Titila el display!");
    }

    @Override
    public void darComida() {
        System.out.println("Beep, Beep!! Luego vomita!");
    }

    @Override
    public void darMimos() {
        System.out.println("Se pone feliz!");
    }
}
