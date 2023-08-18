package bancoNacional;

public class Main {
    public static void main(String[] args) {

        Cliente clienteUno = new Cliente(1,"Rodriguez",123, 321);
        Cuenta caja1 = new cajaAhorro(clienteUno,1000, 0.2);

        caja1.depositar(500);
        caja1.extraer(250);
        System.out.println(caja1.informarSaldo());

    }
}
