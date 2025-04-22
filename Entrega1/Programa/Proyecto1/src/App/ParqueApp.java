package App;

import Servicio.GestorAtraccion;
import Servicio.GestorEmpleado;
import Servicio.GestorVenta;

public class ParqueApp {
    public static void main(String[] args) {
        GestorEmpleado gestorE = new GestorEmpleado();
        GestorAtraccion gestorA = new GestorAtraccion();
        GestorVenta gestorT = new GestorVenta();
        // aquí se pueden invocar métodos de prueba por consola
    }
}