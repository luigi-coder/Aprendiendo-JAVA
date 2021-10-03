import java.util.Scanner;

public class Evaluando_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaracion e inicializacion de variables
		int primerDado=0, segundoDado=0, tercerDado=0;
		
		Scanner entrada = new Scanner(System.in);
		
		// Entrada
		System.out.println("Lanza el primer dado: ");
		primerDado = entrada.nextInt();
		
		System.out.println("Lanza el segundo dado: ");
		segundoDado = entrada.nextInt();
		
		System.out.println("lanza el tercer dado: ");
		tercerDado = entrada.nextInt();
		
		// Proceso
		if((primerDado == 6) 
		&& (segundoDado == 6) 
		&& (tercerDado == 6)) {
			
			System.out.println("Excelente");
			
		}else if((primerDado==6&&segundoDado==6) 
		&& (segundoDado==6 && tercerDado==6)
		&& (primerDado==6 && tercerDado==6)) {
			
			System.out.println("Muy Bien");
		}else if((primerDado==6)
		||(segundoDado==6)
		||(tercerDado==6)) {
			
			System.out.println("Regular");
		}else {
			System.out.println("Pesimo Bro");
		}
		
	}

}
