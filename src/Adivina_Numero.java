import java.util.Scanner;

public class Adivina_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Numero generado por el programa 
		int numAleatorio = (int)(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		while(numero!=numAleatorio) {
			
			intentos++;
			
			// Numero generado por nosotros
			System.out.println("Introduce un numero: ");
			
			
			numero = entrada.nextInt();
			
			if(numAleatorio < numero) {
				
				System.out.println("Mas bajo");
				
			}else if(numAleatorio > numero) {
				
				System.out.println("Mas alto");
			}
			
		}
		
		System.out.println(
				"Correcto. \n Cantidad de intento : " + intentos);	
		
	}

}
