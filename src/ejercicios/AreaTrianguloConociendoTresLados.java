package ejercicios;

import java.util.Scanner;

public class AreaTrianguloConociendoTresLados {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		System.out.println("Ingrese el lado a del triangulo: ");
		a = entrada.nextInt();
		System.out.println("Ingrese el lado b del triangulo: ");
		b = entrada.nextInt();
		System.out.println("Ingrese el lado c del triangulo: ");
		c = entrada.nextInt();
		
		int p = a + b + c ;
		int s = p/2;
		
		double formulaHeron = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("El area de un triangulo conociendo"
				+ " sus tres lados es: " + formulaHeron);
		
		

	}

}
