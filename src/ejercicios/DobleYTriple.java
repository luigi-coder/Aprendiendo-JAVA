package ejercicios;

import java.util.Scanner;

public class DobleYTriple {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		System.out.println("Ingrese un numero entero: ");
		numero = entrada.nextInt();
		
		int doble = numero*2;
		int triple = numero*3;
		
		System.out.print("Numero inicial: " + numero + "\n" + 
						 "Doble del numero: " + doble + "\n" +
						 "Triple del nnumero: " + triple);
		
	}

}
