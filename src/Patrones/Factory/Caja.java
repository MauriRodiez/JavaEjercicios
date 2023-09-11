package Patrones.Factory;

public class Caja extends Producto{

    private double longitud;
    private double ancho;
    private double altura;


    @Override
    public double calcularPeso() {
        return 0;
    }
}
