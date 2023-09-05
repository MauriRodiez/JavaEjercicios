package BuenosAires;

import java.util.ArrayList;
import java.util.List;

public class Puerto {

    private String nombre;
    private List<Contenedor> listaContainers;

    public Puerto(String nombre) {
        this.nombre = nombre;
        listaContainers = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Contenedor> getListaContainers() {
        return listaContainers;
    }

    public void setListaContainers(List<Contenedor> listaContainers) {
        this.listaContainers = listaContainers;
    }

    // Metodo para agregar contenedores
    public void addContainers(Contenedor contenedor){
        listaContainers.add(contenedor);
    }

    //Metodo para mostrar contenedores ordenados por numero id
    public void mostrarContenedores(){

        listaContainers.sort(Contenedor::compareTo);
        for(Contenedor contenedor : listaContainers){
            System.out.println("Contenedor N°: " + contenedor.getNumero() + " - Pais: "+ contenedor.getPais());
        }
    }
    //Metodo para calcular cantidad de contenedores peligrosos con procedencia desconocida

    public int calcularContenedoresPeligrosos(){
        int containerPeligrosos = 0;

        for(Contenedor container : listaContainers) {
            if (container.isMarcaCargaPeligrosa() && container.getPais() == null) {
                containerPeligrosos++;
            }
        }

        return containerPeligrosos;
    }
}
