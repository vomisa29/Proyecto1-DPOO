package Logica;

import java.util.HashMap;

public class Admin {
	protected Servicios servicio;
	protected TarifasHabitacion tarifasHabitacion;
	protected  HashMap<Integer,Habitacion> habitaciones = new HashMap<Integer,Habitacion>();
	
	public Admin(Servicios servicio, TarifasHabitacion tarifasHabitacion, HashMap<Integer, Habitacion> habitaciones) {
		super();
		this.servicio = servicio;
		this.tarifasHabitacion = tarifasHabitacion;
		this.habitaciones = habitaciones;
	}
	
	protected void cargarMenu() {//TODO Falta crearlo
		
	}
	
	protected void actualizarTarifas() {//TODO Falta crearlo
		
	}
	
	protected void crearHabitacion() {//TODO Falta crearlo
		
	}
	
	protected void cargarHabitaciones() {//TODO Falta crearlo
		
	}

}