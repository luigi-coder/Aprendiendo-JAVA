import javax.swing.JOptionPane;

public class Entrada_Datos02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String usuario = JOptionPane.showInputDialog(
				"Introduce tu nombre de usuario: ");
		
		String edad = JOptionPane.showInputDialog(
				"Introduce tu edad: ");
		
		// Convertir edad de String a int
		int convertirEdad = Integer.parseInt(edad);
		
		JOptionPane.showMessageDialog(null, 
				"Usuario: " + usuario +
				"\n" +
				"Edad: " + convertirEdad);
	}

}
