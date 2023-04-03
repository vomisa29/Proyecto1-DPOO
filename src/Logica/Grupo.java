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
	protected void agregarAGrupo(Cliente cliente) {
		this.listaClientes.add(cliente);
	}

	public Cliente getClientePrincipal() {
		return clientePrincipal;
	}

	public void setClientePrincipal(Cliente clientePrincipal) {
		this.clientePrincipal = clientePrincipal;
	}
}
