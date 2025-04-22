package modelo;

import java.util.Date;

import Usuarios.Cliente;

public class TiqueteTemporada extends Tiquete {
    private Date fechaInicio, fechaFin;
    public TiqueteTemporada(String id, String nivelExclusividad, Cliente cliente,
                             Date inicio, Date fin) {
        super(id, nivelExclusividad, cliente);
        this.fechaInicio = inicio;
        this.fechaFin = fin;
    }
    @Override
    public boolean validar() {
        Date hoy = new Date();
        return !usado && hoy.compareTo(fechaInicio) >= 0 && hoy.compareTo(fechaFin) <= 0;
    }
}

