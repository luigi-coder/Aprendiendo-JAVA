package ejercicios;

import java.util.Scanner;

public class VolumenEsfera {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int logRadio;
		System.out.println("Ingrese la longitud del radio: ");
		logRadio = entrada.nextInt();
		
		double volumen = 1.33*Math.PI*Math.pow(logRadio, 3);
		
		System.out.println("El volumen de la espera es: " + volumen);
		
	}

}
