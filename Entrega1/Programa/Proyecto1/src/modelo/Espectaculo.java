package modelo;

import java.util.Date;

public class Espectaculo extends ElementoParque {
    private Date fecha;
    private String horario;
    public Espectaculo(String id, String nombre,
                       Date fecha, String horario) {
        super(id, nombre, null);
        this.fecha = fecha;
        this.horario = horario;
    }
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
    
}
