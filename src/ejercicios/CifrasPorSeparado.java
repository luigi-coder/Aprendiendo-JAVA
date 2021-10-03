package ejercicios;

import java.util.Scanner;

public class CifrasPorSeparado {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		System.out.println("Ingrese un numero entero de tres cifras: ");
		numero = entrada.nextInt();
		
		
		int a,b,c;
		a = numero/100; // 2,34 queda 2
		b = (numero/10)-(a*10); // 23,4 queda 23 - (a*10) 20 = 3
		c = numero-(a*100+b*10); // numero - (200 + 30)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
