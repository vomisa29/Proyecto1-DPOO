package Logica;

import java.util.HashMap;

public class Admin extends Usuario{
	
	protected Servicios servicio;
	protected TarifasHabitacion tarifasHabitacion;
	protected  HashMap<Integer,Habitacion> habitaciones = new HashMap<Integer,Habitacion>();
	
	
	public Admin(String login, String email, String nombre, int acceso, 
			Servicios servicio, TarifasHabitacion tarifasHabitacion, HashMap<Integer, Habitacion> habitaciones) {
		
		super(login,email, nombre, acceso);
		
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

	@Override
	public boolean accederSistema() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void mostrarOpciones() {
		// TODO Auto-generated method stub
		
	}

}