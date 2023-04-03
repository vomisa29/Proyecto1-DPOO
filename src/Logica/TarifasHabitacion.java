package Logica;

import java.util.ArrayList;

public class TarifasHabitacion{
	protected String tipoHabitacion;
	protected String fechaInicio;
	protected String fechaFin;
	protected float precio;
	ArrayList<String> diasSemana = new ArrayList<String>();
	
	public TarifasHabitacion(String tipoHabitacion, String fechaInicio, String fechaFin, float precio,
			ArrayList<String> diasSemana) {
		super();
		this.tipoHabitacion = tipoHabitacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.precio = precio;
		this.diasSemana = diasSemana;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public ArrayList<String> getDiasSemana() {
		return diasSemana;
	}

	public void setDiasSemana(ArrayList<String> diasSemana) {
		this.diasSemana = diasSemana;
	}
	
	
    
}
