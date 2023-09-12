package Patrones.State.MascotaVirtual;

public class Feliz implements EstadoMascota{


    @Override
    public void darBebida() {
        System.out.println("Se pone hambriento");
    }

    @Override
    public void darComida() {
        System.out.println("Se pone sediento");
    }

    @Override
    public void darMimos() {

    }
}
