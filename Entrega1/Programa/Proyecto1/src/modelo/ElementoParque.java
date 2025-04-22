package modelo;

public abstract class ElementoParque {
    protected String id;
    protected String nombre;
    protected String nivelExclusividad; // Familiar, Oro, Diamante
    
    public ElementoParque(String id, String nombre, String nivelExclusividad) {
        this.id = id;
        this.nombre = nombre;
        this.nivelExclusividad = nivelExclusividad;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNivelExclusividad() {
		return nivelExclusividad;
	}

	public void setNivelExclusividad(String nivelExclusividad) {
		this.nivelExclusividad = nivelExclusividad;
	}
    
}

