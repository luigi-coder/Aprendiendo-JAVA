package ejerciciosCondicionales;

import java.util.Scanner;

public class MultiploDe10 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		String resultado = "";
		
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();
		
		
		if(numero%10==0) {
			resultado = "El numero ingresado es multiplo de 10";
		}else {
			resultado = "El numero ingresado no es multiplo de 10";
		}
		
		System.out.println(resultado);
	}

}
