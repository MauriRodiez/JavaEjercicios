package Pacientes;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws ClienteException
    {
        Date hoy = new Date();
        this.nombre = nombre;
        this.apellido = apellido;
        fechaAlta = null;
        if (fechaInternacion.before(hoy)) {
            this.fechaInternacion = fechaInternacion;
        }else {
            throw new ClienteException("La fecha de internacion no puede ser posterior o igual a la del dia marcado");
        }
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws ClienteException
    {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok");
        else
            throw new ClienteException("No se puede");
    }



}
