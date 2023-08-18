package bancoNacional;

public class Cliente {

    private int id;
    private String apellido;
    private int dni;
    private int cuit;

    public Cliente(int id, String apellido, int dni, int cuit) {
        this.id = id;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

}
