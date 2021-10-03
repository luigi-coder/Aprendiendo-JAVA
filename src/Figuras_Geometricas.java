import java.util.Scanner;

import javax.swing.JOptionPane;

public class Figuras_Geometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n" +
				"1: Cuadrado \n" +
				"2: Rectangulo \n" +
				"3: Triangulo \n" +
				"4: Circulo \n");
		
		int figura = entrada.nextInt();
		
		switch(figura) {
		case 1:
			int lado = Integer.parseInt(
						JOptionPane.showInputDialog("Introduce el lado: "));
			System.out.println("Area del cuadrado: " + Math.pow(lado,2));
		break;
		case 2:
			int baseR = Integer.parseInt(
						JOptionPane.showInputDialog("Introduce la base: "));
			int alturaR = Integer.parseInt(
					JOptionPane.showInputDialog("Introduce la altura: "));
			
			System.out.println("Area del rectangulo: " + (baseR*alturaR));
		break;
		case 3:
			int baseT = Integer.parseInt(
					JOptionPane.showInputDialog("Introduce la base: "));
			int alturaT = Integer.parseInt(
					JOptionPane.showInputDialog("Introduce la altura: "));
			
			System.out.println("Area del triangulo: " + (baseT*alturaT)/2);
		break;
		case 4:
			int radio = Integer.parseInt(
					JOptionPane.showInputDialog("Introduce el radio"));
			
			System.out.print("Area del rectangulo: ");
			System.out.printf("%1.2f",(Math.PI*(Math.pow(radio,2))));
		break;
		}
	}

}
