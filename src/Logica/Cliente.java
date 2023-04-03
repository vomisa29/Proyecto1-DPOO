package Logica;

import java.util.ArrayList;

public class Cliente {
	protected String nombre;
	protected String documento;
	protected String numTelefono;
	protected int numAcompanantes;
	protected ArrayList<String> serviciosUsados;
	protected Reserva reserva;
	
	public Cliente(String nombre, String documento, String numTelefono, int numAcompanantes,
			ArrayList<String> serviciosUsados, Reserva reserva) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.numTelefono = numTelefono;
		this.numAcompanantes = numAcompanantes;
		this.serviciosUsados = serviciosUsados;
		this.reserva = reserva;
	}
	
	protected void usarServicio(String servicio) {
		this.serviciosUsados.add(servicio);
	}
	
    protected void asignarHabitacion(Habitacion habitacion) {
		this.reserva.habitacion = habitacion;
	}

}
