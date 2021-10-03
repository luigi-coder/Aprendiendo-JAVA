package ejercicios;

import java.util.Scanner;

public class NumeroDeLaSuerte {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia,mes,anio;
		
		System.out.println("Ingresa el dia que naciste: ");
		dia = entrada.nextInt();
		System.out.println("Ingresa el mes que naciste: ");
		mes = entrada.nextInt();
		System.out.println("Ingresa el año que naciste: ");
		anio = entrada.nextInt();
		
		int numeroSuerte = dia + mes + anio;
		int suma = 0;
		
		while(numeroSuerte > 0) {
			suma = suma + numeroSuerte % 10;
			numeroSuerte = numeroSuerte/10;
		}
		System.out.println(suma);
	}

}
