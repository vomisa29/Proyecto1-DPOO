package Logica;

import java.util.ArrayList;

public class Cliente {
	String nombre;
	String documento;
	String numTelefono;
	int numAcompanantes;
	ArrayList<String> serviciosUsados;
	Reservas reserva;
	
	public Cliente(String nombre, String documento, String numTelefono, int numAcompanantes,
			ArrayList<String> serviciosUsados, Reservas reserva) {
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.numTelefono = numTelefono;
		this.numAcompanantes = numAcompanantes;
		this.serviciosUsados = serviciosUsados;
		this.reserva = reserva;
	}
	
	protected void agregarAGrupo() {//TODO
		
	}
	
	protected void usarServicio() {//TODO
		
	}
	
    protected void asignarHabitacion() {//TODO Falta crearlo
		
	}

}
//TODO Falta crearlo