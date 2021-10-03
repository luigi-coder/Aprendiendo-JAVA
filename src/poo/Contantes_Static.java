package poo;

public class Contantes_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados [] empleados = new Empleados[3];
		
		empleados[0] = new Empleados("Javier");
		empleados[1] = new Empleados("Pedro");
		empleados[2] = new Empleados("Santiago");
		
		for(int i=0; i < 3; i++) {
			System.out.println(empleados[i].getDatos());
			
		}
	}
	
}
/* Con Static logramos que los objetos una copia de id, 
 * sino por el contrario que compartan la misma variable */

class Empleados {
	
	// Declarando una variable constante
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
	
	public Empleados(String nombre) {
		
		this.nombre = nombre;
		seccion = "Administracion";
		id = idSiguiente;
		idSiguiente++;
	}
	
	public void setSeccion(String seccion) {
		
		this.seccion = seccion;
	}
	
	public String getDatos() {
		return "Nombre: " + nombre +
				"\n" + 
			   "Seccion: " + seccion +
			   "\n" +
			   "Id: " + id +
			   "\n";
	}
}