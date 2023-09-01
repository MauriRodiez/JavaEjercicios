package BuenosAires;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Contenedor {
    private int numero;
    private String pais;
    private boolean marcaCargaPeligrosa;
    private List<Contenedor> listaContainers;

    public Contenedor(int numero, String pais, boolean marcaCargaPeligrosa) {
        this.numero = numero;
        this.pais = pais;
        this.marcaCargaPeligrosa = marcaCargaPeligrosa;
        listaContainers = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isMarcaCargaPeligrosa() {
        return marcaCargaPeligrosa;
    }

    public void setMarcaCargaPeligrosa(boolean marcaCargaPeligrosa) {
        this.marcaCargaPeligrosa = marcaCargaPeligrosa;
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

        Collections.sort(listaContainers);
        for(Contenedor contenedor : listaContainers){
            System.out.println("Contenedor N°: " + getNumero() + "Pais: " + getPais() + "Carga peligrosa " + isMarcaCargaPeligrosa() );
        }
    }
    //Metodo para calcular cantidad de contenedores peligrosos con procedencia desconocida
}
