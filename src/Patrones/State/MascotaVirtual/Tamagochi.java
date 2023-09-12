package Patrones.State.MascotaVirtual;

public class Tamagochi {

    private EstadoMascota estado;

    public Tamagochi(){
        estado = new Hambriento();
    }

    public EstadoMascota getEstado() {
        return estado;
    }

    public void setEstado(EstadoMascota estado) {
        this.estado = estado;
    }

    // Metodos

    public void tomaBebida(){
        estado.darBebida();
        //Cambiamos el estado
        if(estado instanceof Sediento){
            estado = new Feliz();
        } else if (estado instanceof Feliz) {
            estado = new Hambriento();
        } else if (estado instanceof Triste) {
            System.out.println("3 beep y titila la pantalla");
        } else if (estado instanceof Hambriento){
            estado = new Triste();
        }
    }

    public void come(){
        estado.darComida();
        //Cambiamos el estado
        if(estado instanceof Hambriento){
            estado = new Feliz();
        } else if (estado instanceof Triste) {
            System.out.println("2 beep y se descompone del estomago");
        } else if (estado instanceof Sediento){
            estado = new Triste();
        } else if(estado instanceof Feliz){
            estado = new Sediento();
        }
    }

    public void darMimos(){
        estado.darMimos();
        // Cambiamos el estado
        if (estado instanceof Triste){
            estado = new Feliz();
        }
    }

}
