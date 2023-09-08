package Pacientes;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try{
            Paciente paciente = new Paciente("Juan","Perez","12345",new Date(123,8,10));
            //System.out.println(paciente.getFechaInternacion());
            paciente.fechaAlta = new Date(123, 8, 5);
            paciente.darAlta(paciente.getFechaAlta());
        } catch (ClienteException e){
            System.out.println(e);
        }


    }
}
