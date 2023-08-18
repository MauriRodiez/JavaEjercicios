package bancoNacional;

public class cuentaCorriente extends Cuenta{

    private double saldo;

    private double montogiroDescubierto;

    public cuentaCorriente(Cliente cliente, double saldo, double montogiroDescubierto) {
        super(cliente);
        this.saldo = saldo;
        this.montogiroDescubierto = montogiroDescubierto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMontogiroDescubierto() {
        return montogiroDescubierto;
    }

    public void setMontogiroDescubierto(double montogiroDescubierto) {
        this.montogiroDescubierto = montogiroDescubierto;
    }

    @Override
    public void depositar(double dinero) {
        saldo += dinero;
    }

    @Override
    public void extraer(double dinero) {
        if(dinero <= saldo){
            saldo-= dinero;
        }else {
            if(saldo < dinero){
                saldo -= montogiroDescubierto;
                System.out.println("Se utilizo el giro descubierto y el saldo ahora es: " + saldo + "/n" + " Tiene plazo hasta mañana para actualizar saldo.");
            }
        }
    }
    @Override
    public double informarSaldo(){
        return saldo;
    }
}
