package ejercicios;

import java.util.Scanner;

public class LongitudDeLaCircunferencia {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese el radio: ");
		int radio = entrada.nextInt();
		
		float longitudCircunferencia = (float) (2 * Math.PI * radio);
		
		float areaDeLaCircunferencia = (float) (Math.PI * Math.pow(radio, 2));
		
		System.out.print("Longitud de la circunferencia: " + longitudCircunferencia +
						 "\n" +
						 "Area de la circunferencia: " + areaDeLaCircunferencia);
		
	}

}
