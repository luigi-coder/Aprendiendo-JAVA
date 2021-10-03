import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 10000.0;
		
		// printf: imprime con formato
		System.out.printf("%1.2f", x/3);
		System.out.println("");
		
		String numero1 = JOptionPane.showInputDialog(
				"Ingrese un numero");
		
		double numero2 = Integer.parseInt(numero1);
		
		System.out.print(
				"La raiz de " + numero2 +
				" es ");
		
		System.out.printf("%1.2f", Math.sqrt(numero2));
	}

}
