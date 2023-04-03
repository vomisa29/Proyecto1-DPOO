package Logica;

import java.util.Scanner;

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
		Scanner sn =new Scanner(System.in);
		int opcion;
		System.out.println("Bienvenido al menu de opciones, seleccione una:");
        System.out.println("1. Crear Cliente");
        System.out.println("2. Consultar inventario");
        System.out.println("3. Agregar factura");
        System.out.println("4. Crear empleado");
		opcion=sn.nextInt();
		switch(opcion){
			case 1:
				crearCliente();
			case 2:
				consultarInventario();
			case 3:
				agregarFactura();
			case 4:
				crearEmpleado(login, email, nombre, acceso, id);
			}
		}
		
	
	
	protected void crearCliente() {// TODO Falta crearlo
		
	}
	
    protected void consultarInventario() {//TODO Falta crearlo
		
	}
    
    protected void agregarFactura() {//TODO Falta crearlo
		
	}
    
    protected Empleado crearEmpleado(String login, String email, String nombre, int acceso, int id) {
    	
    	Empleado empleadoNuevo = new Empleado(login, email, nombre, acceso);
    	empleadoNuevo.id = id;
    	return empleadoNuevo;
		
	}
    

}
