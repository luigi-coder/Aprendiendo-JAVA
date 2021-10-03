package ejercicios;

import java.util.Scanner;

public class LecturaNumerosTeclado {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1;
		int numero2;
		
		System.out.println("ingrese un numero: ");
		numero1 = entrada.nextInt();
		
		System.out.println("ingrese otro numero: ");
		numero2 = entrada.nextInt();
		
		System.out.print("Primer numero: " + numero1 + 
						 "\n" + "Segundo numero: " + numero2);
		

	}

}
