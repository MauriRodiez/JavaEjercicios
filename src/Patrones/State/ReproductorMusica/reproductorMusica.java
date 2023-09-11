package Patrones.State.ReproductorMusica;

public class reproductorMusica {

    // Asociamos
    private Estado estado;
    //para darle vida necesitamos instanciarlo

    public reproductorMusica(){
        estado = new estadoDetenido(); // El reproductor se inicializa detenido
    }

    public Estado getEstado(){
        return estado;
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public void reproducir(){
        estado.reproducir();
    }

    public void pausar(){
        estado.pausar();
    }

    public void detener(){
        estado.detener();
    }
}
