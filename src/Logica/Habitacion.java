package Logica;

import java.util.ArrayList;

public class Habitacion {
	
	protected int id;
	protected String tipoHabitacion;// puede ser Estandar, Suite o Suite Doble
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
	
	protected void actualizarTarifa(TarifasHabitacion tarifa) {//TODO Falta crearlo
		this.tarifa = tarifa;
	}
	
	protected void actualizarCamas(int posACambiar,Cama cama) {
		this.camas.set(posACambiar, cama);
	}
	
	protected void actualizarServicios() {//TODO Falta crearlo - ESTE ESTA COMO RARO, TOCA PENSARLO
		
	}

}
