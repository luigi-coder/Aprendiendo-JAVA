import javax.swing.JOptionPane;

public class Bucle_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean arroba = false;
		int arroba = 0;
		
		boolean punto = false;
		
		String email = JOptionPane.showInputDialog("Ingrese su email: ");
		
		for(int i=0; i<email.length(); i++) {
			
			if(email.charAt(i)=='@') {
				
				//arroba = true;
				arroba++;
				
			}
			if(email.charAt(i)=='.') {
				
				punto = true;
			}
		}
		
		if(arroba == 1 && punto) {
			
			System.out.println("El email es correcto");
		}else {
			
			System.out.println("El email no es correcto");
		}
	}

}
