package ejercicios;

import javax.swing.JOptionPane;

public class CentrigradosFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String centigrados;
		centigrados=JOptionPane.showInputDialog("Ingrese los centigrados");
		
		int centigradosParseados = Integer.parseInt(centigrados);
		
		int fahrenheit = 32 + (9 * centigradosParseados/5);
		
		
		JOptionPane.showMessageDialog(null, centigrados + " Centigrados son " + 
											fahrenheit  + " Fahrenheit");
	}

}
