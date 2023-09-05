package BuenosAires;

import java.awt.*;

public class Contenedor implements Comparable<Contenedor> {
    private int numero;
    private String pais;
    private boolean marcaCargaPeligrosa;


    public Contenedor(int numero, String pais, boolean marcaCargaPeligrosa) {
        this.numero = numero;
        this.pais = pais;
        this.marcaCargaPeligrosa = marcaCargaPeligrosa;
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


    @Override
    public int compareTo(Contenedor container) {
        return Integer.compare(this.numero, container.numero);
    }
}
