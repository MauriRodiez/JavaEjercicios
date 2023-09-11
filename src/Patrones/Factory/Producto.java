package Patrones.Factory;

public abstract class Producto {

    private double peso;
     public abstract double calcularPeso();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
