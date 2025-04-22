package modelo;

import Usuarios.Cliente;

public class AtraccionCultural extends Atraccion {
    private int edadMinima;
    public AtraccionCultural(String id, String nombre, String nivelExclusividad,
                              int cupoMaximo, int minEmpleados,
                              int edadMinima) {
        super(id, nombre, nivelExclusividad, cupoMaximo, minEmpleados);
        this.edadMinima = edadMinima;
    }
    @Override
    public boolean cumpleRestricciones(Cliente cliente) {
        return cliente.getEdad() >= edadMinima;
    }
}
