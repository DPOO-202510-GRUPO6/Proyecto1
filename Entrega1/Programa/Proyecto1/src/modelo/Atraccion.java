package modelo;

import Usuarios.Cliente;

public abstract class Atraccion extends ElementoParque {
    protected int cupoMaximo;
    protected int minEmpleados;
    protected boolean disponible;
    
    public Atraccion(String id, String nombre, String nivelExclusividad,
                     int cupoMaximo, int minEmpleados) {
        super(id, nombre, nivelExclusividad);
        this.cupoMaximo = cupoMaximo;
        this.minEmpleados = minEmpleados;
        this.disponible = true;
    }
    
	public int getCupoMaximo() {
		return cupoMaximo;
	}
	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}
	public int getMinEmpleados() {
		return minEmpleados;
	}
	public void setMinEmpleados(int minEmpleados) {
		this.minEmpleados = minEmpleados;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public boolean cumpleRestricciones(Cliente cliente) {
		return false;
	}
   
}
