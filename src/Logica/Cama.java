package Logica;

public class Cama {
	protected int capacidadCama;
	protected String tipoCama;// puede ser Estandar, Suite o Suite Doble
	protected boolean soloNinos = false;
	protected int[] precios = new int[3];
	// pos 0: precio estandar, pos 1: precio suite, pos 2: precio suite doble
	
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
	
	protected int calcularPrecioCama() {
		int precio = 0;
		if (this.tipoCama.equals("Estandar")) {
			precio += this.precios[0];	
		}else if (this.tipoCama.equals("Suite")) {		
			precio += this.precios[1];		
		}else if(this.tipoCama.equals("Suite Doble")) {		
			precio += this.precios[2];
		}
		
	return precio;
	}
	
	

}
