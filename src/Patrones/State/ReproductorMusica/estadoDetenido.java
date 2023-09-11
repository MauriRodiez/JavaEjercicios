package Patrones.State.ReproductorMusica;

public class estadoDetenido implements Estado{
    @Override
    public void reproducir() {
        System.out.println("Inicializando reproduccion");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando la reproduccion");
    }

    @Override
    public void detener() {
        System.out.println("Reproduccion detenida");
    }
}
