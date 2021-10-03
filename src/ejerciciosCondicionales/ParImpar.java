package ejerciciosCondicionales;

import java.util.Scanner;

public class ParImpar {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();
		
		String resultado = "";
		
		if(numero%2==0) {
			resultado = "par";
		}else {
			resultado = "Impar";
		}
		
		System.out.println("El numero ingresado es: " + resultado);
	}

}
