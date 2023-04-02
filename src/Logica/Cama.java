package Logica;

public class Cama {
	protected int capacidadCama;
	protected String tipoCama;
	protected boolean soloNinos;
	
	public Cama(int capacidadCama, String tipoCama, boolean soloNinos) {
		this.capacidadCama = capacidadCama;
		this.tipoCama = tipoCama;
		this.soloNinos = soloNinos;
	}
	public int getCapacidadCama() {
		return capacidadCama;
	}
	public void setCapacidadCama(int capacidadCama) {
		this.capacidadCama = capacidadCama;
	}
	public String getTipoCama() {
		return tipoCama;
	}
	public void setTipoCama(String tipoCama) {
		this.tipoCama = tipoCama;
	}
	public boolean isSoloNinos() {
		return soloNinos;
	}
	public void setSoloNinos(boolean soloNinos) {
		this.soloNinos = soloNinos;
	}
	
	

}
