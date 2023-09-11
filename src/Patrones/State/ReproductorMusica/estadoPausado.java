package Patrones.State.ReproductorMusica;

public class estadoPausado implements Estado{
    @Override
    public void reproducir() {
        System.out.println("Iniciando reproduccion");
    }

    @Override
    public void pausar() {
        System.out.println("Reproduccion pausada");
    }

    @Override
    public void detener() {
        System.out.println("Deteniendo reproduccion");
    }
}
