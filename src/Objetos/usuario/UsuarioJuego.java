package Objetos.usuario;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Double puntaje = 0.0;
    private int nivel = 0;

    public UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getClave() {

        return clave;
    }

    public void setClave(String clave) {

        this.clave = clave;
    }

    // Metodos
    public Double aumentarPuntaje(){
        return puntaje += 1;
    }

    public int subirNivel(){
        return nivel += 1;
    }

    public Double bonus(int valor){
        return puntaje + valor;
    }

}
