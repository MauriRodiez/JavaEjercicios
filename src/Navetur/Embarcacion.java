package Navetur;

public abstract class Embarcacion {

    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double calcularAlquiler(){
        double alquiler = precioBase;
        if(anioFabricacion > 2020){
            alquiler += valorAdicional;
        } else {
            alquiler = precioBase;
        }
        return alquiler;
    }

   @Override
    public String toString() {
        return "Embarcacion{" +
                "capitan=" + capitan +
                ", precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", anioFabricacion=" + anioFabricacion +
                ", eslora=" + eslora +
                '}';
    }
}
