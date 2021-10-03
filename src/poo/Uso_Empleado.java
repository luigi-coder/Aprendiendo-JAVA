package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado[] empleados = new Empleado[3];
		
		empleados[0] = new Empleado("Luis",85000, 2000, 10, 04);
		empleados[1] = new Empleado("Andy",90000, 2002, 10, 07);
		empleados[2] = new Empleado("Nayely",100000, 2004, 10, 13);
		
		
		for(Empleado e: empleados) {
			e.setSubirSueldo(5);
		}
		
		for(Empleado e: empleados) {
			System.out.println();
			System.out.println("Nombre: " + e.getNombre() +
							   "\n" +
							   "Sueldo: " + e.getSubirSueldo() +
							   "\n" +
							   "Alta del contrato: " + e.getFechaAlta());
		}
	}
	

}

class Empleado {
	
	private String nombre;
	private double sueldo;
	private Date fecha_alta;
	
	public Empleado (String nombre, 
					 double sueldo, 
					 int anio, 
					 int mes, 
					 int dia) {
		
		this.nombre = nombre;
		this.sueldo = sueldo;
		// Clase predifina GregorianCalendar
		GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
		// Metodo de la clase GregorianCalendar
		fecha_alta = calendario.getTime();
			
	}
	
	public String getNombre() {
		return nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public Date getFechaAlta() {
		return fecha_alta;
	}
	public void setSubirSueldo(double porcentaje) {
		
		double aumentoSueldo = sueldo*porcentaje/100;
		
		sueldo += aumentoSueldo;
	}
	public double getSubirSueldo() {
		return sueldo;
	}
}

































