package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	private String color;
	private boolean asientos_cuero;
	private boolean climatizador;
	
	private int peso_total;
	
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	// Datos que no varian
	public int getRuedas() {
		return ruedas;
	}
	public int getLargo() {
		return largo;
	}
	public int getAncho() {
		return ancho;
	}
	public int getMotor() {
		return motor;
	}
	public int getPeso() {
		return peso_plataforma;
	}
	// Datos que varian 
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setAsientosCuero(
			String asientos_cuero) {
		
		if(asientos_cuero
				.equalsIgnoreCase("Si")) {
			this.asientos_cuero = true;
		}
		if(asientos_cuero
				.equalsIgnoreCase("No")) {
			this.asientos_cuero = false;
		}
	}
	public String getAsientosCuero() {
		if(asientos_cuero==true) {
			return "si";
		}else {
			return "no";
		}
	}
	public void setClimatizador(String climatizador) {
		
		if(climatizador.equalsIgnoreCase("Si")) {
			this.climatizador = true;
		}
		if(climatizador.equalsIgnoreCase("No")) {
			this.climatizador = false;
		}
	}
	public String getClimatizador() {
		if(climatizador == true) {
			return "si";
		}else {
			return "no";
		}
	}
	// Agregando peso al coche
	public void setPesoCoche(int peso_carroceria) {
		
		peso_total = peso_plataforma+peso_carroceria;
		
		if(asientos_cuero) {
			peso_total += 50; //KG
		}
		if(climatizador) {
			peso_total += 20;
		}
	}
	public int getPesoCoche() {
		
		return peso_total;
	}
	
	public int getPrecioCoche() {
		
		// Arranca en 10000
		int precio_final = 10000;
		
		if(asientos_cuero) {
			
			precio_final += 2000;
		}
		if(climatizador) {
			
			precio_final += 1500;
		}
		
		return precio_final;
		
	}
}












