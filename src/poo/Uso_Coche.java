package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche Renault = new Coche();
		Renault.setColor("Rojo");
		Renault.setAsientosCuero("Si");
		Renault.setClimatizador("Si");
		Renault.setPesoCoche(500);
		
		System.out.println(
				"Ruedas: " + Renault.getRuedas() + 
				"\n" +
				"Largo: " + Renault.getLargo() + 
				"\n" +  
				"Ancho: " + Renault.getAncho() +
				"\n" + 
				"Motor: " + Renault.getMotor() + 
				"\n" + 
				"Peso Inicial: " + Renault.getPeso() + 
				"\n" +
				"Color: " + Renault.getColor() +
				"\n" +
				"Asientos de cuero: " + Renault.getAsientosCuero() +
				"\n" +
				"Climatizador: " + Renault.getClimatizador() +
				"\n" +
				"Peso Total: " + Renault.getPesoCoche() +
				"\n" + 
				"Precio Final: " + Renault.getPrecioCoche());
		
	}

}
