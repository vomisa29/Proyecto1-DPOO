package Logica;

public abstract class Usuario{
	protected String login;
	protected String email;
	protected String nombre;
	protected int acceso; //0 para cliente, 1 para empleado, 2 para admin
	
	public Usuario(String login, String email, String nombre, int acceso) {
		
		this.login = login;
		this.email = email;
		this.nombre = nombre;
		this.acceso = acceso;
	}
	
    public abstract boolean accederSistema();{
    	System.out.println("Bienvenido " + this.nombre + "!");
    }
    public abstract void mostrarOpciones();
    
}
