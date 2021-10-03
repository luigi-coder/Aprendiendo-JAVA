import javax.swing.JOptionPane;

public class Uso_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String [] paises = new String[5];
		
		for(int i=0; i<paises.length;i++) {
			paises[i] = JOptionPane.showInputDialog(
					"Introduce pais bro: " + (i+1));
		}
		int contador = 0;
		// ForEach
		for(String pais: paises) {
			contador++;
			System.out.println("Pais " + 
					contador + " "+ pais);
		}*/
		
		int[] matrizAleatorios = new int[150];
		
		// Rellenando la matriz XD
		for(int i=0; i<matrizAleatorios.length;i++) {
			matrizAleatorios[i] = (int)Math.round(Math.random()*100);
		}
		
		for(int numeros: matrizAleatorios) {
			System.out.println(numeros);
		}
	}

}
