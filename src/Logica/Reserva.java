package Logica;

public class Reserva {
	protected String nombreCliente;
	protected int numPersonas;
	protected boolean grupo;
	protected TarifasHabitacion tarifaHabitacion;
	protected boolean reservaValida = true;
	
	
	public Reserva(String nombreCliente, int numPersonas, boolean grupo, TarifasHabitacion tarifaHabitacion) {
		
		this.nombreCliente = nombreCliente;
		this.numPersonas = numPersonas;
		this.grupo = grupo;
		this.tarifaHabitacion = tarifaHabitacion;
	}
	
	
	public String getNombreCliente() {
		return nombreCliente;
	}

	public int getNumPersonas() {
		return numPersonas;
	}


	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}


	public boolean isGrupo() {
		return grupo;
	}


	public void setGrupo(boolean grupo) {
		this.grupo = grupo;
	}


	public TarifasHabitacion getTarifaHabitacion() {
		return tarifaHabitacion;
	}


	public void setTarifaHabitacion(TarifasHabitacion tarifaHabitacion) {
		this.tarifaHabitacion = tarifaHabitacion;
	}


	protected void actualizarServicios() {//TODO Falta crearlo
		
	}
	
	
	public boolean isReservaValida() {
		return reservaValida;
	}

	protected void anularReserva() {
		this.reservaValida = false;
	}
}
