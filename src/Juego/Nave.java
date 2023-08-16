package Juego;

public class Nave extends Objeto{

    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void irA(int x, int y, char direccion) {

        if (direccion != getDireccion()){
            girar(direccion);
        }
        setPosx(x);
        setPosy(y);
    }

    public void girar(char direccion){
        setDireccion(direccion);
    }

    public int restaVida(int valor){

        return valor;
    }

    @Override
    public String toString() {
        return "La nave se encuentra viajando en direccion " + this.getDireccion() + " y esta en las siguientes coordenadas: " + this.getPosx() +
                " - " + this.getPosy();
    }
}
