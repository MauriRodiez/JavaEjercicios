package Navetur;

public class Yate extends Embarcacion implements Comparable{

    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void setCantidadCamarotes(int cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public String toString() {
        return super.toString() + cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yate bote = (Yate) o;
        int resultado = 0;

        if(this.getCantidadCamarotes() > bote.getCantidadCamarotes()){
            resultado = 1;
        }

        if(this.getCantidadCamarotes() < bote.getCantidadCamarotes()){
            resultado = -1;
        }

        return resultado;
    }
}
