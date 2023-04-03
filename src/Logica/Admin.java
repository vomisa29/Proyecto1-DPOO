package Logica;

import java.util.HashMap;

public class Admin {
	Servicios servicio;
	TarifasHabitacion tarifasHabitacion;
	HashMap<Integer,Habitacion> habitaciones = new HashMap<Integer,Habitacion>();
	
	public Admin(Servicios servicio, TarifasHabitacion tarifasHabitacion, HashMap<Integer, Habitacion> habitaciones) {
		super();
		this.servicio = servicio;
		this.tarifasHabitacion = tarifasHabitacion;
		this.habitaciones = habitaciones;
	}
	
	protected void cargarMenu() {//TODO 
		
	}
	
	protected void actualizarTarifas() {//TODO 
		
	}
	
	protected void crearHabitacion() {//TODO
		
	}
	
	protected void cargarHabitaciones() {//TODO
		
	}

}
//TODO 