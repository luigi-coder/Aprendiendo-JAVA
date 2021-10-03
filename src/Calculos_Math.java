
public class Calculos_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Method sqrt
		double raiz = Math.sqrt(9);
				
		System.out.println(
				"Raiz Cuadrada: " + raiz);
				
		// Method round
		double num1 = 5.85;
				
		// Refundicion
		int resultado = (int) Math.round(num1);
				
		System.out.println(
				"Metodo round: " + resultado);
				
		// Metodo pow
		double base = 5;
				
		double exponente = 3;
		// Tambien realizamos refundicion 
		int resultadoo = (int) Math.pow(base, exponente);
				
		System.out.println(
				"Metodo pow: " + resultadoo);
	}

}
