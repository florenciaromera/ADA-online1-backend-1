package ar.com.ada.abmcliente.excepciones;

import ar.com.ada.abmcliente.entities.Cliente;

public class ClienteNombreException extends ClienteInfoException {

    public ClienteNombreException(Cliente cliente, String mensaje) {
        super(cliente, mensaje);
        // TODO Auto-generated constructor stub
    }
    
}