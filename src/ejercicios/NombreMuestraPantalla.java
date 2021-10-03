package ejercicios;

import java.util.Scanner;

public class NombreMuestraPantalla {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		
		System.out.println("Ingrese su nombre porfavor: ");
		nombre = entrada.next();
		
		System.out.println("Buenos dias " + nombre);
	}

}
