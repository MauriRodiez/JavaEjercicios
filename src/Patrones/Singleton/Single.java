package Patrones.Singleton;

public class Single {

    private static Single instance = new Single();
    private String nombre;

    private Single(){

    }

    public static Single getInstance(){
        return instance;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
