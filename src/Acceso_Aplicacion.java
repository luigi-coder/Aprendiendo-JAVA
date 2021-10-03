import javax.swing.JOptionPane;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "contrasenia";
		
		String password = "";
		
		while(clave.equalsIgnoreCase(password)==false) {
			
			password=JOptionPane.showInputDialog(
					"Ingrese la contraseña: ");
			
			if(clave.equalsIgnoreCase(password)==false) {
				
				System.out.println("Contraseña incorrecta");
			}
			
		}
		
		System.out.println("Acceso permitido");
	}

}
