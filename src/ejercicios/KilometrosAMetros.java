package ejercicios;

import java.util.Scanner;

public class KilometrosAMetros {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidadKmPorh;
		
		System.out.println("Ingrese la velocidad a calcular: ");
		velocidadKmPorh = entrada.nextInt();
		
		float velocidadKmPorS = velocidadKmPorh * 5/18;
		
		System.out.println("Velocidad Km/h: " + velocidadKmPorh + 
						   "\n" + 
						   "Velocidad m/s: " + velocidadKmPorS);
	}

}
