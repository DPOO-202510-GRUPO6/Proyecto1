package Usuarios;

import java.util.HashSet;
import java.util.Set;

public class Empleado {
    private String id;
    private String nombre;
    private String rol; // cajero, cocinero, operador, servicio general
    private Set<String> capacitaciones; // ids de atracciones entrenadas
    
    public Empleado(String id, String nombre, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.capacitaciones = new HashSet<>();
    }
    public boolean estaCapacitadoEn(String atraccionId) {
        return capacitaciones.contains(atraccionId);
    }
    public void addCapacitacion(String atraccionId) {
        capacitaciones.add(atraccionId);
    }
}
