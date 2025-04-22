package modelo;

import Usuarios.Cliente;

public abstract class Tiquete {
    protected String id;
    protected String nivelExclusividad;
    protected Cliente cliente;
    protected boolean usado;
    
    public Tiquete(String id, String nivelExclusividad, Cliente cliente) {
        this.id = id;
        this.nivelExclusividad = nivelExclusividad;
        this.cliente = cliente;
        this.usado = false;
    }
    public abstract boolean validar();
    public void usar() { usado = true; }
}
