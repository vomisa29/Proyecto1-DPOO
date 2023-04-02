package Logica;

import java.util.ArrayList;

public class Factura {
	protected Empleado empleado;
	protected Cliente cliente;
	protected ArrayList<String> serviciosCliente;
	
	public Factura(Empleado empleado, Cliente cliente, ArrayList<String> serviciosCliente) {

		this.empleado = empleado;
		this.cliente = cliente;
		this.serviciosCliente = serviciosCliente;
	}
	
	protected void crearFactura(){// TODO Falta crearlo
		
	}
	
	protected void agregarFactura() {// TODO Falta crearlo
		
	}

}
