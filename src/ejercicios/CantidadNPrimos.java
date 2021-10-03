package ejercicios;
import java.util.Scanner;

public class CantidadNPrimos {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean banderita;
		int cantidadPrimos, j = 0, s = 2, m;
		
		System.out.print("Cuantos numeros primos desea imprimir: ");
		cantidadPrimos = entrada.nextInt();
		
		for(int x = 1; x <= cantidadPrimos; x++) {
			
			banderita= false;
			
			while(!banderita) {
				
				m = 2;
				banderita = true;
				
				while((banderita) && (m < s)) {
					
					if(s % m == 0)
						banderita = false;
					else
						m = m + 1;
				}
				
				if(banderita) {
					
					j++;
					System.out.println(j + ".- es " + s);
					
				}
				s++;
			}
		}
	}

}
;