package Juego;

public class Asteroide extends Objeto{

    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public String irA(int x, int y, char direccion) {
        return null;
    }
}