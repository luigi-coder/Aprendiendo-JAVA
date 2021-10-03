package ejercicios;

import java.util.Scanner;

public class TeoremaPitagoras {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
		System.out.println("Ingrese el primer cateto: ");
		a = entrada.nextInt();
		
		System.out.println("Ingrese el segundo cateto: ");
		b = entrada.nextInt();
		
		int cuadradoA = (int) Math.pow(a, 2);
		int cuadradoB = (int) Math.pow(b, 2);
		
		int hipotenusa = cuadradoA + cuadradoB;
		
		System.out.println("La hipotenusa del triangulo tiene una "
				         + "longitud de " + hipotenusa);
		
		
	}

}
