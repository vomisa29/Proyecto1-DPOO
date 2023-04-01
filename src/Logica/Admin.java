package Logica;

import java.util.HashMap;

public class Admin {
	Servicios servicio;
	TarifasHabitacion tarifasHabitacion;
	HashMap<Integer,Habitaciones> habitaciones = new HashMap<Integer,Habitaciones>();
	
	public Admin(Servicios servicio, TarifasHabitacion tarifasHabitacion, HashMap<Integer, Habitaciones> habitaciones) {
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
//TODO Falta crearlo