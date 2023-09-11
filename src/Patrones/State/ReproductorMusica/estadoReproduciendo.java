package Patrones.State.ReproductorMusica;

public class estadoReproduciendo implements Estado{

    @Override
    public void reproducir() {
        System.out.println("Estamos reproduciendo");
    }

    @Override
    public void pausar() {
        System.out.println("Reproduccion pausada");
    }

    @Override
    public void detener() {
        System.out.println("Reproduccion detenida");
    }
}
