package Pacientes;

import bancoNacional.Cliente;

public class ClienteException extends Exception{

    public ClienteException(String mensaje){
        super(mensaje);
    }

}
