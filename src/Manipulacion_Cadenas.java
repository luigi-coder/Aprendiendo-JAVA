
public class Manipulacion_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// MANIPULA CADENAS I
		String nombre = "Vegeta";
		
		// Metodo Length
		System.out.println(
				"El nombre " + nombre + 
				" tiene " + nombre.length() +
				" letras");
		
		// Metodo CharAt
		System.out.println(
				"La primera letra de " + nombre
				+ " es " + nombre.charAt(0));
		
		// La ultima letra
		int ultimaLetra = nombre.length() - 1;
		
		System.out.println(
				"La ultima letra de " + nombre + 
				" es " + nombre.charAt(ultimaLetra));
		
		// MANIPULA CADENA II
		// J a v a e l m e j o r  l  e  n  g  u  a  j  e
		String frase = "Java el mejor lenguaje";
		
		// Metodo SubString
		String frasePorcion = frase.substring(5, 22);
		String frasePorcion2 = "JavaScript " + frasePorcion;
		System.out.println(frasePorcion2);
		
		// Metodo equals 
		String person1, person2, person3, person4;
		
		person1 = "Goku";
		person2 = "Vegeta";
		
		if(person1.equals(person2)) {
			System.out.println("Personas iguales");
		}else {
			System.out.println("Personas distintas");
		}
		
		person3 = "Piccolo";
		person4 = "piccolo";
		
		if(person3.equalsIgnoreCase(person4)) {
			System.out.println("Personas iguales");
		}else {
			System.out.println("Personas distintas");
		}
	}

}









