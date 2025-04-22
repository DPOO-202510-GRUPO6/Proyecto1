package modelo;

import java.util.List;

import Usuarios.Cliente;

public class AtraccionMecanica extends Atraccion {
    private double alturaMinima, alturaMaxima;
    private double pesoMinimo, pesoMaximo;
    private List<String> contraindicaciones;
    private String nivelRiesgo; // medio, alto
    
    public AtraccionMecanica(String id, String nombre, String nivelExclusividad,
                              int cupoMaximo, int minEmpleados,
                              double alturaMinima, double alturaMaxima,
                              double pesoMinimo, double pesoMaximo,
                              List<String> contraindicaciones,
                              String nivelRiesgo) {
        super(id, nombre, nivelExclusividad, cupoMaximo, minEmpleados);
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.pesoMinimo = pesoMinimo;
        this.pesoMaximo = pesoMaximo;
        this.contraindicaciones = contraindicaciones;
        this.nivelRiesgo = nivelRiesgo;
    }
    @Override
    public boolean cumpleRestricciones(Cliente cliente ) {
        if (cliente.getAltura() > alturaMaxima & cliente.getAltura() < alturaMinima & cliente.getPeso() > pesoMaximo & cliente.getPeso() > pesoMinimo) {
            return true;
        }

        else {
        	return false;
        }
    }
}
