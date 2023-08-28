package Navetur;

public class Velero extends Embarcacion{

    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public int getCantidadMastiles() {
        return cantidadMastiles;
    }

    public void setCantidadMastiles(int cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean evaluarTamaño(int cantidadMastiles){
        if(this.cantidadMastiles > 4){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Velero{" +
                "cantidadMastiles=" + cantidadMastiles +
                '}';
    }
}
