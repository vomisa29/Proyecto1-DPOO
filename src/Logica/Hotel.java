package Logica;

import java.util.ArrayList;

public class Hotel {
	protected ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	protected ArrayList<Factura> facturas = new ArrayList<Factura>();
	protected Servicios servicios;
	
	public Hotel(ArrayList<Usuario> usuarios, ArrayList<Factura> facturas, Servicios servicios) {
		super();
		this.usuarios = usuarios;
		this.facturas = facturas;
		this.servicios = servicios;
	}

}
