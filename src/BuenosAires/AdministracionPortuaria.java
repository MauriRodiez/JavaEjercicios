package BuenosAires;

public class AdministracionPortuaria {

    public static void main(String[] args) {
        // Creo Puerto

        Puerto bs = new Puerto("Buenos Aires");
        //Creo Contenedores con el new

        Contenedor aaa = new Contenedor(153, "Francia", true);
        Contenedor bbb = new Contenedor(75, "Holanda", true);

        // Agrego contenedores con el metodo add
        bs.addContainers(aaa);
        bs.addContainers(bbb);

        //creo contenedores dentro del metodo
        bs.addContainers(new Contenedor(183, null, true));
        bs.addContainers(new Contenedor(243, null, true));
        bs.addContainers(new Contenedor(543, null, true));
        bs.addContainers(new Contenedor(43, null, true));

        // Motrar contenedores
        bs.mostrarContenedores();

        // Calcular contenedores con carga peligrosa sin pais
        int contenedoresDesconocidos = bs.calcularContenedoresPeligrosos();
        System.out.println("Se encuentran " + contenedoresDesconocidos + " contenedores con carga peligrosa sin origen marcado");
    }

}
