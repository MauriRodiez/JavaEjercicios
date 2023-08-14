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
    public String irA(int x, int y, char direccion) {
        return null;
    }

    public char girar(char direccion){
        return direccion;
    }

    public int restaVida(int valor){
        return valor;
    }

}
