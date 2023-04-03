package Logica;

import java.util.ArrayList;

public class Grupo{
	protected Cliente clientePrincipal;
	protected ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	
	
	public Grupo(Cliente clientePrincipal, ArrayList<Cliente> listaClientes) {
		this.clientePrincipal = clientePrincipal;
		this.listaClientes = listaClientes;
	}
	
	public void editarHistorialGrupo () {

	}
	public void generarFacturaGrupo() {

	}
}
