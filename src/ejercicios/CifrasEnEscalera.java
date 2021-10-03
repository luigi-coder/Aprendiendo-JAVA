package ejercicios;

import java.util.Scanner;

public class CifrasEnEscalera {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,a,b,c,d,e;
		
		System.out.println("Ingrese un numero entero de las cifras"
				+ " que se te cante el culo: ");
		numero = entrada.nextInt();
		
		a = numero/10000;
		b = (numero/1000)-(a*10);
		c = (numero/100)-((a*100)+(b*10));
		d = (numero/10)-((a*1000)+(b*100)+(c*10));
		e = (numero)-((a*10000)+(b*1000)+(c*100)+(d*10));
		
		for(int i=e; i>=1;i--) {
			for(int j=i; j<=e; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
	}

}
