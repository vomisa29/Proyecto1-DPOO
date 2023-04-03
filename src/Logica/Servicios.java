package Logica;

import java.util.HashMap;

public class Servicios implements Inventario{
	
	protected HashMap<Integer,Habitacion> habitaciones;
	protected boolean spa;
	protected boolean guiaTuristica;
	protected boolean restaurante;
	
	protected boolean consultarServicio(String servicio){
		if (servicio.equals("Spa")) {
			return this.spa;
		}else if (servicio.equals("guiaTuristica")) {
			return this.guiaTuristica;
		}else if (servicio.equals("restaurante")) {
			return this.restaurante;
		}else return false;
	}
	
	@Override
	public void cargarInfoSpa() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cargarInfoGuiaTuristica() {
		// TODO Auto-generated method stub
		
	}

}
//TODO Falta crearlo