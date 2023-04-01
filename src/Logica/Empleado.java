package Logica;

public class Empleado extends Usuario{
	
	int id;

	public Empleado(String login, String email, String nombre, int acceso) {
		super(login, email, nombre, acceso);
	}

	@Override
	public boolean accederSistema() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void mostrarOpciones() {
		// TODO Auto-generated method stub
		
	}
	
	protected void crearCliente() {// TODO Falta crearlo
		
	}
	
    protected void consultarInventario() {//TODO Falta crearlo
		
	}
    
    protected void agregarFactura() {//TODO Falta crearlo
		
	}
    
    protected Empleado crearEmpleado(String login, String email, String nombre, int acceso, int id) {//TODO Falta crearlo
    	
    	Empleado empleadoNuevo = new Empleado(login, email, nombre, acceso);
    	empleadoNuevo.id = id;
    	return empleadoNuevo;
		
	}
    

}
