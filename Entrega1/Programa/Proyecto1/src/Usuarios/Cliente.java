package Usuarios;

import java.util.ArrayList;
import java.util.List;

import modelo.Tiquete;

public class Cliente {
    private String id;
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private List<Tiquete> tiquetes;
    
    public Cliente(String id, String nombre, int edad, int altura, int peso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tiquetes = new ArrayList<>();
        this.altura = altura;
        this.peso = peso;
    }
    public double getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getEdad() { return edad; }
    public void agregarTiquete(Tiquete t) { tiquetes.add(t); }
}
