import java.util.Scanner;

public class Entrada_Datos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		System.out.println("Ingrese su edad: ");
		
		String usuario = entrada.nextLine();
		int edad = entrada.nextInt();
		
		System.out.println(
				"Nombre: " + usuario +
				"\n" +
				"Edad: " + edad);
		
	}

}
