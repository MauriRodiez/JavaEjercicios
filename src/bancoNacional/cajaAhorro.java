package bancoNacional;

public class cajaAhorro extends Cuenta {

    private double saldo;
    private double tasaInteres;

    public cajaAhorro(Cliente cliente, double saldo, double tasaInteres) {
        super(cliente);
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    // Metodos heredados de la calse abstracta
    @Override
    public void depositar(double dinero) {
        saldo += dinero;
    }

    @Override
    public void extraer(double dinero) {
        if(dinero <= saldo){
            saldo -= dinero;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public double informarSaldo() {
        return saldo;
    }

    // Metodo simple
    public double cobrarInteres(){
        return tasaInteres * saldo;
    }
}
