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
	
	protected void agregarAGrupo() {//TODO Falta crearlo
		
	}
	
	protected void usarServicio() {//TODO Falta crearlo
		
	}
	
    protected void asignarHabitacion() {//TODO Falta crearlo
		
	}

}
