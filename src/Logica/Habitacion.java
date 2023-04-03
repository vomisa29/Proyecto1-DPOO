package Logica;

import java.util.ArrayList;

public class Habitacion {
	
	protected int id;
	protected String tipoHabitacion;
	protected TarifasHabitacion tarifa;
	protected boolean balcon;
	protected boolean vista;
	protected boolean cocina;
	protected ArrayList<Cama> camas;
	
	public Habitacion(int id, String tipoHabitacion, TarifasHabitacion tarifa, boolean balcon, boolean vista,
			boolean cocina, ArrayList<Cama> camas) {

		this.id = id;
		this.tipoHabitacion = tipoHabitacion;
		this.tarifa = tarifa;
		this.balcon = balcon;
		this.vista = vista;
		this.cocina = cocina;
		this.camas = camas;
	}
	
	protected void crearHabitacion() {//TODO Falta crearlo
		
	}
	
	protected void actualizarHabitacion() {//TODO Falta crearlo
		
	}
	
	protected void actualizarServicios() {//TODO Falta crearlo - ESTE ESTA COMO RARO, TOCA PENSARLO
		
	}

}
