package modelo;

import java.util.Date;

import Usuarios.Cliente;

public class FastPass extends Tiquete {
    private String atraccionId;
    private Date fechaUsar;
    public FastPass(String id, Cliente cliente, String atraccionId, Date fecha) {
        super(id, null, cliente);
        this.atraccionId = atraccionId;
        this.fechaUsar = fecha;
    }
    @Override public boolean validar() { return !usado; }
}

