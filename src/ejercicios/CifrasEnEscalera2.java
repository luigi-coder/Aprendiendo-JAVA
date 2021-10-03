package ejercicios;

import java.util.Scanner;

public class CifrasEnEscalera2 {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero;
		
		System.out.println("Ingrese un numero entero de las cifras que quieras: ");
		numero = entrada.next();
		
		int longitud = numero.length()-1;
		
		for(int i=longitud; i>=0; i--) {
			for(int j=i; j<=longitud; j++) {
				System.out.print(numero.charAt(j));
			}
			System.out.println("");
		}
	}

}
