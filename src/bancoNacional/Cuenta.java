package bancoNacional;

public abstract class Cuenta {

    private Cliente cliente;

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Metodos abstractos
    public abstract void depositar(double dinero);
    public abstract void extraer(double dinero);

    // Metodos simples

    public double informarSaldo() {
        return 0;
    }

}
