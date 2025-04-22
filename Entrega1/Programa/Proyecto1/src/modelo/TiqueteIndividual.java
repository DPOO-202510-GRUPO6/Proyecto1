package modelo;

import Usuarios.Cliente;

public class TiqueteIndividual extends Tiquete {
    public TiqueteIndividual(String id, String nivelExclusividad, Cliente cliente) {
        super(id, nivelExclusividad, cliente);
    }
    @Override public boolean validar() { return !usado; }
}
