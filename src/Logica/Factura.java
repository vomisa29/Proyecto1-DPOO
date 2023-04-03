package Logica;

import java.util.ArrayList;

public class Factura {
	protected Empleado empleado;
	protected Cliente cliente;
	protected ArrayList<String> serviciosCliente;
	protected String factura;
	
	public Factura(Empleado empleado, Cliente cliente) {

		this.empleado = empleado;
		this.cliente = cliente;
		this.serviciosCliente = this.cliente.serviciosUsados;
	}
	
	protected void crearFactura(){
		String factura = "Nombre Cliente: " + this.cliente.nombre + "\n";
		for (String servicio:serviciosCliente) {
			factura += servicio + "\n";
		}
	    this.factura = factura;
	}
	
	protected void agregarFactura(String servicio) {// TODO Falta crearlo
		this.factura += servicio + "\n";
	}

}
