package Navetur;

public class Yate extends Embarcacion{

    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public boolean sePuedeComparar(int cantidadCamarotes){

        return false;
    }

    @Override
    public String toString() {
        return super.toString() + cantidadCamarotes;
    }
}
