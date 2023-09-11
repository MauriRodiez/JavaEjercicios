package Patrones.State.ReproductorMusica;

public interface Estado {

    public void reproducir();
    public void pausar();
    public void detener();
}
