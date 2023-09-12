package Patrones.State.MascotaVirtual;

public class Hambriento implements EstadoMascota{
    @Override
    public void darBebida() {
        System.out.println("Se pone triste");
    }

    @Override
    public void darComida() {
        System.out.println("Se pone feliz");
    }

    @Override
    public void darMimos() {

    }
}
