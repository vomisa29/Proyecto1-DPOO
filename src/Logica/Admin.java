package Logica;

import java.util.HashMap;
import java.util.Scanner;
public class Admin extends Usuario{

	protected Servicios servicio;
	protected TarifasHabitacion tarifasHabitacion;
	protected  HashMap<Integer,Habitacion> habitaciones = new HashMap<Integer,Habitacion>();
	
	
	public Admin(String login, String email, String nombre, int acceso, 
			Servicios servicio, TarifasHabitacion tarifasHabitacion, HashMap<Integer, Habitacion> habitaciones) {
		
		super(login,email, nombre, acceso);
		this.servicio = servicio;
		this.tarifasHabitacion = tarifasHabitacion;
		this.habitaciones = habitaciones;
	}
	
	protected void cargarMenu() {//TODO 
		System.out.println("El menú ha sido cargado");
	}
	
	protected void actualizarTarifas() {//TODO 
		
	}
	
	protected void crearHabitacion() {//TODO
		
	}
	
	protected void cargarHabitaciones() {//TODO
		
	}

	public boolean accederSistema() {
		// TODO Auto-generated method stub
		return false;
	}

	public void mostrarOpciones() {
		Scanner sn =new Scanner(System.in);
		int opcion;
		System.out.println("Bienvenido al menu de opciones, seleccione una:");
        System.out.println("1. Cargar Menu");
        System.out.println("2. Actualizar tarifas ");
        System.out.println("3. Crear Habitación");
        System.out.println("4. Cargar Habitaciones");
		opcion=sn.nextInt();
		switch(opcion){
			case 1:
				cargarMenu();
			case 2:
				actualizarTarifas();
			case 3:
				crearHabitacion();
			case 4:
				cargarHabitaciones();
			}
		}
	}


